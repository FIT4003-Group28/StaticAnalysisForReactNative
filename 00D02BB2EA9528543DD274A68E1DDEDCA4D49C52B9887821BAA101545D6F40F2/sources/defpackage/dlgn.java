package defpackage;
/* compiled from: PG */
/* renamed from: dlgn  reason: default package */
/* loaded from: classes6.dex */
public final class dlgn extends dsqw<dlgn, dlgg> implements dssk {
    public static final dlgn G;
    private static volatile dssr<dlgn> H;
    public long E;
    public int a;
    public int b;
    public Object d;
    public int e;
    public int f;
    public dlgf g;
    public dlgf h;
    public int i;
    public dlhd j;
    public boolean l;
    public boolean n;
    public long o;
    public boolean p;
    public boolean q;
    public dplx r;
    public long u;
    public long v;
    public int y;
    public dlgi z;
    public int c = 0;
    public String k = "";
    public boolean m = true;
    public dsrj<dlhl> s = dssu.b;
    public boolean t = true;
    public int w = 1;
    public String x = "";
    public boolean A = true;
    public String B = "";
    public String C = "";
    public String D = "";
    public String F = "";

    static {
        dlgn dlgnVar = new dlgn();
        G = dlgnVar;
        dsqw.cc(dlgn.class, dlgnVar);
    }

    private dlgn() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(G, "\u0001#\u0001\u0002\u0001&#\u0000\u0001\u0000\u0001ဌ\u0000\u0002ဉ\u0002\u0003ဉ\u0003\u0006ဌ\u0004\u0007ဈ\u0006\bဇ\u0007\tဂ\n\nဉ\r\u000bင\u0001\f\u001b\rဇ\u000e\u000eဂ\u000f\u000fဈ\u0012\u0010ဇ\u0015\u0011ြ\u0000\u0012ဂ\u0010\u0013ြ\u0000\u0014ဉ\u0005\u0015ဈ\u001d\u0016ဈ\u001e\u0017ဇ\b\u0018ြ\u0000\u0019ြ\u0000\u001aဌ\u0011\u001bြ\u0000\u001cြ\u0000\u001dဇ\u000b\u001eဈ\u001f\u001fဂ  ဈ!!ဉ\u0014#ဇ\f$ဇ\t%ဌ\u0013&ြ\u0000", new Object[]{"d", "c", "a", "b", "e", dlhe.a, "g", "h", "i", dlhm.a, "k", "l", "o", "r", "f", "s", dlhl.class, "t", "u", "x", "A", dlef.class, "v", dljr.class, "j", "B", "C", "m", dliv.class, dlib.class, "w", dlgl.a, dlgv.class, dlhz.class, "p", "D", "E", "F", "z", "q", "n", "y", dlgj.a, dlgz.class});
            }
            if (i2 == 3) {
                return new dlgn();
            }
            if (i2 == 4) {
                return new dlgg();
            }
            if (i2 == 5) {
                return G;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dlgn> dssrVar = H;
            if (dssrVar == null) {
                synchronized (dlgn.class) {
                    dssrVar = H;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(G);
                        H = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
