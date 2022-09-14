package defpackage;
/* compiled from: PG */
/* renamed from: dngf  reason: default package */
/* loaded from: classes6.dex */
public enum dngf implements dsrb {
    UNKNOWN_CONNECTOR_TYPE(0),
    OTHER(1),
    J_1772(2),
    MENNEKES(3),
    CHADEMO(4),
    CCS_COMBO_1(5),
    CCS_COMBO_2(6),
    DEPRECATED_TESLA_ROADSTER(7),
    DEPRECATED_TESLA_S_HPWC(8),
    TESLA(9),
    GB_T(10),
    WALL_OUTLET(11);
    
    private final int m;

    dngf(int i) {
        this.m = i;
    }

    public static dngf b(int i) {
        switch (i) {
            case 0:
                return UNKNOWN_CONNECTOR_TYPE;
            case 1:
                return OTHER;
            case 2:
                return J_1772;
            case 3:
                return MENNEKES;
            case 4:
                return CHADEMO;
            case 5:
                return CCS_COMBO_1;
            case 6:
                return CCS_COMBO_2;
            case 7:
                return DEPRECATED_TESLA_ROADSTER;
            case 8:
                return DEPRECATED_TESLA_S_HPWC;
            case 9:
                return TESLA;
            case 10:
                return GB_T;
            case 11:
                return WALL_OUTLET;
            default:
                return null;
        }
    }

    public static dsrd c() {
        return dnge.a;
    }

    @Override // defpackage.dsrb
    public final int a() {
        return this.m;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.m);
    }
}
