package defpackage;
/* compiled from: PG */
/* renamed from: dnrp  reason: default package */
/* loaded from: classes6.dex */
public final class dnrp extends dsqw<dnrp, dnro> implements dssk {
    public static final dnrp c;
    private static volatile dssr<dnrp> d;
    public int a;
    public dnsc b;

    static {
        dnrp dnrpVar = new dnrp();
        c = dnrpVar;
        dsqw.cc(dnrp.class, dnrpVar);
    }

    private dnrp() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002ဉ\u0001", new Object[]{"a", "b"});
            }
            if (i2 == 3) {
                return new dnrp();
            }
            if (i2 == 4) {
                return new dnro();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dnrp> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dnrp.class) {
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
