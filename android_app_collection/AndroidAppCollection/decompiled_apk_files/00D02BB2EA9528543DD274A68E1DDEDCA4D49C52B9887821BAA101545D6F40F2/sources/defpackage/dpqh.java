package defpackage;
/* compiled from: PG */
/* renamed from: dpqh  reason: default package */
/* loaded from: classes6.dex */
public final class dpqh extends dsqw<dpqh, dpqe> implements dssk {
    public static final dpqh c;
    private static volatile dssr<dpqh> d;
    public int a;
    public int b;

    static {
        dpqh dpqhVar = new dpqh();
        c = dpqhVar;
        dsqw.cc(dpqh.class, dpqhVar);
    }

    private dpqh() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"a", "b", dpqg.c()});
            }
            if (i2 == 3) {
                return new dpqh();
            }
            if (i2 == 4) {
                return new dpqe();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dpqh> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dpqh.class) {
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
