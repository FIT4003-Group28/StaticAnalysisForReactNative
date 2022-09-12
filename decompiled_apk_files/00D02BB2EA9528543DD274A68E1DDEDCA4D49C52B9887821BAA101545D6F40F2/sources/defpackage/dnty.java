package defpackage;
/* compiled from: PG */
/* renamed from: dnty  reason: default package */
/* loaded from: classes.dex */
public final class dnty extends dsqw<dnty, dntx> implements dssk {
    public static final dnty c;
    private static volatile dssr<dnty> d;
    public int a;
    public boolean b;

    static {
        dnty dntyVar = new dnty();
        c = dntyVar;
        dsqw.cc(dnty.class, dntyVar);
    }

    private dnty() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဇ\u0000", new Object[]{"a", "b"});
            }
            if (i2 == 3) {
                return new dnty();
            }
            if (i2 == 4) {
                return new dntx();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dnty> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dnty.class) {
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
