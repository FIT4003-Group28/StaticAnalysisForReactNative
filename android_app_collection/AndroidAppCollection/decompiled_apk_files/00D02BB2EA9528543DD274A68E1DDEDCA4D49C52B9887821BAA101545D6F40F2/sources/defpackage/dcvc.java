package defpackage;
/* compiled from: PG */
/* renamed from: dcvc  reason: default package */
/* loaded from: classes5.dex */
public final class dcvc {
    public static final double a = 1.0d / Math.sqrt(2.0d);
    public static final double b = Math.sqrt(2.0d);
    public static final double c;
    public static final dcwa d;
    private static final int[] e;
    private static final int[][] f;
    private static final dcwa[] g;

    static {
        double d2 = 1.0d;
        do {
            d2 /= 2.0d;
        } while ((d2 / 2.0d) + 1.0d != 1.0d);
        c = d2;
        d = new dcwa(-0.00999946643502502d, 0.002592454260932412d, 0.999946643502502d);
        e = new int[]{1, 0, 0, 3};
        f = new int[][]{new int[]{0, 1, 3, 2}, new int[]{0, 2, 3, 1}, new int[]{3, 2, 0, 1}, new int[]{3, 1, 0, 2}};
        g = new dcwa[]{new dcwa(1.0d, 0.0053d, 0.00457d), new dcwa(0.012d, 1.0d, 0.00457d), new dcwa(0.012d, 0.0053d, 1.0d)};
    }

    public static int a(int i) {
        boolean z = false;
        if (i >= 0 && i < 4) {
            z = true;
        }
        dbsk.a(z);
        return e[i];
    }

    public static int b(int i, int i2) {
        return f[i][i2];
    }

    public static boolean c(dcwa dcwaVar) {
        return Math.abs(dcwaVar.i() + (-1.0d)) <= c * 5.0d;
    }

    public static dcwa d(dcwa dcwaVar, dcwa dcwaVar2) {
        dcwa e2 = dcwa.e(dcwa.a(dcwaVar2, dcwaVar), dcwa.b(dcwaVar2, dcwaVar));
        return !e2.p(dcwa.a) ? e2 : e(dcwaVar);
    }

    public static dcwa e(dcwa dcwaVar) {
        int m = dcwa.m(dcwaVar.h, dcwaVar.i, dcwaVar.j) - 1;
        if (m < 0) {
            m = 2;
        }
        return dcwa.f(dcwa.e(dcwaVar, g[m]));
    }
}
