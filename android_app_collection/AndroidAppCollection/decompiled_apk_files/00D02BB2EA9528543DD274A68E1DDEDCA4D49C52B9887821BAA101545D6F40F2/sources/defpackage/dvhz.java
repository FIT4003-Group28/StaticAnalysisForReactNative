package defpackage;
/* compiled from: PG */
/* renamed from: dvhz  reason: default package */
/* loaded from: classes.dex */
public final class dvhz extends dsqw<dvhz, dvhy> implements dssk {
    public static final dvhz e;
    private static volatile dssr<dvhz> f;
    public int a;
    public dnwj b;
    public dhjx c;
    public String d = "";

    static {
        dvhz dvhzVar = new dvhz();
        e = dvhzVar;
        dsqw.cc(dvhz.class, dvhzVar);
    }

    private dvhz() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဈ\u0002", new Object[]{"a", "b", "c", "d"});
            }
            if (i2 == 3) {
                return new dvhz();
            }
            if (i2 == 4) {
                return new dvhy();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dvhz> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dvhz.class) {
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
