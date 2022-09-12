package defpackage;
/* compiled from: PG */
/* renamed from: vxx  reason: default package */
/* loaded from: classes.dex */
public final class vxx {
    public static final dcdc<dqvj> a = dcdc.h(dqvj.DRIVE, dqvj.TAXI, dqvj.TWO_WHEELER);
    public static final dcdc<dqvj> b = dcdc.i(dqvj.DRIVE, dqvj.WALK, dqvj.BICYCLE, dqvj.TWO_WHEELER);
    public static final dqvj c = dqvj.DRIVE;

    public static dqvj a(bvjj bvjjVar) {
        return dqvj.c(bvjjVar.s(bvjk.bN, c.k));
    }

    public static void b(bvjj bvjjVar, dqvj dqvjVar) {
        bvjjVar.W(bvjk.bN, dqvjVar.k);
    }

    public static boolean c(dqvj dqvjVar) {
        return dqvjVar == dqvj.BICYCLE || dqvjVar == dqvj.WALK;
    }

    public static boolean d(@dzsi dqvj dqvjVar, btvo btvoVar) {
        if (dqvjVar == null) {
            return false;
        }
        int ordinal = dqvjVar.ordinal();
        if (ordinal == 0 || ordinal == 1 || ordinal == 2) {
            return true;
        }
        if (ordinal == 5) {
            return btvoVar.getTwoWheelerParameters().c;
        }
        return false;
    }

    public static boolean e(dqvj dqvjVar) {
        dqvj dqvjVar2 = dqvj.DRIVE;
        int ordinal = dqvjVar.ordinal();
        return ordinal == 0 || ordinal == 1 || ordinal == 2 || ordinal == 5;
    }

    public static boolean f(dqvj dqvjVar) {
        return b.contains(dqvjVar);
    }

    public static boolean g(dqvj dqvjVar) {
        dqvj dqvjVar2 = dqvj.DRIVE;
        int ordinal = dqvjVar.ordinal();
        return ordinal == 0 || ordinal == 1 || ordinal == 2 || ordinal == 3 || ordinal == 5 || ordinal == 7;
    }

    public static boolean h(dqvj dqvjVar) {
        return dqvjVar == dqvj.DRIVE || dqvjVar == dqvj.TWO_WHEELER;
    }

    public static boolean i(dqvj dqvjVar) {
        return dqvjVar == dqvj.DRIVE || dqvjVar == dqvj.TWO_WHEELER || dqvjVar == dqvj.TAXI;
    }
}
