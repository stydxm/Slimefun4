package io.github.thebusybiscuit.slimefun4.core.services.localization;

public enum SupportedLanguage {

    ENGLISH("en", "a1701f21835a898b20759fb30a583a38b994abf60d3912ab4ce9f2311e74f72"),
    GERMAN("de", "5e7899b4806858697e283f084d9173fe487886453774626b24bd8cfecc77b3f"),
    FRENCH("fr", "51269a067ee37e63635ca1e723b676f139dc2dbddff96bbfef99d8b35c996bc"),
    ITALIAN("it", "85ce89223fa42fe06ad65d8d44ca412ae899c831309d68924dfe0d142fdbeea4"),
    SPANISH("es", "32bd4521983309e0ad76c1ee29874287957ec3d96f8d889324da8c887e485ea8"),
    RUSSIAN("ru", "16eafef980d6117dabe8982ac4b4509887e2c4621f6a8fe5c9b735a83d775ad"),
    POLISH("pl", "921b2af8d2322282fce4a1aa4f257a52b68e27eb334f4a181fd976bae6d8eb"),
    SWEDISH("sv", "e910904bff9c86f6ed47688e9429c26e8d9c5d5743bd3ebb8e6f5040be192998"),
    DUTCH("nl", "c23cf210edea396f2f5dfbced69848434f93404eefeabf54b23c073b090adf"),
    CZECH("cs", "48152b7334d7ecf335e47a4f35defbd2eb6957fc7bfe94212642d62f46e61e"),
    PORTUGESE_PORTUGAL("pt", "ebd51f4693af174e6fe1979233d23a40bb987398e3891665fafd2ba567b5a53a"),
    PORTUGESE_BRAZIL("pt-BR", "9a46475d5dcc815f6c5f2859edbb10611f3e861c0eb14f088161b3c0ccb2b0d9"),
    HUNGARIAN("hu", "4a9c3c4b6c5031332dd2bfece5e31e999f8deff55474065cc86993d7bdcdbd0"),
    LATVIAN("lv", "f62a4938b59447f996b5ed94101df07429d1ad34776d591ffc6fd75b79473c"),
    GREEK("el", "1514de6dd2b7682b1d3ebcd10291ae1f021e3012b5c8beffeb75b1819eb4259d"),
    SLOVAK("sk", "6c72a8c115a1fb669a25715c4d15f22136ac4c2452784e4894b3d56bc5b0b9"),
    VIETNAMESE("vi", "8a57b9d7dd04169478cfdb8d0b6fd0b8c82b6566bb28371ee9a7c7c1671ad0bb"),
    INDONESIAN("id", "5db2678ccaba7934412cb97ee16d416463a392574c5906352f18dea42895ee"),
    CHINESE_CHINA("zh-CN", "7f9bc035cdc80f1ab5e1198f29f3ad3fdd2b42d9a69aeb64de990681800b98dc"),
    CHINESE_TAIWAN("zh-TW", "8a57b9d7dd04169478cfdb8d0b6fd0b8c82b6566bb28371ee9a7c7c1671ad0bb"),
    HEBREW("he", "1ba086a2cc7272cf5ba49c80248546c22e5ef1bab54120e8a8e5d9e75b6a");

    private final String id;
    private final String textureHash;

    SupportedLanguage(String id, String textureHash) {
        this.id = id;
        this.textureHash = textureHash;
    }

    public String getId() {
        return id;
    }

    public String getTexture() {
        return textureHash;
    }
}
