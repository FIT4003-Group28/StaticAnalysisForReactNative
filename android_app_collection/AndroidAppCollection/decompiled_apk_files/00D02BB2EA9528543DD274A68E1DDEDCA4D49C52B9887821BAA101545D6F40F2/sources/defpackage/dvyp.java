package defpackage;
/* compiled from: PG */
/* renamed from: dvyp  reason: default package */
/* loaded from: classes.dex */
public final class dvyp extends dsqw<dvyp, dvyo> implements dssk {
    public static final dvyp e;
    private static volatile dssr<dvyp> f;
    public int a;
    public dsrj<dgkg> b = dssu.b;
    public String c = "";
    public int d = 2;

    static {
        dvyp dvypVar = new dvyp();
        e = dvypVar;
        dsqw.cc(dvyp.class, dvypVar);
    }

    private dvyp() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(e, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0001\u0000\u0001\u001b\u0003ဈ\u0001\u0004င\u0002", new Object[]{"a", "b", dgkg.class, "c", "d"});
            }
            if (i2 == 3) {
                return new dvyp();
            }
            if (i2 == 4) {
                return new dvyo();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dvyp> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dvyp.class) {
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
