package defpackage;
/* compiled from: PG */
/* renamed from: dnmr  reason: default package */
/* loaded from: classes6.dex */
public final class dnmr extends dsqw<dnmr, dnmq> implements dssk {
    public static final dnmr b;
    private static volatile dssr<dnmr> c;
    public dsrj<dnmp> a = dssu.b;

    static {
        dnmr dnmrVar = new dnmr();
        b = dnmrVar;
        dsqw.cc(dnmr.class, dnmrVar);
    }

    private dnmr() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", dnmp.class});
            }
            if (i2 == 3) {
                return new dnmr();
            }
            if (i2 == 4) {
                return new dnmq();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dnmr> dssrVar = c;
            if (dssrVar == null) {
                synchronized (dnmr.class) {
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
