package defpackage;
/* compiled from: PG */
/* renamed from: dpti  reason: default package */
/* loaded from: classes.dex */
public final class dpti extends dsqw<dpti, dpth> implements dssk {
    public static final dpti e;
    private static volatile dssr<dpti> f;
    public int a;
    public String b = "";
    public String c = "";
    public String d = "";

    static {
        dpti dptiVar = new dpti();
        e = dptiVar;
        dsqw.cc(dpti.class, dptiVar);
    }

    private dpti() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(e, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0004ဈ\u0002", new Object[]{"a", "b", "c", "d"});
            }
            if (i2 == 3) {
                return new dpti();
            }
            if (i2 == 4) {
                return new dpth();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dpti> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dpti.class) {
                    dssrVar = f;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(e);
                        f = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
