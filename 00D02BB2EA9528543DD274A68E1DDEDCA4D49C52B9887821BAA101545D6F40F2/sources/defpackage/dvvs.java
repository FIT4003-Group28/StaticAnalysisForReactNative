package defpackage;
/* compiled from: PG */
/* renamed from: dvvs  reason: default package */
/* loaded from: classes6.dex */
public final class dvvs extends dsqw<dvvs, dvvr> implements dssk {
    public static final dvvs g;
    private static volatile dssr<dvvs> h;
    public int a;
    public int c;
    public int b = -1;
    public String d = "";
    public String e = "";
    public String f = "";

    static {
        dvvs dvvsVar = new dvvs();
        g = dvvsVar;
        dsqw.cc(dvvs.class, dvvsVar);
    }

    private dvvs() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(g, "\u0001\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003ဈ\u0002\u0005ဈ\u0004\u0006ဈ\u0005", new Object[]{"a", "b", "c", "d", "e", "f"});
            }
            if (i2 == 3) {
                return new dvvs();
            }
            if (i2 == 4) {
                return new dvvr();
            }
            if (i2 == 5) {
                return g;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dvvs> dssrVar = h;
            if (dssrVar == null) {
                synchronized (dvvs.class) {
                    dssrVar = h;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(g);
                        h = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
