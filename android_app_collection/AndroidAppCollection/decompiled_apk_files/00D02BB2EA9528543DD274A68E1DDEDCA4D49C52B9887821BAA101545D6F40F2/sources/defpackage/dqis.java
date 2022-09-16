package defpackage;
/* compiled from: PG */
/* renamed from: dqis  reason: default package */
/* loaded from: classes6.dex */
public enum dqis implements dsrb {
    UNKNOWN_ANCHOR(0),
    TOP_LEFT(1),
    TOP_RIGHT(2),
    BOTTOM_LEFT(3),
    BOTTOM_RIGHT(4),
    CENTER(5),
    CENTER_TOP(6),
    CENTER_BOTTOM(7),
    CENTER_LEFT(8),
    CENTER_RIGHT(9);
    
    private final int k;

    dqis(int i) {
        this.k = i;
    }

    public static dqis b(int i) {
        switch (i) {
            case 0:
                return UNKNOWN_ANCHOR;
            case 1:
                return TOP_LEFT;
            case 2:
                return TOP_RIGHT;
            case 3:
                return BOTTOM_LEFT;
            case 4:
                return BOTTOM_RIGHT;
            case 5:
                return CENTER;
            case 6:
                return CENTER_TOP;
            case 7:
                return CENTER_BOTTOM;
            case 8:
                return CENTER_LEFT;
            case 9:
                return CENTER_RIGHT;
            default:
                return null;
        }
    }

    public static dsrd c() {
        return dqir.a;
    }

    @Override // defpackage.dsrb
    public final int a() {
        return this.k;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.k);
    }
}
