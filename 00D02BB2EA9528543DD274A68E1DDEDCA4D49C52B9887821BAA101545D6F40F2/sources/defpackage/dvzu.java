package defpackage;
/* compiled from: PG */
/* renamed from: dvzu  reason: default package */
/* loaded from: classes6.dex */
public final class dvzu extends dsqw<dvzu, dvzo> implements dssk {
    public static final dvzu F;
    private static volatile dssr<dvzu> H;
    public dpfh A;
    public douz B;
    public dvzr C;
    public boolean D;
    public int a;
    public int g;
    public int h;
    public boolean i;
    public int j;
    public boolean k;
    public boolean l;
    public dmza t;
    public dpit u;
    public int x;
    public dwak z;
    public dssd<Integer, dwag> n = dssd.b;
    private byte G = 2;
    public dsrj<dpkf> b = dssu.b;
    public dsrj<dpjp> c = dssu.b;
    public int d = 6;
    public dsrj<dpie> e = dssu.b;
    public dsrj<dpiz> f = dssu.b;
    public dsrj<dozz> m = dssu.b;
    public dsrj<dpce> o = dssu.b;
    public dsrj<dvzn> p = dssu.b;
    public dsrj<dwae> q = dssu.b;
    public dspd r = dspd.b;
    public dsrj<dpeq> s = dssu.b;
    public dsrj<dovp> v = dssu.b;
    public dsrj<dovh> w = dssu.b;
    public dspd y = dspd.b;
    public dsrj<dvzt> E = dssu.b;

    static {
        dvzu dvzuVar = new dvzu();
        F = dvzuVar;
        dsqw.cc(dvzu.class, dvzuVar);
    }

    private dvzu() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(F, "\u0001\u001e\u0000\u0001\u0001(\u001e\u0001\f\r\u0001Л\u0002Л\u0003င\u0001\u0004ဌ\u0005\u0007ဇ\u0007\b\u001b\tည\t\nЛ\u000eဉ\f\u000fင\u0002\u0011ᐉ\r\u0012ဇ\b\u0013Л\u0014Л\u0015င\u000e\u0016ဇ\u0004\u0017ဉ\u0011\u0018ည\u000f\u0019ᐉ\u0012\u001aЛ\u001bဉ\u0013\u001cЛ\u001dဌ\u0000 Л!Л\"ᐉ\u0014#ဇ\u0015$Л%\u001b(2", new Object[]{"a", "b", dpkf.class, "e", dpie.class, "g", "j", dovb.c(), "k", "p", dvzn.class, "r", "s", dpeq.class, "t", "h", "u", "l", "v", dovp.class, "w", dovh.class, "x", "i", "z", "y", "A", "m", dozz.class, "B", "c", dpjp.class, "d", dqvj.d(), "q", dwae.class, "o", dpce.class, "C", "D", "f", dpiz.class, "E", dvzt.class, "n", dvzp.a});
            }
            if (i2 == 3) {
                return new dvzu();
            }
            if (i2 == 4) {
                return new dvzo();
            }
            if (i2 == 5) {
                return F;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.G = b;
                return null;
            }
            dssr<dvzu> dssrVar = H;
            if (dssrVar == null) {
                synchronized (dvzu.class) {
                    dssrVar = H;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(F);
                        H = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.G);
    }

    public final void c() {
        dsrj<dpkf> dsrjVar = this.b;
        if (!dsrjVar.a()) {
            this.b = dsqw.cl(dsrjVar);
        }
    }

    public final void e() {
        dsrj<dpjp> dsrjVar = this.c;
        if (!dsrjVar.a()) {
            this.c = dsqw.cl(dsrjVar);
        }
    }

    public final void f() {
        dsrj<dpie> dsrjVar = this.e;
        if (!dsrjVar.a()) {
            this.e = dsqw.cl(dsrjVar);
        }
    }

    public final void g() {
        dsrj<dvzn> dsrjVar = this.p;
        if (!dsrjVar.a()) {
            this.p = dsqw.cl(dsrjVar);
        }
    }
}
