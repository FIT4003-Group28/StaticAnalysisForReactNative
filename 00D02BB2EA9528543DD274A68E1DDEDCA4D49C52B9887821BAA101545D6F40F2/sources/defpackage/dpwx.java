package defpackage;
/* compiled from: PG */
/* renamed from: dpwx  reason: default package */
/* loaded from: classes6.dex */
public final class dpwx extends dsqw<dpwx, dpww> implements dssk {
    public static final dpwx c;
    private static volatile dssr<dpwx> d;
    public int a;
    public int b;

    static {
        dpwx dpwxVar = new dpwx();
        c = dpwxVar;
        dsqw.cc(dpwx.class, dpwxVar);
    }

    private dpwx() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"a", "b", dpwz.c()});
            }
            if (i2 == 3) {
                return new dpwx();
            }
            if (i2 == 4) {
                return new dpww();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dpwx> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dpwx.class) {
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
