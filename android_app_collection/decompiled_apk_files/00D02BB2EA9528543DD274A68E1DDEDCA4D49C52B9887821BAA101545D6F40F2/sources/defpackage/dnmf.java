package defpackage;
/* compiled from: PG */
/* renamed from: dnmf  reason: default package */
/* loaded from: classes6.dex */
public final class dnmf extends dsqw<dnmf, dnme> implements dssk {
    public static final dnmf b;
    private static volatile dssr<dnmf> d;
    public String a = "";
    private int c;

    static {
        dnmf dnmfVar = new dnmf();
        b = dnmfVar;
        dsqw.cc(dnmf.class, dnmfVar);
    }

    private dnmf() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"c", "a"});
            }
            if (i2 == 3) {
                return new dnmf();
            }
            if (i2 == 4) {
                return new dnme();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dnmf> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dnmf.class) {
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
