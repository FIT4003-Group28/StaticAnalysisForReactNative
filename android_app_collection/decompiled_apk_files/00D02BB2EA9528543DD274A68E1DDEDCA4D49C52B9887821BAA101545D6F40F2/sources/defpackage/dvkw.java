package defpackage;
/* compiled from: PG */
/* renamed from: dvkw  reason: default package */
/* loaded from: classes6.dex */
public final class dvkw extends dsqw<dvkw, dvku> implements dssk {
    public static final dvkw k;
    private static volatile dssr<dvkw> l;
    public int a;
    public int b;
    public dhjz g;
    public boolean j;
    public String c = "";
    public String d = "";
    public String e = "";
    public String f = "";
    public String h = "";
    public String i = "";

    static {
        dvkw dvkwVar = new dvkw();
        k = dvkwVar;
        dsqw.cc(dvkw.class, dvkwVar);
    }

    private dvkw() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(k, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဉ\u0005\u0007ဈ\u0006\bဈ\u0007\tဇ\b", new Object[]{"a", "b", dvkv.a, "c", "d", "e", "f", "g", "h", "i", "j"});
            }
            if (i2 == 3) {
                return new dvkw();
            }
            if (i2 == 4) {
                return new dvku();
            }
            if (i2 == 5) {
                return k;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dvkw> dssrVar = l;
            if (dssrVar == null) {
                synchronized (dvkw.class) {
                    dssrVar = l;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(k);
                        l = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
