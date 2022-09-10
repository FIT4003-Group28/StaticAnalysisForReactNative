package defpackage;
/* compiled from: PG */
/* renamed from: dvlp  reason: default package */
/* loaded from: classes.dex */
public final class dvlp extends dsqw<dvlp, dvlo> implements dssk {
    public static final dvlp f;
    private static volatile dssr<dvlp> h;
    public boolean a;
    public long b = 604800;
    public int c = 1000;
    public int d = 10080;
    public float e = 0.7f;
    private int g;

    static {
        dvlp dvlpVar = new dvlp();
        f = dvlpVar;
        dsqw.cc(dvlp.class, dvlpVar);
    }

    private dvlp() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(f, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဂ\u0001\u0003င\u0002\u0004င\u0003\u0005ခ\u0004", new Object[]{"g", "a", "b", "c", "d", "e"});
            }
            if (i2 == 3) {
                return new dvlp();
            }
            if (i2 == 4) {
                return new dvlo();
            }
            if (i2 == 5) {
                return f;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dvlp> dssrVar = h;
            if (dssrVar == null) {
                synchronized (dvlp.class) {
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
