package defpackage;
/* compiled from: PG */
/* renamed from: dszc  reason: default package */
/* loaded from: classes6.dex */
public final class dszc extends dsqw<dszc, dszb> implements dssk {
    public static final dszc e;
    private static volatile dssr<dszc> f;
    public int a;
    public double b;
    public double c;
    public double d;

    static {
        dszc dszcVar = new dszc();
        e = dszcVar;
        dsqw.cc(dszc.class, dszcVar);
    }

    private dszc() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001က\u0000\u0002က\u0001\u0003က\u0002", new Object[]{"a", "b", "c", "d"});
            }
            if (i2 == 3) {
                return new dszc();
            }
            if (i2 == 4) {
                return new dszb();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dszc> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dszc.class) {
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
