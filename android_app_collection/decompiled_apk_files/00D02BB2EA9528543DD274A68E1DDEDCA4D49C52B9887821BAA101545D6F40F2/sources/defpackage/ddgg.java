package defpackage;
/* compiled from: PG */
/* renamed from: ddgg  reason: default package */
/* loaded from: classes.dex */
public final class ddgg extends dsqw<ddgg, ddfx> implements ddgh {
    public static final ddgg y;
    private static volatile dssr<ddgg> z;
    public int a;
    public int b;
    public int c;
    public String d = "";
    public int e;
    public ddfz f;
    public String g;
    public ddgf h;
    public dsrj<ddgf> i;
    public boolean j;
    public int k;
    public int l;
    public int m;
    public int n;
    public int o;
    public int p;
    public int q;
    public int r;
    public int s;
    public int t;
    public int u;
    public String v;
    public boolean w;
    public ddgb x;

    static {
        ddgg ddggVar = new ddgg();
        y = ddggVar;
        dsqw.cc(ddgg.class, ddggVar);
    }

    private ddgg() {
        dsqz dsqzVar = dsqz.b;
        this.g = "";
        this.i = dssu.b;
        this.v = "";
        dsrx dsrxVar = dsrx.b;
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(y, "\u0001\u0015\u0000\u0003\u0002_\u0015\u0000\u0001\u0000\u0002ဈ\u0004\u0003ဉ\u0007\u0004ဈ\b\u0005ဉ\f\u0006\u001b\u0007ဇ\u0016\bဋ\u0017\tဋ\u0018\nဋ\u0019\u000bဋ\u001a\fဋ\u001c\rဋ\"\u0011ဋ$\u0012ဋ%\u0013ဋ&\u0014ဋ'\u0015ဈ)\u0017ဌ\u0006\u0019ဋ#+ဇC_ဉR", new Object[]{"a", "b", "c", "d", "f", "g", "h", "i", ddgf.class, "j", "k", "l", "m", "n", "o", "p", "r", "s", "t", "u", "v", "e", ddgc.a, "q", "w", "x"});
            }
            if (i2 == 3) {
                return new ddgg();
            }
            if (i2 == 4) {
                return new ddfx();
            }
            if (i2 == 5) {
                return y;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<ddgg> dssrVar = z;
            if (dssrVar == null) {
                synchronized (ddgg.class) {
                    dssrVar = z;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(y);
                        z = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
