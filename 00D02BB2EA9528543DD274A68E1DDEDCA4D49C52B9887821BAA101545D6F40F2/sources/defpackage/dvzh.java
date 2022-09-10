package defpackage;
/* compiled from: PG */
/* renamed from: dvzh  reason: default package */
/* loaded from: classes.dex */
public final class dvzh extends dsqw<dvzh, dvzg> implements dssk {
    public static final dvzh b;
    private static volatile dssr<dvzh> d;
    public String a = "";
    private int c;

    static {
        dvzh dvzhVar = new dvzh();
        b = dvzhVar;
        dsqw.cc(dvzh.class, dvzhVar);
    }

    private dvzh() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"c", "a"});
            }
            if (i2 == 3) {
                return new dvzh();
            }
            if (i2 == 4) {
                return new dvzg();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dvzh> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dvzh.class) {
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
