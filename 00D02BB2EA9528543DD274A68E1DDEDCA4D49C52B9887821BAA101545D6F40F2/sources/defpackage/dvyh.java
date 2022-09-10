package defpackage;
/* compiled from: PG */
/* renamed from: dvyh  reason: default package */
/* loaded from: classes.dex */
public final class dvyh extends dsqw<dvyh, dvyg> implements dssk {
    public static final dvyh b;
    private static volatile dssr<dvyh> d;
    public String a = "";
    private int c;

    static {
        dvyh dvyhVar = new dvyh();
        b = dvyhVar;
        dsqw.cc(dvyh.class, dvyhVar);
    }

    private dvyh() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0001\u0003\u0003\u0001\u0000\u0000\u0000\u0003ဈ\u0002", new Object[]{"c", "a"});
            }
            if (i2 == 3) {
                return new dvyh();
            }
            if (i2 == 4) {
                return new dvyg();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dvyh> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dvyh.class) {
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
