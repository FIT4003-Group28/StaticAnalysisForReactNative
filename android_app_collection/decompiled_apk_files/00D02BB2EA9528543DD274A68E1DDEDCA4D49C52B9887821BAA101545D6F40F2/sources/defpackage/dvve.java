package defpackage;
/* compiled from: PG */
/* renamed from: dvve  reason: default package */
/* loaded from: classes6.dex */
public final class dvve extends dsqw<dvve, dvvd> implements dssk {
    public static final dvve e;
    private static volatile dssr<dvve> f;
    public int a;
    public Object c;
    public int b = 0;
    public String d = "";

    static {
        dvve dvveVar = new dvve();
        e = dvveVar;
        dsqw.cc(dvve.class, dvveVar);
    }

    private dvve() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(e, "\u0001\u0003\u0001\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ျ\u0000\u0003ြ\u0000", new Object[]{"c", "b", "a", "d", dpum.class});
            }
            if (i2 == 3) {
                return new dvve();
            }
            if (i2 == 4) {
                return new dvvd();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dvve> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dvve.class) {
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
