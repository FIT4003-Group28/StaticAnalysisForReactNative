package defpackage;
/* compiled from: PG */
/* renamed from: dnmm  reason: default package */
/* loaded from: classes6.dex */
public final class dnmm extends dsqw<dnmm, dnml> implements dssk {
    public static final dnmm b;
    private static volatile dssr<dnmm> d;
    public String a = "";
    private int c;

    static {
        dnmm dnmmVar = new dnmm();
        b = dnmmVar;
        dsqw.cc(dnmm.class, dnmmVar);
    }

    private dnmm() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002ဈ\u0001", new Object[]{"c", "a"});
            }
            if (i2 == 3) {
                return new dnmm();
            }
            if (i2 == 4) {
                return new dnml();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dnmm> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dnmm.class) {
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
