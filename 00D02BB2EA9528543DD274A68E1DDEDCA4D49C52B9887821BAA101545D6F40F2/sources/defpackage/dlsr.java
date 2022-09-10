package defpackage;
/* compiled from: PG */
/* renamed from: dlsr  reason: default package */
/* loaded from: classes6.dex */
public final class dlsr extends dsqw<dlsr, dlsq> implements dssk {
    public static final dlsr b;
    private static volatile dssr<dlsr> d;
    public long a;
    private int c;

    static {
        dlsr dlsrVar = new dlsr();
        b = dlsrVar;
        dsqw.cc(dlsr.class, dlsrVar);
    }

    private dlsr() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဂ\u0000", new Object[]{"c", "a"});
            }
            if (i2 == 3) {
                return new dlsr();
            }
            if (i2 == 4) {
                return new dlsq();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dlsr> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dlsr.class) {
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
