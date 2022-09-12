package defpackage;
/* compiled from: PG */
/* renamed from: vxd  reason: default package */
/* loaded from: classes7.dex */
public enum vxd {
    UNKNOWN,
    CAR,
    RICKSHAW,
    RIDESHARE,
    TWO_WHEELER,
    BICYCLE;

    public static vxd c(dpdy dpdyVar) {
        dqvj dqvjVar = dqvj.DRIVE;
        dpec dpecVar = dpdyVar.c;
        if (dpecVar == null) {
            dpecVar = dpec.o;
        }
        dqvj c = dqvj.c(dpecVar.b);
        if (c == null) {
            c = dqvj.DRIVE;
        }
        int ordinal = c.ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                return BICYCLE;
            }
            if (ordinal == 5) {
                return TWO_WHEELER;
            }
            if (ordinal != 7) {
                return UNKNOWN;
            }
            int i = dpdyVar.a;
            return (i & 256) == 0 ? (i & 128) != 0 ? RIDESHARE : UNKNOWN : RICKSHAW;
        }
        return CAR;
    }

    public static vxd d(amuq amuqVar) {
        return c(amuqVar.a);
    }

    public final boolean a() {
        dqvj dqvjVar = dqvj.DRIVE;
        int ordinal = ordinal();
        if (ordinal != 0) {
            if (ordinal != 1 && ordinal != 2 && ordinal != 3 && ordinal != 4 && ordinal != 5) {
                throw new AssertionError();
            }
            return true;
        }
        return false;
    }

    @dzsi
    public final dqvj b() {
        if (!a()) {
            return null;
        }
        dqvj dqvjVar = dqvj.DRIVE;
        int ordinal = ordinal();
        if (ordinal == 0) {
            return null;
        }
        if (ordinal == 1 || ordinal == 2 || ordinal == 3) {
            return dqvj.DRIVE;
        }
        if (ordinal == 4) {
            return dqvj.TWO_WHEELER;
        }
        if (ordinal == 5) {
            return dqvj.BICYCLE;
        }
        throw new AssertionError();
    }
}
