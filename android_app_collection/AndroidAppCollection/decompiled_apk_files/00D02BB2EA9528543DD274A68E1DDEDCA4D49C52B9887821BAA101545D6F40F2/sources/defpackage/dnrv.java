package defpackage;
/* compiled from: PG */
/* renamed from: dnrv  reason: default package */
/* loaded from: classes6.dex */
public final class dnrv extends dsqw<dnrv, dnru> implements dssk {
    public static final dnrv c;
    private static volatile dssr<dnrv> d;
    public int a;
    public dqfw b;

    static {
        dnrv dnrvVar = new dnrv();
        c = dnrvVar;
        dsqw.cc(dnrv.class, dnrvVar);
    }

    private dnrv() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"a", "b"});
            }
            if (i2 == 3) {
                return new dnrv();
            }
            if (i2 == 4) {
                return new dnru();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dnrv> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dnrv.class) {
                    dssrVar = d;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(c);
                        d = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
