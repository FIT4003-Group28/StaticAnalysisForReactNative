package defpackage;
/* compiled from: PG */
/* renamed from: dvzy  reason: default package */
/* loaded from: classes6.dex */
public final class dvzy extends dsqs<dvzy, dvzv> implements dsqt {
    public static final dvzy u;
    private static volatile dssr<dvzy> w;
    public int a;
    public Object c;
    public dhjx e;
    public dwao g;
    public int j;
    public boolean m;
    public boolean n;
    public dnqh o;
    public boolean q;
    public dwbm r;
    public boolean s;
    public dnwb t;
    public int b = 0;
    private byte v = 2;
    public dsrj<dpjx> d = dssu.b;
    public int f = 2;
    public int h = 2;
    public dsrj<dpjd> i = dssu.b;
    public String k = "";
    public dspd l = dspd.b;
    public dsrj<dwac> p = dssu.b;

    static {
        dvzy dvzyVar = new dvzy();
        u = dvzyVar;
        dsqw.cc(dvzy.class, dvzyVar);
    }

    private dvzy() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(u, "\u0001\u0014\u0001\u0001\u0001!\u0014\u0000\u0003\u0001\u0001\u001b\u0003ဉ\u0000\u0005ဌ\u0001\u0006ဉ\u0002\u0007ဌ\u0004\t\u001b\rျ\u0000\u000eဇ\f\u000fᐉ\r\u0010ဇ\u000e\u0013ဉ\u0011\u0016ဇ\u0012\u0018ဉ\u0014\u0019ဌ\b\u001aွ\u0000\u001bည\n\u001cဿ\u0000\u001e\u001b ဇ\u000b!ဈ\t", new Object[]{"c", "b", "a", "d", dpjx.class, "e", "f", dpaz.c(), "g", "h", dowa.c(), "i", dpjd.class, "n", "o", "q", "r", "s", "t", "j", dquz.c(), "l", dvzx.c(), "p", dwac.class, "m", "k"});
            }
            if (i2 == 3) {
                return new dvzy();
            }
            if (i2 == 4) {
                return new dvzv();
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
            dssr<dvzy> dssrVar = w;
            if (dssrVar == null) {
                synchronized (dvzy.class) {
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
        dsrj<dpjx> dsrjVar = this.d;
        if (!dsrjVar.a()) {
            this.d = dsqw.cl(dsrjVar);
        }
    }
}
