package defpackage;
/* compiled from: PG */
/* renamed from: dory  reason: default package */
/* loaded from: classes6.dex */
public enum dory implements dsrb {
    UNSPECIFIED(0),
    USER_PROVIDED(1),
    AUTO_FILLED(2),
    GEOCODED(3),
    REVERSE_GEOCODED(4),
    SUGGEST_SELECTION(5),
    PRE_FILLED(6),
    FEEDBACK_SERVICE(7);
    
    public final int i;

    dory(int i) {
        this.i = i;
    }

    public static dory b(int i) {
        switch (i) {
            case 0:
                return UNSPECIFIED;
            case 1:
                return USER_PROVIDED;
            case 2:
                return AUTO_FILLED;
            case 3:
                return GEOCODED;
            case 4:
                return REVERSE_GEOCODED;
            case 5:
                return SUGGEST_SELECTION;
            case 6:
                return PRE_FILLED;
            case 7:
                return FEEDBACK_SERVICE;
            default:
                return null;
        }
    }

    public static dsrd c() {
        return dorx.a;
    }

    @Override // defpackage.dsrb
    public final int a() {
        return this.i;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.i);
    }
}
