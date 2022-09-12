package defpackage;
/* compiled from: PG */
/* renamed from: djjj  reason: default package */
/* loaded from: classes6.dex */
public final class djjj extends dsqw<djjj, djjb> implements dssk {
    public static final djjj e;
    private static volatile dssr<djjj> f;
    public int a;
    public int b;
    public djjg c;
    public djjg d;

    static {
        djjj djjjVar = new djjj();
        e = djjjVar;
        dsqw.cc(djjj.class, djjjVar);
    }

    private djjj() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new Object[]{"a", "b", djjd.c(), "c", "d"});
            }
            if (i2 == 3) {
                return new djjj();
            }
            if (i2 == 4) {
                return new djjb();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<djjj> dssrVar = f;
            if (dssrVar == null) {
                synchronized (djjj.class) {
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
