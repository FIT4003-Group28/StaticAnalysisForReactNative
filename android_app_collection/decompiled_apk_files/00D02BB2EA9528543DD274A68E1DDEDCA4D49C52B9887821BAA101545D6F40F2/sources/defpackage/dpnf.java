package defpackage;
/* compiled from: PG */
/* renamed from: dpnf  reason: default package */
/* loaded from: classes6.dex */
public final class dpnf extends dsqw<dpnf, dpne> implements dssk {
    public static final dpnf c;
    private static volatile dssr<dpnf> d;
    public int a;
    public int b;

    static {
        dpnf dpnfVar = new dpnf();
        c = dpnfVar;
        dsqw.cc(dpnf.class, dpnfVar);
    }

    private dpnf() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"a", "b", dpng.a});
            }
            if (i2 == 3) {
                return new dpnf();
            }
            if (i2 == 4) {
                return new dpne();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dpnf> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dpnf.class) {
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
