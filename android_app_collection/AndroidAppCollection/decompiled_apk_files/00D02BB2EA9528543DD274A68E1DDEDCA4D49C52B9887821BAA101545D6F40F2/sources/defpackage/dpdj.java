package defpackage;
/* compiled from: PG */
/* renamed from: dpdj  reason: default package */
/* loaded from: classes6.dex */
public final class dpdj extends dsqw<dpdj, dpdg> implements dssk {
    public static final dpdj e;
    private static volatile dssr<dpdj> g;
    public int a;
    public int c;
    private int f;
    public int b = -1;
    public int d = -1;

    static {
        dpdj dpdjVar = new dpdj();
        e = dpdjVar;
        dsqw.cc(dpdj.class, dpdjVar);
    }

    private dpdj() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(e, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003ဌ\u0002\u0004င\u0003", new Object[]{"f", "a", "b", "c", dpdh.a, "d"});
            }
            if (i2 == 3) {
                return new dpdj();
            }
            if (i2 == 4) {
                return new dpdg();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dpdj> dssrVar = g;
            if (dssrVar == null) {
                synchronized (dpdj.class) {
                    dssrVar = g;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(e);
                        g = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
