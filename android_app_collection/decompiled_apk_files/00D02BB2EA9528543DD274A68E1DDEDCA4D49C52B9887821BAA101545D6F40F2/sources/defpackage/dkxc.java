package defpackage;
/* compiled from: PG */
/* renamed from: dkxc  reason: default package */
/* loaded from: classes.dex */
public enum dkxc implements dsrb {
    UNKNOWN_LABEL(0),
    CRASH(1),
    SPEED_CAMERA(2),
    SPEED_TRAP(3),
    JAM(4),
    CONSTRUCTION(5),
    LANE_CLOSURE(6),
    DISABLED_VEHICLE(7),
    OBJECT_ON_ROAD(8),
    INCORRECT_SPEED_LIMIT(9),
    SUSPECTED_CLOSURE(10);
    
    private final int l;

    dkxc(int i) {
        this.l = i;
    }

    public static dkxc b(int i) {
        switch (i) {
            case 0:
                return UNKNOWN_LABEL;
            case 1:
                return CRASH;
            case 2:
                return SPEED_CAMERA;
            case 3:
                return SPEED_TRAP;
            case 4:
                return JAM;
            case 5:
                return CONSTRUCTION;
            case 6:
                return LANE_CLOSURE;
            case 7:
                return DISABLED_VEHICLE;
            case 8:
                return OBJECT_ON_ROAD;
            case 9:
                return INCORRECT_SPEED_LIMIT;
            case 10:
                return SUSPECTED_CLOSURE;
            default:
                return null;
        }
    }

    public static dsrd c() {
        return dkxb.a;
    }

    @Override // defpackage.dsrb
    public final int a() {
        return this.l;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.l);
    }
}
