package defpackage;
/* compiled from: PG */
/* renamed from: dneb  reason: default package */
/* loaded from: classes.dex */
public final class dneb extends dsqw<dneb, dnea> implements dssk {
    public static final dneb f;
    private static volatile dssr<dneb> g;
    public int a;
    public int b;
    public int c;
    public int d;
    public int e;

    static {
        dneb dnebVar = new dneb();
        f = dnebVar;
        dsqw.cc(dneb.class, dnebVar);
    }

    private dneb() {
        dssu<Object> dssuVar = dssu.b;
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(f, "\u0001\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0000\u0000\u0001ဌ\u0000\u0003င\u0002\u0004င\u0003\u0005င\u0004", new Object[]{"a", "b", drsv.a, "c", "d", "e"});
            }
            if (i2 == 3) {
                return new dneb();
            }
            if (i2 == 4) {
                return new dnea();
            }
            if (i2 == 5) {
                return f;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dneb> dssrVar = g;
            if (dssrVar == null) {
                synchronized (dneb.class) {
                    dssrVar = g;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(f);
                        g = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
