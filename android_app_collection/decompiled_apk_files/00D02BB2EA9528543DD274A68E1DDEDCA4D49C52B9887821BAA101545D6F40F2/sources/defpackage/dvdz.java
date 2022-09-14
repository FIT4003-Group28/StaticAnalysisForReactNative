package defpackage;
/* compiled from: PG */
/* renamed from: dvdz  reason: default package */
/* loaded from: classes.dex */
public final class dvdz extends dsqw<dvdz, dvdu> implements dssk {
    public static final dvdz e;
    private static volatile dssr<dvdz> f;
    public int a;
    public String b = "https://ssl.gstatic.com/maps/chevrons/";
    public String c = "manifests/models0.json";
    public dsrj<dvdy> d = dssu.b;

    static {
        dvdz dvdzVar = new dvdz();
        e = dvdzVar;
        dsqw.cc(dvdz.class, dvdzVar);
    }

    private dvdz() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003\u001b", new Object[]{"a", "b", "c", "d", dvdy.class});
            }
            if (i2 == 3) {
                return new dvdz();
            }
            if (i2 == 4) {
                return new dvdu();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dvdz> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dvdz.class) {
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
