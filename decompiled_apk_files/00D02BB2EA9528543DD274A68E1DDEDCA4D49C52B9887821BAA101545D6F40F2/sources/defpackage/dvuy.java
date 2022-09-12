package defpackage;
/* compiled from: PG */
/* renamed from: dvuy  reason: default package */
/* loaded from: classes6.dex */
public final class dvuy extends dsqw<dvuy, dvux> implements dssk {
    public static final dvuy s;
    private static volatile dssr<dvuy> u;
    public int a;
    public dvxb b;
    public boolean k;
    public int l;
    public int m;
    public dqmr p;
    private byte t = 2;
    public String c = "";
    public String d = "";
    public String e = "";
    public String f = "";
    public String g = "";
    public String h = "";
    public String i = "";
    public dsrj<dvuq> j = dssu.b;
    public String n = "";
    public String o = "";
    public String q = "";
    public String r = "";

    static {
        dvuy dvuyVar = new dvuy();
        s = dvuyVar;
        dsqw.cc(dvuy.class, dvuyVar);
    }

    private dvuy() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(s, "\u0001\u0011\u0000\u0001\u0001\u0014\u0011\u0000\u0001\u0001\u0001ဉ\u0000\u0002ဈ\u0002\u0003ဈ\u0003\u0004ဈ\u0004\u0005ဈ\u0005\u0006ဈ\u0006\u0007Л\tဇ\b\fဌ\u000b\rဈ\r\u000eဈ\u000e\u000fဈ\u0001\u0010ဉ\u000f\u0011ဈ\u0010\u0012ဈ\u0011\u0013ဈ\u0007\u0014ဌ\f", new Object[]{"a", "b", "d", "e", "f", "g", "h", "j", dvuq.class, "k", "l", dnde.a, "n", "o", "c", "p", "q", "r", "i", "m", dplm.a});
            }
            if (i2 == 3) {
                return new dvuy();
            }
            if (i2 == 4) {
                return new dvux();
            }
            if (i2 == 5) {
                return s;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.t = b;
                return null;
            }
            dssr<dvuy> dssrVar = u;
            if (dssrVar == null) {
                synchronized (dvuy.class) {
                    dssrVar = u;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(s);
                        u = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.t);
    }
}
