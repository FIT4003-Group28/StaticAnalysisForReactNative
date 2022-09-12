package defpackage;
/* compiled from: PG */
/* renamed from: dpzw  reason: default package */
/* loaded from: classes6.dex */
public final class dpzw extends dsqw<dpzw, dpzv> implements dssk {
    public static final dpzw e;
    private static volatile dssr<dpzw> g;
    public String a = "";
    public String b = "";
    public dnpq c;
    public dpyl d;
    private int f;

    static {
        dpzw dpzwVar = new dpzw();
        e = dpzwVar;
        dsqw.cc(dpzw.class, dpzwVar);
    }

    private dpzw() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(e, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဉ\u0002\u0004ဉ\u0003", new Object[]{"f", "a", "b", "c", "d"});
            }
            if (i2 == 3) {
                return new dpzw();
            }
            if (i2 == 4) {
                return new dpzv();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dpzw> dssrVar = g;
            if (dssrVar == null) {
                synchronized (dpzw.class) {
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
