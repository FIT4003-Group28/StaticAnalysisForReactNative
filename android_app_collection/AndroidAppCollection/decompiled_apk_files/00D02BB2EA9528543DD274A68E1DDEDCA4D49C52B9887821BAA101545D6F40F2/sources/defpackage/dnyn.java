package defpackage;
/* compiled from: PG */
/* renamed from: dnyn  reason: default package */
/* loaded from: classes6.dex */
public final class dnyn extends dsqw<dnyn, dnym> implements dssk {
    public static final dnyn c;
    private static volatile dssr<dnyn> d;
    public int a;
    public boolean b;

    static {
        dnyn dnynVar = new dnyn();
        c = dnynVar;
        dsqw.cc(dnyn.class, dnynVar);
    }

    private dnyn() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဇ\u0000", new Object[]{"a", "b"});
            }
            if (i2 == 3) {
                return new dnyn();
            }
            if (i2 == 4) {
                return new dnym();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dnyn> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dnyn.class) {
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
