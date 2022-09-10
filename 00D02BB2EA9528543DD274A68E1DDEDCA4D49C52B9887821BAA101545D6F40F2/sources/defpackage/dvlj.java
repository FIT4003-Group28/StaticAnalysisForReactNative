package defpackage;
/* compiled from: PG */
/* renamed from: dvlj  reason: default package */
/* loaded from: classes.dex */
public final class dvlj extends dsqw<dvlj, dvlc> implements dssk {
    public static final dvlj f;
    private static volatile dssr<dvlj> h;
    public boolean a = true;
    public int b = 2048;
    public float c = 0.1f;
    public int d = 1;
    public dvli e;
    private int g;

    static {
        dvlj dvljVar = new dvlj();
        f = dvljVar;
        dsqw.cc(dvlj.class, dvljVar);
    }

    private dvlj() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(f, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဇ\u0000\u0002င\u0001\u0003ခ\u0002\u0004ဌ\u0003\u0005ဉ\u0004", new Object[]{"g", "a", "b", "c", "d", dvld.a, "e"});
            }
            if (i2 == 3) {
                return new dvlj();
            }
            if (i2 == 4) {
                return new dvlc();
            }
            if (i2 == 5) {
                return f;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dvlj> dssrVar = h;
            if (dssrVar == null) {
                synchronized (dvlj.class) {
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
