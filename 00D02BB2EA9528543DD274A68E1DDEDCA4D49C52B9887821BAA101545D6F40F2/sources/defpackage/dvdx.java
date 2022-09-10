package defpackage;
/* compiled from: PG */
/* renamed from: dvdx  reason: default package */
/* loaded from: classes6.dex */
public final class dvdx extends dsqw<dvdx, dvdw> implements dssk {
    public static final dvdx c;
    private static volatile dssr<dvdx> d;
    public int a;
    public String b = "";

    static {
        dvdx dvdxVar = new dvdx();
        c = dvdxVar;
        dsqw.cc(dvdx.class, dvdxVar);
    }

    private dvdx() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"a", "b"});
            }
            if (i2 == 3) {
                return new dvdx();
            }
            if (i2 == 4) {
                return new dvdw();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dvdx> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dvdx.class) {
                    dssrVar = d;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(c);
                        d = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
