package defpackage;
/* compiled from: PG */
/* renamed from: dnuy  reason: default package */
/* loaded from: classes6.dex */
public final class dnuy extends dsqw<dnuy, dnux> implements dssk {
    public static final dnuy d;
    private static volatile dssr<dnuy> f;
    public dqpe a;
    public int b;
    public dqbe c;
    private int e;

    static {
        dnuy dnuyVar = new dnuy();
        d = dnuyVar;
        dsqw.cc(dnuy.class, dnuyVar);
    }

    private dnuy() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဌ\u0001\u0003ဉ\u0002", new Object[]{"e", "a", "b", drbs.a, "c"});
            }
            if (i2 == 3) {
                return new dnuy();
            }
            if (i2 == 4) {
                return new dnux();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dnuy> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dnuy.class) {
                    dssrVar = f;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(d);
                        f = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
