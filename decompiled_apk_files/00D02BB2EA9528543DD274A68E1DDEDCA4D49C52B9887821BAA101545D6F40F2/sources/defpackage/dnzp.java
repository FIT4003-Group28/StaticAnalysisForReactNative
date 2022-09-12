package defpackage;
/* compiled from: PG */
/* renamed from: dnzp  reason: default package */
/* loaded from: classes6.dex */
public final class dnzp extends dsqw<dnzp, dnzo> implements dssk {
    public static final dnzp c;
    private static volatile dssr<dnzp> d;
    public int a;
    public int b = 50;

    static {
        dnzp dnzpVar = new dnzp();
        c = dnzpVar;
        dsqw.cc(dnzp.class, dnzpVar);
    }

    private dnzp() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001င\u0000", new Object[]{"a", "b"});
            }
            if (i2 == 3) {
                return new dnzp();
            }
            if (i2 == 4) {
                return new dnzo();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dnzp> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dnzp.class) {
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
