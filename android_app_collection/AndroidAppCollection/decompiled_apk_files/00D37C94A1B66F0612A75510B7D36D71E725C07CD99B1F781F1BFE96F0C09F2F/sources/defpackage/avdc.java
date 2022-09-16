package defpackage;
/* compiled from: PG */
/* renamed from: avdc  reason: default package */
/* loaded from: classes2.dex */
public enum avdc implements aopm {
    SURVEY_DISPLAY_TRIGGER_UI_EVENT_UNSPECIFIED(0),
    SURVEY_DISPLAY_TRIGGER_UI_EVENT_APP_FOREGROUNDED(1);
    
    private static final aopn c = new anfn(5);
    private final int e;

    avdc(int i) {
        this.e = i;
    }

    public static aopo a() {
        return avcd.h;
    }

    public static avdc b(int i) {
        if (i != 0) {
            if (i == 1) {
                return SURVEY_DISPLAY_TRIGGER_UI_EVENT_APP_FOREGROUNDED;
            }
            return null;
        }
        return SURVEY_DISPLAY_TRIGGER_UI_EVENT_UNSPECIFIED;
    }

    @Override // defpackage.aopm
    public final int getNumber() {
        return this.e;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(getNumber());
    }
}
