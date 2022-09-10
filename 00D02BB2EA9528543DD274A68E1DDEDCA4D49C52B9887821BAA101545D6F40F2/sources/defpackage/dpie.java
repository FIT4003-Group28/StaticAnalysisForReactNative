package defpackage;
/* compiled from: PG */
/* renamed from: dpie  reason: default package */
/* loaded from: classes6.dex */
public final class dpie extends dsqs<dpie, dphr> implements dsqt {
    public static final dpie C;
    private static volatile dssr<dpie> E;
    public doxl B;
    public int a;
    public dpec d;
    public dpeq f;
    public int i;
    public dgas j;
    public int m;
    public dgas n;
    public dozz o;
    public doxf p;
    public boolean q;
    public dpfh r;
    public int s;
    public dpid w;
    public int z;
    private byte D = 2;
    public String b = "";
    public String c = "";
    public dsrj<dpbp> e = dssu.b;
    public dspd g = dspd.b;
    public dsrj<dqtp> h = dssu.b;
    public dsrj<String> k = dssu.b;
    public dsrj<String> l = dssu.b;
    public dspd t = dspd.b;
    public dspd u = dspd.b;
    public dspd v = dspd.b;
    public dsrj<dphx> x = dssu.b;
    public dsrj<dpik> y = dssu.b;
    public String A = "";

    static {
        dpie dpieVar = new dpie();
        C = dpieVar;
        dsqw.cc(dpie.class, dpieVar);
    }

    private dpie() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(C, "\u0001\u001b\u0000\u0001\u0001(\u001b\u0000\u0006\u0007\u0001ᐉ\u0003\u0002Л\u0004ᐉ\u0004\u0005ဈ\u0000\u0006ဈ\u0001\tင\u0007\u000b\u001a\f\u001a\rဌ\n\u000eဉ\t\u000fဉ\u000b\u0010ᐉ\f\u0012ဉ\u000e\u0016ဇ\u0010\u0017ᐉ\u0011\u001aည\u0014\u001bည\u0015\u001cᐉ\u0017\u001eЛ!င\u0012\"\u001b#ည\u0006$ဌ\u001a%ည\u0016&\u001b'ဈ\u001b(ဉ\u001c", new Object[]{"a", "d", "e", dpbp.class, "f", "b", "c", "i", "k", "l", "m", dpht.c(), "j", "n", "o", "p", "q", "r", "t", "u", "w", "x", dphx.class, "s", "y", dpik.class, "g", "z", dphv.c(), "v", "h", dqtp.class, "A", "B"});
            }
            if (i2 == 3) {
                return new dpie();
            }
            if (i2 == 4) {
                return new dphr();
            }
            if (i2 == 5) {
                return C;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.D = b;
                return null;
            }
            dssr<dpie> dssrVar = E;
            if (dssrVar == null) {
                synchronized (dpie.class) {
                    dssrVar = E;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(C);
                        E = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.D);
    }

    public final void b() {
        dsrj<dpbp> dsrjVar = this.e;
        if (!dsrjVar.a()) {
            this.e = dsqw.cl(dsrjVar);
        }
    }
}
