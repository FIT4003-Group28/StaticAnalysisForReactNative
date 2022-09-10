package defpackage;
/* compiled from: PG */
/* renamed from: dvnq  reason: default package */
/* loaded from: classes6.dex */
public final class dvnq extends dsqw<dvnq, dvnn> implements dvnr {
    public static final dvnq d;
    private static volatile dssr<dvnq> e;
    public int a;
    public int b;
    public String c = "";

    static {
        dvnq dvnqVar = new dvnq();
        d = dvnqVar;
        dsqw.cc(dvnq.class, dvnqVar);
    }

    private dvnq() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဈ\u0001", new Object[]{"a", "b", dvnp.c(), "c"});
            }
            if (i2 == 3) {
                return new dvnq();
            }
            if (i2 == 4) {
                return new dvnn();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dvnq> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dvnq.class) {
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
