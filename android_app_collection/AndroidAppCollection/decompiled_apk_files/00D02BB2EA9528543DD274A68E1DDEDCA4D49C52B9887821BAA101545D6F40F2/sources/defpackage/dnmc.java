package defpackage;
/* compiled from: PG */
/* renamed from: dnmc  reason: default package */
/* loaded from: classes6.dex */
public final class dnmc extends dsqw<dnmc, dnmb> implements dssk {
    public static final dnmc b;
    private static volatile dssr<dnmc> d;
    public dgsl a;
    private int c;

    static {
        dnmc dnmcVar = new dnmc();
        b = dnmcVar;
        dsqw.cc(dnmc.class, dnmcVar);
    }

    private dnmc() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"c", "a"});
            }
            if (i2 == 3) {
                return new dnmc();
            }
            if (i2 == 4) {
                return new dnmb();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dnmc> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dnmc.class) {
                    dssrVar = d;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(b);
                        d = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
