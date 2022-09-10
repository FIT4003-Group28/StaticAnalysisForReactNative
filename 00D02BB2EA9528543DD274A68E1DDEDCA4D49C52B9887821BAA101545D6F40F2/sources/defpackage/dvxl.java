package defpackage;
/* compiled from: PG */
/* renamed from: dvxl  reason: default package */
/* loaded from: classes6.dex */
public final class dvxl extends dsqw<dvxl, dvxk> implements dssk {
    public static final dvxl e;
    private static volatile dssr<dvxl> f;
    public int a;
    public int c;
    public String b = "";
    public String d = "";

    static {
        dvxl dvxlVar = new dvxl();
        e = dvxlVar;
        dsqw.cc(dvxl.class, dvxlVar);
    }

    private dvxl() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဌ\u0001\u0003ဈ\u0002", new Object[]{"a", "b", "c", dvxj.c(), "d"});
            }
            if (i2 == 3) {
                return new dvxl();
            }
            if (i2 == 4) {
                return new dvxk();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dvxl> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dvxl.class) {
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
