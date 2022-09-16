package defpackage;
/* compiled from: PG */
/* renamed from: dvdd  reason: default package */
/* loaded from: classes6.dex */
public final class dvdd extends dsqw<dvdd, dvdc> implements dssk {
    public static final dvdd d;
    private static volatile dssr<dvdd> f;
    public String a = "";
    public String b = "";
    public String c = "";
    private int e;

    static {
        dvdd dvddVar = new dvdd();
        d = dvddVar;
        dsqw.cc(dvdd.class, dvddVar);
    }

    private dvdd() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002", new Object[]{"e", "a", "b", "c"});
            }
            if (i2 == 3) {
                return new dvdd();
            }
            if (i2 == 4) {
                return new dvdc();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dvdd> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dvdd.class) {
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
