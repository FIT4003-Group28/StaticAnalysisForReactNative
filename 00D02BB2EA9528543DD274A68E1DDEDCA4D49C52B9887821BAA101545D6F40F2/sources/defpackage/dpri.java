package defpackage;
/* compiled from: PG */
/* renamed from: dpri  reason: default package */
/* loaded from: classes6.dex */
public final class dpri extends dsqw<dpri, dprh> implements dssk {
    public static final dpri f;
    private static volatile dssr<dpri> g;
    public int a;
    public int b = 1;
    public int c = 1;
    public String d = "";
    public String e = "";

    static {
        dpri dpriVar = new dpri();
        f = dpriVar;
        dsqw.cc(dpri.class, dpriVar);
    }

    private dpri() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001\u0003ဈ\u0002\u0004ဈ\u0003", new Object[]{"a", "b", dpqn.c(), "c", dpqq.a, "d", "e"});
            }
            if (i2 == 3) {
                return new dpri();
            }
            if (i2 == 4) {
                return new dprh();
            }
            if (i2 == 5) {
                return f;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dpri> dssrVar = g;
            if (dssrVar == null) {
                synchronized (dpri.class) {
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
