package defpackage;
/* compiled from: PG */
/* renamed from: dwfl  reason: default package */
/* loaded from: classes.dex */
public final class dwfl extends dsqw<dwfl, dwfi> implements dssk {
    public static final dwfl w;
    private static volatile dssr<dwfl> x;
    public int a;
    public dkea j;
    public dwfh k;
    public dreg l;
    public dhjx m;
    public dnpq n;
    public long o;
    public dizh p;
    public dsrj<dwfa> r;
    public dqjc s;
    public dpsn t;
    public String u;
    public dghi v;
    public String b = "";
    public String c = "";
    public String d = "";
    public int e = 1;
    public int f = 1;
    public String g = "";
    public String h = "";
    public int i = 1;
    public String q = "";

    static {
        dwfl dwflVar = new dwfl();
        w = dwflVar;
        dsqw.cc(dwfl.class, dwflVar);
    }

    private dwfl() {
        dspd dspdVar = dspd.b;
        this.r = dssu.b;
        this.u = "";
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(w, "\u0001\u0015\u0000\u0001\u0001\u0017\u0015\u0000\u0001\u0000\u0001ဈ\u0002\u0002ဌ\u0003\u0003ဈ\u0005\u0005ဈ\u0007\u0006ဉ\n\u0007ဉ\f\bဌ\u0004\tဌ\b\nဉ\r\u000bဂ\u000e\fဈ\u0000\rဈ\u0001\u000eဉ\u000f\u000fဈ\u0010\u0010ဉ\t\u0012ဉ\u0012\u0013ဉ\u0013\u0014\u001b\u0015ဈ\u0014\u0016ဉ\u0015\u0017ဉ\u000b", new Object[]{"a", "d", "e", dpli.a, "g", "h", "k", "m", "f", dwfb.a, "i", dwfj.a, "n", "o", "b", "c", "p", "q", "j", "s", "t", "r", dwfa.class, "u", "v", "l"});
            }
            if (i2 == 3) {
                return new dwfl();
            }
            if (i2 == 4) {
                return new dwfi();
            }
            if (i2 == 5) {
                return w;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dwfl> dssrVar = x;
            if (dssrVar == null) {
                synchronized (dwfl.class) {
                    dssrVar = x;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(w);
                        x = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
