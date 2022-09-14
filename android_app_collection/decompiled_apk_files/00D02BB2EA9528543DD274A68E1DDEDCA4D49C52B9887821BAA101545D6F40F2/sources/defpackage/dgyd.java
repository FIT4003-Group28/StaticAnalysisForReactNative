package defpackage;
/* compiled from: PG */
/* renamed from: dgyd  reason: default package */
/* loaded from: classes6.dex */
public enum dgyd implements dsrb {
    FLOW_ID_UNSPECIFIED(0),
    DEMO_APP(1),
    PLAY_MUSIC_ON_APP_START(2),
    PLAY_MUSIC_ON_SETTINGS(3),
    GPAY_APP_NOTIFICATION_SETTINGS(4),
    MAPS_TIMELINE_ONBOARDING(12),
    PHOTOS_ASSISTANT_CARD(5),
    SAFETYHUB_SHARING_ONBOARDING(6),
    OPINION_REWARDS_ON_APP_START(7),
    OPINION_REWARDS_CARD(8),
    YOUTUBE_MUSIC_HOME_DIRECT_ASK(9),
    YOUTUBE_MUSIC_HOME_PROMO(10),
    OPINION_REWARDS_ON_CONSENT_CHECK(11),
    MAPS_HOME_SCREEN_CONTRIBUTE_TAB(13),
    MAPS_PERSONAL_SCORE_SETUP(14),
    MAPS_YOUR_PLACES_VISITIED(15),
    MAPS_ULR_OOB_TUTORIAL(16),
    MAPS_CREATOR_ZONE(17),
    MAPS_LH_PROMO1350786(18),
    MAPS_COMMUTE_SETUP(19),
    MAPS_FALLBACK_FLOW(20);
    
    public final int v;

    dgyd(int i) {
        this.v = i;
    }

    public static dgyd b(int i) {
        switch (i) {
            case 0:
                return FLOW_ID_UNSPECIFIED;
            case 1:
                return DEMO_APP;
            case 2:
                return PLAY_MUSIC_ON_APP_START;
            case 3:
                return PLAY_MUSIC_ON_SETTINGS;
            case 4:
                return GPAY_APP_NOTIFICATION_SETTINGS;
            case 5:
                return PHOTOS_ASSISTANT_CARD;
            case 6:
                return SAFETYHUB_SHARING_ONBOARDING;
            case 7:
                return OPINION_REWARDS_ON_APP_START;
            case 8:
                return OPINION_REWARDS_CARD;
            case 9:
                return YOUTUBE_MUSIC_HOME_DIRECT_ASK;
            case 10:
                return YOUTUBE_MUSIC_HOME_PROMO;
            case 11:
                return OPINION_REWARDS_ON_CONSENT_CHECK;
            case 12:
                return MAPS_TIMELINE_ONBOARDING;
            case 13:
                return MAPS_HOME_SCREEN_CONTRIBUTE_TAB;
            case 14:
                return MAPS_PERSONAL_SCORE_SETUP;
            case 15:
                return MAPS_YOUR_PLACES_VISITIED;
            case 16:
                return MAPS_ULR_OOB_TUTORIAL;
            case 17:
                return MAPS_CREATOR_ZONE;
            case 18:
                return MAPS_LH_PROMO1350786;
            case 19:
                return MAPS_COMMUTE_SETUP;
            case 20:
                return MAPS_FALLBACK_FLOW;
            default:
                return null;
        }
    }

    public static dsrd c() {
        return dgyc.a;
    }

    @Override // defpackage.dsrb
    public final int a() {
        return this.v;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.v);
    }
}
