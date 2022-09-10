package defpackage;
/* compiled from: PG */
/* renamed from: crts  reason: default package */
/* loaded from: classes5.dex */
public final class crts extends dsqw<crts, crtl> implements dssk {
    public static final crts r;
    private static volatile dssr<crts> t;
    public int a;
    public dgpo d;
    public dgrh e;
    public int k;
    public crtr m;
    public crtp n;
    private byte s = 2;
    public String b = "";
    public String c = "";
    public String f = "";
    public boolean g = true;
    public dsrj<dszs> h = dssu.b;
    public dsrj<String> i = dssu.b;
    public String j = "";
    public dsrj<crtk> l = dssu.b;
    public dspd o = dspd.b;
    public String p = "";
    public String q = "";

    static {
        crts crtsVar = new crts();
        r = crtsVar;
        dsqw.cc(crts.class, crtsVar);
    }

    private crts() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(r, "\u0001\u0010\u0000\u0001\u0002&\u0010\u0000\u0003\u0001\u0002ဉ\u0002\u0003ᐉ\u0003\u0005ဇ\u0005\b\u001b\t\u001a\nဈ\u0004\u000bဈ\u0006\u000fဌ\u0007\u001e\u001b\u001fဉ\b ဈ\u0000!ဈ\u0001\"ဉ\t#ည\n%ဈ\u000b&ဈ\f", new Object[]{"a", "d", "e", "g", "h", dszs.class, "i", "f", "j", "k", dgpu.c(), "l", crtk.class, "m", "b", "c", "n", "o", "p", "q"});
            }
            if (i2 == 3) {
                return new crts();
            }
            if (i2 == 4) {
                return new crtl();
            }
            if (i2 == 5) {
                return r;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.s = b;
                return null;
            }
            dssr<crts> dssrVar = t;
            if (dssrVar == null) {
                synchronized (crts.class) {
                    dssrVar = t;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(r);
                        t = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.s);
    }

    public final void b() {
        dsrj<String> dsrjVar = this.i;
        if (!dsrjVar.a()) {
            this.i = dsqw.cl(dsrjVar);
        }
    }

    public final void c() {
        dsrj<crtk> dsrjVar = this.l;
        if (!dsrjVar.a()) {
            this.l = dsqw.cl(dsrjVar);
        }
    }
}
