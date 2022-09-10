package defpackage;
/* compiled from: PG */
/* renamed from: ddsh  reason: default package */
/* loaded from: classes6.dex */
public final class ddsh extends dsqw<ddsh, ddrx> implements dssk {
    public static final ddsh w;
    private static volatile dssr<ddsh> x;
    public int a;
    public int b;
    public int c;
    public int d;
    public boolean e;
    public int f;
    public int g;
    public dsrj<ddsg> h = dssu.b;
    public ddmg i;
    public int j;
    public int k;
    public int l;
    public int m;
    public int n;
    public int o;
    public int p;
    public int q;
    public int r;
    public ddmg s;
    public int t;
    public int u;
    public int v;

    static {
        ddsh ddshVar = new ddsh();
        w = ddshVar;
        dsqw.cc(ddsh.class, ddshVar);
    }

    private ddsh() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(w, "\u0001\u0015\u0000\u0001\u0001\u0018\u0015\u0000\u0001\u0000\u0001င\u0000\u0002င\u0001\u0003ဌ\u0002\u0004ဇ\u0003\u0005င\u0004\u0006င\u0005\u0007\u001b\bဉ\u0006\tင\u0007\u000bင\t\fင\n\u000fင\r\u0010င\u000e\u0011င\u000f\u0012င\u0010\u0013င\u0011\u0014င\u0012\u0015ဉ\u0013\u0016င\u0014\u0017င\u0015\u0018င\u0016", new Object[]{"a", "b", "c", "d", ddrz.c(), "e", "f", "g", "h", ddsg.class, "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v"});
            }
            if (i2 == 3) {
                return new ddsh();
            }
            if (i2 == 4) {
                return new ddrx();
            }
            if (i2 == 5) {
                return w;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<ddsh> dssrVar = x;
            if (dssrVar == null) {
                synchronized (ddsh.class) {
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
