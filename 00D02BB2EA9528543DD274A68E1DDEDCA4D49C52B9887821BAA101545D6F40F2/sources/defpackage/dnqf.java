package defpackage;
/* compiled from: PG */
/* renamed from: dnqf  reason: default package */
/* loaded from: classes6.dex */
public final class dnqf extends dsqw<dnqf, dnpr> implements dssk {
    public static final dnqf c;
    private static volatile dssr<dnqf> d;
    public int a;
    public dnqe b;

    static {
        dnqf dnqfVar = new dnqf();
        c = dnqfVar;
        dsqw.cc(dnqf.class, dnqfVar);
    }

    private dnqf() {
        dssu<Object> dssuVar = dssu.b;
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"a", "b"});
            }
            if (i2 == 3) {
                return new dnqf();
            }
            if (i2 == 4) {
                return new dnpr();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dnqf> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dnqf.class) {
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
