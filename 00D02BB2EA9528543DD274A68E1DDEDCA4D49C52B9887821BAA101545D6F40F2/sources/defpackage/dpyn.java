package defpackage;
/* compiled from: PG */
/* renamed from: dpyn  reason: default package */
/* loaded from: classes6.dex */
public final class dpyn extends dsqw<dpyn, dpym> implements dssk {
    public static final dpyn d;
    private static volatile dssr<dpyn> e;
    public int a;
    public String b = "";
    public String c = "";

    static {
        dpyn dpynVar = new dpyn();
        d = dpynVar;
        dsqw.cc(dpyn.class, dpynVar);
    }

    private dpyn() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"a", "b", "c"});
            }
            if (i2 == 3) {
                return new dpyn();
            }
            if (i2 == 4) {
                return new dpym();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dpyn> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dpyn.class) {
                    dssrVar = e;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(d);
                        e = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
