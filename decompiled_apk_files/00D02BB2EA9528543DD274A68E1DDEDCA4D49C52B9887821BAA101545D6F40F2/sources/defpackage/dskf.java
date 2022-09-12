package defpackage;
/* compiled from: PG */
/* renamed from: dskf  reason: default package */
/* loaded from: classes6.dex */
public enum dskf implements dsrb {
    ACTIVITY_CONTROLS_SETTING_UNKNOWN(0),
    WEB_AND_APP_ACTIVITY(1),
    VOICE_AND_AUDIO_ACTIVITY(2),
    SUPPLEMENTAL_WEB_AND_APP_ACTIVITY(3),
    DEVICE_INFORMATION(4),
    DEVICE_APPS(9),
    DEVICE_CONTACTS(10),
    YOUTUBE_WATCH_HISTORY(5),
    YOUTUBE_SEARCH_HISTORY(6),
    YOUTUBE(8),
    SEARCH_CUSTOMIZATION(11),
    ADS_PERSONALIZATION(12),
    LOCATION_HISTORY(13),
    SUPERVISED_USER_APP_ACTIVITY(14),
    PAYMENTS_DATA_USE(15),
    PAYMENTS_1P_DATA_USE(16),
    PAYMENTS_READY_TO_PAY(19),
    PAYMENTS_MARKETING(20),
    PAYMENTS_CREDITWORTHINESS(21),
    EECC_IN_PRODUCT_DATA_USE(17),
    EECC_CROSS_PRODUCT_DATA_USE(18),
    ASSISTANT(7);
    
    public final int w;

    dskf(int i) {
        this.w = i;
    }

    public static dskf b(int i) {
        switch (i) {
            case 0:
                return ACTIVITY_CONTROLS_SETTING_UNKNOWN;
            case 1:
                return WEB_AND_APP_ACTIVITY;
            case 2:
                return VOICE_AND_AUDIO_ACTIVITY;
            case 3:
                return SUPPLEMENTAL_WEB_AND_APP_ACTIVITY;
            case 4:
                return DEVICE_INFORMATION;
            case 5:
                return YOUTUBE_WATCH_HISTORY;
            case 6:
                return YOUTUBE_SEARCH_HISTORY;
            case 7:
                return ASSISTANT;
            case 8:
                return YOUTUBE;
            case 9:
                return DEVICE_APPS;
            case 10:
                return DEVICE_CONTACTS;
            case 11:
                return SEARCH_CUSTOMIZATION;
            case 12:
                return ADS_PERSONALIZATION;
            case 13:
                return LOCATION_HISTORY;
            case 14:
                return SUPERVISED_USER_APP_ACTIVITY;
            case 15:
                return PAYMENTS_DATA_USE;
            case 16:
                return PAYMENTS_1P_DATA_USE;
            case 17:
                return EECC_IN_PRODUCT_DATA_USE;
            case 18:
                return EECC_CROSS_PRODUCT_DATA_USE;
            case 19:
                return PAYMENTS_READY_TO_PAY;
            case 20:
                return PAYMENTS_MARKETING;
            case 21:
                return PAYMENTS_CREDITWORTHINESS;
            default:
                return null;
        }
    }

    public static dsrd c() {
        return dske.a;
    }

    @Override // defpackage.dsrb
    public final int a() {
        return this.w;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.w);
    }
}
