package defpackage;
/* compiled from: PG */
/* renamed from: drvx  reason: default package */
/* loaded from: classes6.dex */
public final class drvx extends dsqw<drvx, drvv> implements dssk {
    public static final drvx e;
    private static volatile dssr<drvx> f;
    public int a;
    public int b;
    public int c;
    public int d;

    static {
        drvx drvxVar = new drvx();
        e = drvxVar;
        dsqw.cc(drvx.class, drvxVar);
    }

    private drvx() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001\u0003ဌ\u0002", new Object[]{"a", "b", drvw.a, "c", drvs.c(), "d", drvs.c()});
            }
            if (i2 == 3) {
                return new drvx();
            }
            if (i2 == 4) {
                return new drvv();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<drvx> dssrVar = f;
            if (dssrVar == null) {
                synchronized (drvx.class) {
                    dssrVar = f;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(e);
                        f = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
