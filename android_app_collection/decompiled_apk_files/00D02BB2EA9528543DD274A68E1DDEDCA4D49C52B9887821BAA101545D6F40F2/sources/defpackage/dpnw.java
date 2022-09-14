package defpackage;
/* compiled from: PG */
/* renamed from: dpnw  reason: default package */
/* loaded from: classes6.dex */
public final class dpnw extends dsqw<dpnw, dpnv> implements dssk {
    public static final dpnw b;
    private static volatile dssr<dpnw> d;
    public dqdk a;
    private int c;

    static {
        dpnw dpnwVar = new dpnw();
        b = dpnwVar;
        dsqw.cc(dpnw.class, dpnwVar);
    }

    private dpnw() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"c", "a"});
            }
            if (i2 == 3) {
                return new dpnw();
            }
            if (i2 == 4) {
                return new dpnv();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dpnw> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dpnw.class) {
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
