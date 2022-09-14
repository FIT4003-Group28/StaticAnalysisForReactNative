package defpackage;
/* compiled from: PG */
/* renamed from: dvwi  reason: default package */
/* loaded from: classes.dex */
public final class dvwi extends dsqw<dvwi, dvwf> implements dssk {
    public static final dvwi m;
    private static volatile dssr<dvwi> n;
    public int a;
    public dnpq b;
    public String c = "";
    public dnpq d;
    public dnpq e;
    public dnpq f;
    public dnpq g;
    public dnpq h;
    public dnpq i;
    public dnpq j;
    public dvwh k;
    public dgde l;

    static {
        dvwi dvwiVar = new dvwi();
        m = dvwiVar;
        dsqw.cc(dvwi.class, dvwiVar);
    }

    private dvwi() {
        dssu<Object> dssuVar = dssu.b;
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(m, "\u0001\u000b\u0000\u0001\u0001\r\u000b\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဈ\u0001\u0005ဉ\u0003\u0006ဉ\u0004\u0007ဉ\u0005\bဉ\u0006\tဉ\u0007\nဉ\b\u000bဉ\t\fဉ\u000b\rဉ\f", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l"});
            }
            if (i2 == 3) {
                return new dvwi();
            }
            if (i2 == 4) {
                return new dvwf();
            }
            if (i2 == 5) {
                return m;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dvwi> dssrVar = n;
            if (dssrVar == null) {
                synchronized (dvwi.class) {
                    dssrVar = n;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(m);
                        n = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
