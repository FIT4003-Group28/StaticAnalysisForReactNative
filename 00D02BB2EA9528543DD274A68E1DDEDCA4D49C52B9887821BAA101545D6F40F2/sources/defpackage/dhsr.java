package defpackage;
/* compiled from: PG */
/* renamed from: dhsr  reason: default package */
/* loaded from: classes6.dex */
public final class dhsr extends dsqw<dhsr, dhsq> implements dssk {
    public static final dhsr b;
    private static volatile dssr<dhsr> c;
    public dsrj<dhsp> a = dssu.b;

    static {
        dhsr dhsrVar = new dhsr();
        b = dhsrVar;
        dsqw.cc(dhsr.class, dhsrVar);
    }

    private dhsr() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", dhsp.class});
            }
            if (i2 == 3) {
                return new dhsr();
            }
            if (i2 == 4) {
                return new dhsq();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dhsr> dssrVar = c;
            if (dssrVar == null) {
                synchronized (dhsr.class) {
                    dssrVar = c;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(b);
                        c = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
