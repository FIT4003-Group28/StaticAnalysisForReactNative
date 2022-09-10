package defpackage;
/* compiled from: PG */
/* renamed from: ddyq  reason: default package */
/* loaded from: classes.dex */
public final class ddyq extends dsqw<ddyq, ddyf> implements dssk {
    public static final ddyq K;
    private static volatile dssr<ddyq> L;
    public int A;
    public int B;
    public int C;
    public int D;
    public boolean E;
    public String F;
    public int G;
    public ddln H;
    public boolean I;
    public int J;
    public int a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public boolean h;
    public int i;
    public boolean j;
    public boolean k;
    public boolean l;
    public boolean m;
    public int n;
    public int o;
    public int p;
    public int q;
    public int r;
    public boolean s;
    public int t;
    public int u;
    public int v;
    public String w = "";
    public int x;
    public boolean y;
    public int z;

    static {
        ddyq ddyqVar = new ddyq();
        K = ddyqVar;
        dsqw.cc(ddyq.class, ddyqVar);
    }

    private ddyq() {
        dsqz dsqzVar = dsqz.b;
        this.F = "";
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(K, "\u0001\"\u0000\u0002\u00011\"\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001\u0003ဌ\u0005\u0005င\u0007\u0006ဇ\b\u0007ဌ\u000b\bဇ\f\tဇ\u000f\nဌ\u0010\u000bဌ\u0011\fဌ\u0012\rဌ\u0013\u000fဌ\u0018\u0011င\u0019\u0012ဈ\u001a\u0015ဌ\u001d\u0016ဌ\u0003\u0017ဇ\u001e\u0018ဌ\u0015\u0019ဇ\r\u001aဇ\u000e\u001dဇ\u0016\u001eဌ\u0017!ဌ\"\"ဌ##င$$င%%င&,ဇ,-ဈ-.ဌ./ဉ/0ဇ01ဌ1", new Object[]{"a", "b", "c", dvep.a, "d", dumb.a, "f", ddyg.a, "g", "h", "i", ddyi.a, "j", "m", "n", ddyp.a, "o", ddyp.a, "p", durz.c(), "q", ddyl.a, "u", ddyk.a, "v", "w", "x", ddye.a, "e", ddyj.a, "y", "r", ddym.a, "k", "l", "s", "t", ddyo.a, "z", dszg.c(), "A", drtc.c(), "B", "C", "D", "E", "F", "G", ddyn.a, "H", "I", "J", ddyh.a});
            }
            if (i2 == 3) {
                return new ddyq();
            }
            if (i2 == 4) {
                return new ddyf();
            }
            if (i2 == 5) {
                return K;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<ddyq> dssrVar = L;
            if (dssrVar == null) {
                synchronized (ddyq.class) {
                    dssrVar = L;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(K);
                        L = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
