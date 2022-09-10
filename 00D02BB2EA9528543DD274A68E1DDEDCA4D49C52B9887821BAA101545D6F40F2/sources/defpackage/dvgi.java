package defpackage;
/* compiled from: PG */
/* renamed from: dvgi  reason: default package */
/* loaded from: classes.dex */
public final class dvgi extends dsqw<dvgi, dvgh> implements dssk {
    public static final dvgi b;
    private static volatile dssr<dvgi> d;
    public int a = 3000;
    private int c;

    static {
        dvgi dvgiVar = new dvgi();
        b = dvgiVar;
        dsqw.cc(dvgi.class, dvgiVar);
    }

    private dvgi() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0001\r\r\u0001\u0000\u0000\u0000\rင\f", new Object[]{"c", "a"});
            }
            if (i2 == 3) {
                return new dvgi();
            }
            if (i2 == 4) {
                return new dvgh();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dvgi> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dvgi.class) {
                    dssrVar = d;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(b);
                        d = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
