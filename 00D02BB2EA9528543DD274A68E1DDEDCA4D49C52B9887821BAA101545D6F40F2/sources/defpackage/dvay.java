package defpackage;
/* compiled from: PG */
/* renamed from: dvay  reason: default package */
/* loaded from: classes6.dex */
public final class dvay extends dsqw<dvay, dval> implements dssk {
    public static final dsrg<Integer, dvax> q = new dvai();
    public static final dvay u;
    private static volatile dssr<dvay> w;
    public int a;
    public Object c;
    public dvap e;
    public dwyn f;
    public dwyn g;
    public dqgd k;
    public int m;
    public boolean r;
    public dqfw t;
    public int b = 0;
    private byte v = 2;
    public String d = "";
    public String h = "";
    public dsrj<dwfl> i = dssu.b;
    public dsrj<dvan> j = dssu.b;
    public dsrj<dqjp> l = dssu.b;
    public int n = 2;
    public dsrj<dvay> o = dssu.b;
    public dsrf p = dsqz.b;
    public String s = "";

    static {
        dvay dvayVar = new dvay();
        u = dvayVar;
        dsqw.cc(dvay.class, dvayVar);
    }

    private dvay() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(u, "\u0001\u0013\u0001\u0001\u0001\u0017\u0013\u0000\u0005\u0005\u0001ᐉ\u0002\u0002ᐉ\u0003\u0003ဌ\u0006\u0004ဈ\u0004\u0006\u001b\u0007ᐼ\u0000\bဉ\u0001\tြ\u0000\nဈ\u0000\u000bဇ\u000b\rဈ\r\u000eᐼ\u0000\u000fဌ\u0007\u0010Л\u0011\u001e\u0012ဉ\u000e\u0013\u001b\u0014ဉ\u0005\u0017\u001b", new Object[]{"c", "b", "a", "f", "g", "m", dvax.c(), "h", "i", dwfl.class, dvat.class, "e", dvak.class, "d", "r", "s", dvav.class, "n", dqjm.a, "o", dvay.class, "p", dvax.c(), "t", "j", dvan.class, "k", "l", dqjp.class});
            }
            if (i2 == 3) {
                return new dvay();
            }
            if (i2 == 4) {
                return new dval();
            }
            if (i2 == 5) {
                return u;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.v = b;
                return null;
            }
            dssr<dvay> dssrVar = w;
            if (dssrVar == null) {
                synchronized (dvay.class) {
                    dssrVar = w;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(u);
                        w = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.v);
    }

    public final void c() {
        dsrj<dvay> dsrjVar = this.o;
        if (!dsrjVar.a()) {
            this.o = dsqw.cl(dsrjVar);
        }
    }
}
