package defpackage;
/* compiled from: PG */
/* renamed from: dhlz  reason: default package */
/* loaded from: classes.dex */
public final class dhlz extends dsqw<dhlz, dhlu> implements dssk {
    public static final dhlz n;
    private static volatile dssr<dhlz> o;
    public int a;
    public boolean c;
    public boolean d;
    public boolean e;
    public dhly h;
    public int i;
    public boolean j;
    public dirl k;
    public dhlb l;
    public boolean m;
    public dsrj<dhlt> b = dssu.b;
    public String f = "geoar.googleapis.com";
    public String g = "";

    static {
        dhlz dhlzVar = new dhlz();
        n = dhlzVar;
        dsqw.cc(dhlz.class, dhlzVar);
    }

    private dhlz() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(n, "\u0001\f\u0000\u0001\u0001\u000f\f\u0000\u0001\u0000\u0001\u001b\u0004ဇ\u0002\u0005ဇ\u0003\u0006ဇ\u0004\u0007ဈ\u0005\bဈ\u0006\tဉ\u0007\u000bင\t\fဇ\n\rဉ\u000b\u000eဉ\f\u000fဇ\r", new Object[]{"a", "b", dhlt.class, "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m"});
            }
            if (i2 == 3) {
                return new dhlz();
            }
            if (i2 == 4) {
                return new dhlu();
            }
            if (i2 == 5) {
                return n;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dhlz> dssrVar = o;
            if (dssrVar == null) {
                synchronized (dhlz.class) {
                    dssrVar = o;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(n);
                        o = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
