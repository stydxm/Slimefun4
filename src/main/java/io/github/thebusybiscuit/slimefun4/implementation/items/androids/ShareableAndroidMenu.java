package io.github.thebusybiscuit.slimefun4.implementation.items.androids;

import io.github.thebusybiscuit.cscorelib2.item.CustomItem;
import io.github.thebusybiscuit.cscorelib2.skull.SkullItem;
import me.mrCookieSlime.CSCoreLibPlugin.general.Inventory.ChestMenu;
import me.mrCookieSlime.Slimefun.api.BlockStorage;
import org.apache.commons.lang.Validate;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.OfflinePlayer;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.SkullMeta;

import javax.annotation.Nonnull;
import javax.annotation.ParametersAreNonnullByDefault;
import java.util.HashSet;
import java.util.UUID;

/**
 * This menu handle add/remove trusted players of {@link ProgrammableAndroid}
 *
 * @author StarWishsama
 *
 */
public class ShareableAndroidMenu {
    private final HashSet<UUID> cache = new HashSet<>();

    @ParametersAreNonnullByDefault
    public void openShareableManager(@Nonnull Player p, @Nonnull Block b, @Nonnull ProgrammableAndroid android) {
        ChestMenu menu = new ChestMenu(ChatColor.DARK_AQUA + "机器人权限管理");
        menu.setEmptySlotsClickable(false);

        menu.addItem(0, new CustomItem(Instruction.START.getItem(), "添加玩家", "", "&7\u21E8 &e左键 &7添加一个信任的玩家"));
        menu.addMenuClickHandler(0, (pl, slot, item, action) -> {
            BlockStorage.getInventory(b).open(pl);
            return false;
        });

        for (int i = 0; i < cache.size(); i++) {
            ItemStack skull = getSkullByName(cache.iterator().next());
            menu.addItem(Math.min(36, 9 + i), new CustomItem(skull));
            menu.addMenuClickHandler(Math.min(36, 9 + i), )
        }

        menu.addItem(9, new CustomItem(getSkullByName(cache.iterator().next())), (pl, slot, item, action) -> {
            return false;
        });

        menu.open(p);
    }

    @ParametersAreNonnullByDefault
    protected boolean canOpen(@Nonnull OfflinePlayer p) {
        Validate.notNull(p, "Check player cannot be null!");

        return cache.contains(p.getUniqueId());
    }

    protected void addTrustedPlayer(@Nonnull Block android, @Nonnull OfflinePlayer adder, @Nonnull String username) {
        Validate.notNull(android, "The android cannot be null");
        Validate.notNull(username, "The trusted player's name cannot be null");
        Validate.notNull(adder, "The adder cannot be null");

        OfflinePlayer p = Bukkit.getPlayer(username);

        if (p == null) {
            adder.getPlayer().closeInventory();
            adder.getPlayer().sendMessage("找不到你想添加的玩家!");
            return;
        }

        BlockStorage.addBlockInfo(android.);
    }

    private ItemStack getSkullByName(@Nonnull UUID uuid) {
        Validate.notNull(uuid, "The player's UUID cannot be null");

        OfflinePlayer p = Bukkit.getPlayer(uuid);

        if (p == null) {
            return null;
        }

        ItemStack skull = SkullItem.fromPlayer(p);

        SkullMeta meta = (SkullMeta) skull.getItemMeta();
        meta.setDisplayName(p.getName());

        return skull;
    }
}
