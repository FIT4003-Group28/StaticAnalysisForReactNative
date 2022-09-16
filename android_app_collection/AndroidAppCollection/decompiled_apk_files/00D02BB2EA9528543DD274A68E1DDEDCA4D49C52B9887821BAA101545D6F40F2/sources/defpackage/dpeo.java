package defpackage;
/* compiled from: PG */
/* renamed from: dpeo  reason: default package */
/* loaded from: classes6.dex */
public final class dpeo extends dsqw<dpeo, dpel> implements dssk {
    public static final dpeo e;
    private static volatile dssr<dpeo> f;
    public int a;
    public int b;
    public int c;
    public int d;

    static {
        dpeo dpeoVar = new dpeo();
        e = dpeoVar;
        dsqw.cc(dpeo.class, dpeoVar);
    }

    private dpeo() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002င\u0001\u0003င\u0002", new Object[]{"a", "b", dpen.c(), "c", "d"});
            }
            if (i2 == 3) {
                return new dpeo();
            }
            if (i2 == 4) {
                return new dpel();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dpeo> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dpeo.class) {
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
