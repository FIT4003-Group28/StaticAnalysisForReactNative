package defpackage;
/* compiled from: PG */
/* renamed from: dpeg  reason: default package */
/* loaded from: classes.dex */
public final class dpeg extends dsqw<dpeg, dped> implements dssk {
    public static final dpeg f;
    private static volatile dssr<dpeg> g;
    public int a;
    public dpef b;
    public boolean c;
    public String d = "";
    public boolean e;

    static {
        dpeg dpegVar = new dpeg();
        f = dpegVar;
        dsqw.cc(dpeg.class, dpegVar);
    }

    private dpeg() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဇ\u0001\u0003ဈ\u0002\u0004ဇ\u0003", new Object[]{"a", "b", "c", "d", "e"});
            }
            if (i2 == 3) {
                return new dpeg();
            }
            if (i2 == 4) {
                return new dped();
            }
            if (i2 == 5) {
                return f;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dpeg> dssrVar = g;
            if (dssrVar == null) {
                synchronized (dpeg.class) {
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
