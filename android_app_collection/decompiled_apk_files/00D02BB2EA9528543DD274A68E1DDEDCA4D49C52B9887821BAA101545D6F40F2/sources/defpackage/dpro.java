package defpackage;
/* compiled from: PG */
/* renamed from: dpro  reason: default package */
/* loaded from: classes6.dex */
public final class dpro extends dsqw<dpro, dprl> implements dssk {
    public static final dpro c;
    private static volatile dssr<dpro> e;
    public dprn a;
    public int b;
    private int d;

    static {
        dpro dproVar = new dpro();
        c = dproVar;
        dsqw.cc(dpro.class, dproVar);
    }

    private dpro() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဌ\u0001", new Object[]{"d", "a", "b", dpqg.c()});
            }
            if (i2 == 3) {
                return new dpro();
            }
            if (i2 == 4) {
                return new dprl();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dpro> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dpro.class) {
                    dssrVar = e;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(c);
                        e = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
