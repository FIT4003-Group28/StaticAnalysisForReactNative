package defpackage;
/* compiled from: PG */
/* renamed from: dpua  reason: default package */
/* loaded from: classes6.dex */
public final class dpua extends dsqw<dpua, dptv> implements dssk {
    public static final dpua d;
    private static volatile dssr<dpua> f;
    public int a;
    public String b = "";
    public int c;
    private int e;

    static {
        dpua dpuaVar = new dpua();
        d = dpuaVar;
        dsqw.cc(dpua.class, dpuaVar);
    }

    private dpua() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0003ဌ\u0003\u0004ဈ\u0001", new Object[]{"e", "a", dpty.a, "c", dptw.a, "b"});
            }
            if (i2 == 3) {
                return new dpua();
            }
            if (i2 == 4) {
                return new dptv();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dpua> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dpua.class) {
                    dssrVar = f;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(d);
                        f = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
