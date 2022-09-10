package defpackage;
/* compiled from: PG */
/* renamed from: docg  reason: default package */
/* loaded from: classes.dex */
public final class docg extends dsqw<docg, docc> implements dssk {
    public static final docg M;
    private static volatile dssr<docg> P;
    public dnti A;
    public int C;
    public int D;
    public int E;
    public long F;
    public dqwy G;
    public drfu H;
    public int a;
    public int b;
    public Object d;
    public Object f;
    public Object h;
    public dpsn j;
    public dnpq m;
    public dnfg n;
    public long p;
    public int q;
    public boolean t;
    public dnpq z;
    public int c = 0;
    public int e = 0;
    public int g = 0;
    private dssd<String, doce> N = dssd.b;
    private byte O = 2;
    public String i = "";
    public String k = "";
    public String l = "";
    public String o = "";
    public String r = "";
    public String s = "";
    public String u = "";
    public String v = "";
    public dsrj<drew> w = dssu.b;
    public dsrj<drew> x = dssu.b;
    public String y = "";
    public dsrj<dnwl> B = dssu.b;
    public String I = "";
    public dsrj<dreq> J = dssu.b;
    public dsrj<drfo> K = dssu.b;
    public String L = "";

    static {
        docg docgVar = new docg();
        M = docgVar;
        dsqw.cc(docg.class, docgVar);
    }

    private docg() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(M, "\u0001%\u0003\u0002\u0001<%\u0001\u0005\u0001\u0001ဉ\u0004\u0002ဈ\u0006\u0004ဈ\n\u0005င\t\u0007ဈ\u0003\bဉ\u0013\nဉ\u0014\u000bဈ\u0000\fဈ\u0002\rဉ\u0005\u000fЛ\u0010ဌ\u0015\u0011ဋ\u0016\u0012ဋ\u0017\u0013ဈ\u0012\u0019ဂ\u0018\u001cဂ\b\u001d\u001b\u001eဉ\u001a ဉ\u0001!ဈ\u000e%ဉ\u001b'ျ\u0000(ြ\u0000)ျ\u0001*ြ\u0001+ျ\u0002,ြ\u0002-\u001b.ဈ\u001c0ဈ\f1ဇ\r2\u001b4ဈ\u000f9ဈ%;2<\u001b", new Object[]{"d", "c", "f", "e", "h", "g", "a", "b", "m", "o", "r", "q", "l", "z", "A", "i", "k", "n", "B", dnwl.class, "C", dqjh.c(), "D", "E", "y", "F", "p", "w", drew.class, "G", "j", "u", "H", dczv.class, dczv.class, dczv.class, "J", dreq.class, "I", "s", "t", "K", drfo.class, "v", "L", "N", docf.a, "x", drew.class});
            }
            if (i2 == 3) {
                return new docg();
            }
            if (i2 == 4) {
                return new docc();
            }
            if (i2 == 5) {
                return M;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.O = b;
                return null;
            }
            dssr<docg> dssrVar = P;
            if (dssrVar == null) {
                synchronized (docg.class) {
                    dssrVar = P;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(M);
                        P = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.O);
    }
}
