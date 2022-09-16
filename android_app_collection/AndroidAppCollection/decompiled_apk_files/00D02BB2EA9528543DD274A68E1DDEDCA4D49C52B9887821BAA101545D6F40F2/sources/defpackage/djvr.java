package defpackage;
/* compiled from: PG */
/* renamed from: djvr  reason: default package */
/* loaded from: classes6.dex */
public enum djvr implements dsrb {
    UNKNOWN_DAY(0),
    SUNDAY(1),
    MONDAY(2),
    TUESDAY(3),
    WEDNESDAY(4),
    THURSDAY(5),
    FRIDAY(6),
    SATURDAY(7);
    
    private final int i;

    djvr(int i) {
        this.i = i;
    }

    public static djvr b(int i) {
        switch (i) {
            case 0:
                return UNKNOWN_DAY;
            case 1:
                return SUNDAY;
            case 2:
                return MONDAY;
            case 3:
                return TUESDAY;
            case 4:
                return WEDNESDAY;
            case 5:
                return THURSDAY;
            case 6:
                return FRIDAY;
            case 7:
                return SATURDAY;
            default:
                return null;
        }
    }

    public static dsrd c() {
        return djvq.a;
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
