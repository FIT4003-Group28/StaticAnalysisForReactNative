package defpackage;
/* compiled from: PG */
/* renamed from: ddri  reason: default package */
/* loaded from: classes6.dex */
public final class ddri extends dsqw<ddri, ddrh> implements dssk {
    public static final ddri r;
    private static volatile dssr<ddri> v;
    public int a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public String k = "";
    public boolean l;
    public long m;
    public long n;
    public int o;
    public int p;
    public int q;
    private boolean s;
    private boolean t;
    private boolean u;

    static {
        ddri ddriVar = new ddri();
        r = ddriVar;
        dsqw.cc(ddri.class, ddriVar);
    }

    private ddri() {
    }

    public static /* synthetic */ void b(ddri ddriVar) {
        ddriVar.a |= 512;
        ddriVar.s = true;
    }

    public static /* synthetic */ void c(ddri ddriVar) {
        ddriVar.a |= 2048;
        ddriVar.t = true;
    }

    public static /* synthetic */ void d(ddri ddriVar) {
        ddriVar.a |= 131072;
        ddriVar.u = true;
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(r, "\u0001\u0013\u0000\u0001\u0001\u0015\u0013\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0002\u0004င\u0003\u0005င\u0004\u0006င\u0005\u0007င\u0006\bင\u0007\tင\b\nဇ\t\u000bဈ\n\fဇ\u000b\rဇ\f\u000eဂ\r\u000fဂ\u000e\u0010ဏ\u000f\u0011င\u0010\u0012ဇ\u0011\u0015င\u0014", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "s", "k", "t", "l", "m", "n", "o", "p", "u", "q"});
            }
            if (i2 == 3) {
                return new ddri();
            }
            if (i2 == 4) {
                return new ddrh();
            }
            if (i2 == 5) {
                return r;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<ddri> dssrVar = v;
            if (dssrVar == null) {
                synchronized (ddri.class) {
                    dssrVar = v;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(r);
                        v = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
