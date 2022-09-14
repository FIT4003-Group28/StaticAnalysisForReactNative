package defpackage;
/* compiled from: PG */
/* renamed from: dpox  reason: default package */
/* loaded from: classes6.dex */
public final class dpox extends dsqw<dpox, dpow> implements dssk {
    public static final dpox d;
    private static volatile dssr<dpox> e;
    public int a;
    public String b = "";
    public dggg c;

    static {
        dpox dpoxVar = new dpox();
        d = dpoxVar;
        dsqw.cc(dpox.class, dpoxVar);
    }

    private dpox() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0003ဉ\u0002", new Object[]{"a", "b", "c"});
            }
            if (i2 == 3) {
                return new dpox();
            }
            if (i2 == 4) {
                return new dpow();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dpox> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dpox.class) {
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
