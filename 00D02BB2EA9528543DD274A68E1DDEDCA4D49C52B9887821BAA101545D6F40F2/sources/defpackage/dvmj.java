package defpackage;
/* compiled from: PG */
/* renamed from: dvmj  reason: default package */
/* loaded from: classes.dex */
public final class dvmj extends dsqw<dvmj, dvmi> implements dssk {
    public static final dvmj b;
    private static volatile dssr<dvmj> d;
    public boolean a;
    private int c;

    static {
        dvmj dvmjVar = new dvmj();
        b = dvmjVar;
        dsqw.cc(dvmj.class, dvmjVar);
    }

    private dvmj() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဇ\u0000", new Object[]{"c", "a"});
            }
            if (i2 == 3) {
                return new dvmj();
            }
            if (i2 == 4) {
                return new dvmi();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dvmj> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dvmj.class) {
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
