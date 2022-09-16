package defpackage;
/* compiled from: PG */
/* renamed from: avdb  reason: default package */
/* loaded from: classes2.dex */
public enum avdb implements aopm {
    SURVEY_DISPLAY_TRIGGER_PLAYBACK_EVENT_UNSPECIFIED(0),
    SURVEY_DISPLAY_TRIGGER_PLAYBACK_EVENT_CONTENT_VIDEO_START(1),
    SURVEY_DISPLAY_TRIGGER_PLAYBACK_EVENT_AD_FINISH(4),
    SURVEY_DISPLAY_TRIGGER_PLAYBACK_EVENT_PREROLL_AD_START(5),
    SURVEY_DISPLAY_TRIGGER_PLAYBACK_EVENT_PREROLL_AD_FINISH(2),
    SURVEY_DISPLAY_TRIGGER_PLAYBACK_EVENT_MIDROLL_AD_START(6),
    SURVEY_DISPLAY_TRIGGER_PLAYBACK_EVENT_MIDROLL_AD_FINISH(7),
    SURVEY_DISPLAY_TRIGGER_PLAYBACK_EVENT_PLAYBACK_FINISH(3);
    
    private static final aopn i = new anfn(4);
    private final int k;

    avdb(int i2) {
        this.k = i2;
    }

    public static aopo a() {
        return avcd.g;
    }

    public static avdb b(int i2) {
        switch (i2) {
            case 0:
                return SURVEY_DISPLAY_TRIGGER_PLAYBACK_EVENT_UNSPECIFIED;
            case 1:
                return SURVEY_DISPLAY_TRIGGER_PLAYBACK_EVENT_CONTENT_VIDEO_START;
            case 2:
                return SURVEY_DISPLAY_TRIGGER_PLAYBACK_EVENT_PREROLL_AD_FINISH;
            case 3:
                return SURVEY_DISPLAY_TRIGGER_PLAYBACK_EVENT_PLAYBACK_FINISH;
            case 4:
                return SURVEY_DISPLAY_TRIGGER_PLAYBACK_EVENT_AD_FINISH;
            case 5:
                return SURVEY_DISPLAY_TRIGGER_PLAYBACK_EVENT_PREROLL_AD_START;
            case 6:
                return SURVEY_DISPLAY_TRIGGER_PLAYBACK_EVENT_MIDROLL_AD_START;
            case 7:
                return SURVEY_DISPLAY_TRIGGER_PLAYBACK_EVENT_MIDROLL_AD_FINISH;
            default:
                return null;
        }
    }

    @Override // defpackage.aopm
    public final int getNumber() {
        return this.k;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(getNumber());
    }
}
