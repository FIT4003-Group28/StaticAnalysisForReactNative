package defpackage;
/* compiled from: PG */
/* renamed from: dksh  reason: default package */
/* loaded from: classes.dex */
public final class dksh extends dsqw<dksh, dkrp> implements dksi {
    public static final dksh L;
    private static volatile dssr<dksh> P;
    public boolean A;
    public boolean C;
    public boolean D;
    public boolean E;
    public boolean F;
    public dkse G;
    public dkrz H;
    public int I;
    public int J;
    public int K;
    private int M;
    private int N;
    private int O;
    public int a;
    public boolean n;
    public int o;
    public dkrt s;
    public dkrv t;
    public int u;
    public boolean v;
    public boolean w;
    public dkro x;
    public int y;
    public boolean z;
    public int b = 86400;
    public int c = 25;
    public int d = 5000;
    public int e = 10000;
    public int f = 7000;
    public int g = 2000;
    public int h = 500;
    public int i = 1000;
    public int j = 15000;
    public int k = 10000;
    public float l = 1.0f;
    public float m = 12.0f;
    public dsrj<dksb> p = dssu.b;
    public int q = 2500;
    public long r = 117649;
    public int B = 1;

    static {
        dksh dkshVar = new dksh();
        L = dkshVar;
        dsqw.cc(dksh.class, dkshVar);
    }

    private dksh() {
        dsqz dsqzVar = dsqz.b;
        this.I = 300000;
        this.J = 600000;
        this.K = 1000;
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(L, "\u0001$\u0000\u0004\u0002s$\u0000\u0001\u0000\u0002င\u0001\u0005င\u0005\tင\n\fင\u0010\rင\f\u000fခ\u0015\u0010ခ\u0016\u0011င\u000b\u0012င\u0012\u0013ဇ\u0017\u0014ဌ\u0018\u0015\u001b\u0016င\u001a\u0019ဂ\u001d\u001bဉ \u001eဉ\"-ဌ0.င\u00114ဇ45ဇ5CဉIDဌJFဇKIဇMVင\tXင\u0013]ဇ\\^ဇ]_ဇ^fဉdhဇ_jဉhmငjnငkrငRsငp", new Object[]{"M", "N", "a", "O", "b", "c", "e", "h", "g", "l", "m", "f", "j", "n", "o", dkrw.a, "p", dksb.class, "q", "r", "s", "t", "u", dksg.c(), "i", "v", "w", "x", "y", dkrq.a, "z", "A", "d", "k", "C", "D", "E", "G", "F", "H", "I", "J", "B", "K"});
            }
            if (i2 == 3) {
                return new dksh();
            }
            if (i2 == 4) {
                return new dkrp();
            }
            if (i2 == 5) {
                return L;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dksh> dssrVar = P;
            if (dssrVar == null) {
                synchronized (dksh.class) {
                    dssrVar = P;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(L);
                        P = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
