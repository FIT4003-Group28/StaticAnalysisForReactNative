package defpackage;
/* compiled from: PG */
/* renamed from: aoiq  reason: default package */
/* loaded from: classes.dex */
public enum aoiq implements aopm {
    FEATURE_UNSPECIFIED(0),
    USER_FEEDBACK_IHNR(1),
    IN_APP_PROMPTS(2),
    NO_TRAY_NOTIFICATIONS(3),
    USER_FEEDBACK_IHNR_ACTION_BUTTONS(5);
    
    public final int f;

    aoiq(int i) {
        this.f = i;
    }

    @Override // defpackage.aopm
    public final int getNumber() {
        return this.f;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f);
    }
}
