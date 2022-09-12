package defpackage;
/* compiled from: PG */
/* renamed from: ddkj  reason: default package */
/* loaded from: classes.dex */
public final class ddkj extends dsqw<ddkj, ddki> implements dssk {
    public static final ddkj g;
    private static volatile dssr<ddkj> h;
    public int a;
    public int b;
    public int c = 1;
    public int d;
    public boolean e;
    public boolean f;

    static {
        ddkj ddkjVar = new ddkj();
        g = ddkjVar;
        dsqw.cc(ddkj.class, ddkjVar);
    }

    private ddkj() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001င\u0000\u0002ဌ\u0001\u0003ဌ\u0002\u0004ဇ\u0003\u0005ဇ\u0004", new Object[]{"a", "b", "c", ddjv.a, "d", ddkd.a, "e", "f"});
            }
            if (i2 == 3) {
                return new ddkj();
            }
            if (i2 == 4) {
                return new ddki();
            }
            if (i2 == 5) {
                return g;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<ddkj> dssrVar = h;
            if (dssrVar == null) {
                synchronized (ddkj.class) {
                    dssrVar = h;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(g);
                        h = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
