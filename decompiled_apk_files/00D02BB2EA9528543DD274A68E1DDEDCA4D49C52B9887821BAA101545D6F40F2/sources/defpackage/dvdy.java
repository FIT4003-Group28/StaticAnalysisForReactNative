package defpackage;
/* compiled from: PG */
/* renamed from: dvdy  reason: default package */
/* loaded from: classes.dex */
public final class dvdy extends dsqw<dvdy, dvdv> implements dssk {
    public static final dvdy l;
    private static volatile dssr<dvdy> m;
    public int a;
    public int b;
    public String c = "";
    public String d = "";
    public String e = "";
    public String f = "";
    public String g = "";
    public String h = "";
    public String i = "";
    public String j = "";
    public dvdx k;

    static {
        dvdy dvdyVar = new dvdy();
        l = dvdyVar;
        dsqw.cc(dvdy.class, dvdyVar);
    }

    private dvdy() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(l, "\u0001\n\u0000\u0001\u0001\f\n\u0000\u0000\u0000\u0001င\u0000\u0002ဈ\u0002\u0003ဈ\u0004\u0004ဈ\u0006\u0005ဈ\b\u0006ဈ\n\u0007ဈ\u000b\bဈ\r\tဈ\u000e\fဉ\u000f", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k"});
            }
            if (i2 == 3) {
                return new dvdy();
            }
            if (i2 == 4) {
                return new dvdv();
            }
            if (i2 == 5) {
                return l;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dvdy> dssrVar = m;
            if (dssrVar == null) {
                synchronized (dvdy.class) {
                    dssrVar = m;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(l);
                        m = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
