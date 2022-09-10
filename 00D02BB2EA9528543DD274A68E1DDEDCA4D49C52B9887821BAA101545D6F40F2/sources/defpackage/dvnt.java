package defpackage;
/* compiled from: PG */
/* renamed from: dvnt  reason: default package */
/* loaded from: classes.dex */
public final class dvnt extends dsqw<dvnt, dvns> implements dssk {
    public static final dvnt f;
    private static volatile dssr<dvnt> h;
    public int a = 2000;
    public int b = 2000;
    public int c = 720;
    public int d = 15;
    public boolean e = true;
    private int g;

    static {
        dvnt dvntVar = new dvnt();
        f = dvntVar;
        dsqw.cc(dvnt.class, dvntVar);
    }

    private dvnt() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0002\u0004င\u0003", new Object[]{"g", "a", "b", "c", "d"});
            }
            if (i2 == 3) {
                return new dvnt();
            }
            if (i2 == 4) {
                return new dvns();
            }
            if (i2 == 5) {
                return f;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dvnt> dssrVar = h;
            if (dssrVar == null) {
                synchronized (dvnt.class) {
                    dssrVar = h;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(f);
                        h = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
