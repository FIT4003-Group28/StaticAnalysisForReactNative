package defpackage;
/* compiled from: PG */
/* renamed from: djsr  reason: default package */
/* loaded from: classes.dex */
public final class djsr extends dsqw<djsr, djsq> implements dssk {
    public static final djsr e;
    private static volatile dssr<djsr> g;
    public boolean a;
    public boolean b;
    public dsrf c = dsqz.b;
    public boolean d;
    private int f;

    static {
        djsr djsrVar = new djsr();
        e = djsrVar;
        dsqw.cc(djsr.class, djsrVar);
    }

    private djsr() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(e, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ဇ\u0000\u0002\u0016\u0003ဇ\u0001\u0004ဇ\u0002", new Object[]{"f", "a", "c", "b", "d"});
            }
            if (i2 == 3) {
                return new djsr();
            }
            if (i2 == 4) {
                return new djsq();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<djsr> dssrVar = g;
            if (dssrVar == null) {
                synchronized (djsr.class) {
                    dssrVar = g;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(e);
                        g = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
