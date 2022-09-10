package defpackage;
/* compiled from: PG */
/* renamed from: dpzs  reason: default package */
/* loaded from: classes6.dex */
public final class dpzs extends dsqw<dpzs, dpzn> implements dssk {
    public static final dpzs c;
    private static volatile dssr<dpzs> e;
    public int a = 1;
    public int b;
    private int d;

    static {
        dpzs dpzsVar = new dpzs();
        c = dpzsVar;
        dsqw.cc(dpzs.class, dpzsVar);
    }

    private dpzs() {
        dssu<Object> dssuVar = dssu.b;
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0003ဌ\u0002", new Object[]{"d", "a", dpzo.a, "b", dpzq.a});
            }
            if (i2 == 3) {
                return new dpzs();
            }
            if (i2 == 4) {
                return new dpzn();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dpzs> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dpzs.class) {
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
