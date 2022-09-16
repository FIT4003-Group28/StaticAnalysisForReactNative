package defpackage;
/* compiled from: PG */
/* renamed from: dkht  reason: default package */
/* loaded from: classes6.dex */
public final class dkht extends dsqw<dkht, dkhm> implements dssk {
    public static final dkht ac;
    private static volatile dssr<dkht> af;
    public boolean A;
    public boolean B;
    public boolean C;
    public boolean D;
    public boolean E;
    public boolean F;
    public dkhl G;
    public boolean H;
    public boolean I;
    public boolean J;
    public boolean K;
    public boolean L;
    public boolean M;
    public boolean N;
    public boolean O;
    public int S;
    public boolean T;
    public boolean U;
    public boolean X;
    public boolean Z;
    public int a;
    public boolean aa;
    public boolean ab;
    private int ad;
    private int ae;
    public boolean e;
    public boolean f;
    public boolean g;
    public boolean i;
    public boolean j;
    public boolean k;
    public boolean l;
    public boolean m;
    public int n;
    public boolean o;
    public boolean p;
    public boolean q;
    public boolean r;
    public int s;
    public boolean t;
    public boolean u;
    public boolean v;
    public boolean w;
    public boolean y;
    public boolean z;
    public int b = 604800;
    public int c = 900;
    public int d = 30;
    public dsrj<String> h = dssu.b;
    public dsrj<String> x = dssu.b;
    public dsrj<String> P = dssu.b;
    public int Q = 5;
    public int R = 259200;
    public int V = 86400;
    public int W = 1800;
    public String Y = "";

    static {
        dkht dkhtVar = new dkht();
        ac = dkhtVar;
        dsqw.cc(dkht.class, dkhtVar);
    }

    private dkht() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(ac, "\u00015\u0000\u0003\u0002\u008b5\u0000\u0003\u0000\u0002င\u0000\u0003င\u0001\u0004ဇ\u0003\u0005ဇ\u0004\u0007ဇ\u0006\b\u001a\tဇ\u0007\nဇ\b\u000bဇ\t\u000fဌ\u000f\u0010ဇ\u0010\u0011ဇ\u0011\u0012ဇ\u0012\u0013ဇ\u000b\u0014ဇ\f\u0015ဌ\u0014\u0016ဇ\u0016\u0017ဇ\u0013\u0018ဇ\u0017\u0019ဇ\u0018\u001a\u001a\u001bဇ\u0019\u001dဇ\u001b\u001fဇ\u001d ဇ\u001e\"ဇ #ဇ!$ဇ\"%ဇ#'ဉ$(ဇ%)ဇ'*ဇ*+\u001a,ဇ\u0015/ဌ60င\u00021ဇ72ဇ83င94င:9ဇ)=ဇ(>ဇ&Bင4Dင5EဇCGဈDHဇ-JဇE\u0086ဇG\u0089ဇ.\u008bဇK", new Object[]{"ad", "ae", "a", "b", "c", "e", "f", "g", "h", "i", "j", "k", "n", dkhn.a, "o", "p", "q", "l", "m", "s", dkhp.a, "u", "r", "v", "w", "x", "y", "z", "A", "B", "C", "D", "E", "F", "G", "H", "J", "M", "P", "t", "S", dkhr.a, "d", "T", "U", "V", "W", "L", "K", "I", "Q", "R", "X", "Y", "N", "Z", "aa", "O", "ab"});
            }
            if (i2 == 3) {
                return new dkht();
            }
            if (i2 == 4) {
                return new dkhm();
            }
            if (i2 == 5) {
                return ac;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dkht> dssrVar = af;
            if (dssrVar == null) {
                synchronized (dkht.class) {
                    dssrVar = af;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(ac);
                        af = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
