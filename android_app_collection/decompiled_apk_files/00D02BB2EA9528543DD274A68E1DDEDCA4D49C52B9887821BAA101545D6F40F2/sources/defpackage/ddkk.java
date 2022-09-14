package defpackage;
/* compiled from: PG */
/* renamed from: ddkk  reason: default package */
/* loaded from: classes.dex */
public final class ddkk extends dsqw<ddkk, ddjx> implements dssk {
    public static final ddkk C;
    private static volatile dssr<ddkk> D;
    public boolean A;
    public int B;
    public int a;
    public int b;
    public int c;
    public boolean d;
    public boolean e;
    public boolean f;
    public boolean g;
    public boolean h;
    public boolean i;
    public boolean j;
    public boolean k;
    public boolean l;
    public int m;
    public int n;
    public int o;
    public int p;
    public boolean q;
    public int r;
    public boolean s;
    public int t;
    public int u;
    public dsrj<ddkj> v;
    public dsrj<ddkh> w;
    public dsrj<ddkf> x;
    public ddix y;
    public ddjz z;

    static {
        ddkk ddkkVar = new ddkk();
        C = ddkkVar;
        dsqw.cc(ddkk.class, ddkkVar);
    }

    private ddkk() {
        dssu<Object> dssuVar = dssu.b;
        this.n = 1;
        this.o = 1;
        this.p = 1;
        this.u = 1;
        this.v = dssu.b;
        this.w = dssu.b;
        this.x = dssu.b;
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(C, "\u0001\u001a\u0000\u0002\u00019\u001a\u0000\u0003\u0000\u0001ဌ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004ဇ\u0003\u0005ဇ\u0007\u0006ဇ\b\u0007ဇ\u000b\bဇ\f\nဌ\u000e\fဇ\u0004\rဇ\u0005\u0011ဌ\u0013\u0013ဌ\u001d\u0014င!\u0015ဇ\"\u001bဌ)\u001cဌ*\u001d\u001b\"ဉ.1ဌ\u001a2\u001b3\u001b4ဇ 6ဇ38ဉ19ဌ4", new Object[]{"a", "b", "c", dowa.c(), "d", "e", "f", "i", "j", "k", "l", "m", dqvj.d(), "g", "h", "n", ddjv.a, "p", ddkb.a, "r", "s", "t", ddkc.a, "u", ddjv.a, "v", ddkj.class, "y", "o", ddjv.a, "w", ddkh.class, "x", ddkf.class, "q", "A", "z", "B", ddka.a});
            }
            if (i2 == 3) {
                return new ddkk();
            }
            if (i2 == 4) {
                return new ddjx();
            }
            if (i2 == 5) {
                return C;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<ddkk> dssrVar = D;
            if (dssrVar == null) {
                synchronized (ddkk.class) {
                    dssrVar = D;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(C);
                        D = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
