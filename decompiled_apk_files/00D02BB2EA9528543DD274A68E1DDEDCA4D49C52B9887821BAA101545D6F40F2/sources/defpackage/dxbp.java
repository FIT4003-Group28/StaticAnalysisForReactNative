package defpackage;
/* compiled from: PG */
/* renamed from: dxbp  reason: default package */
/* loaded from: classes6.dex */
public final class dxbp extends dsqw<dxbp, dxbe> implements dssk {
    public static final dxbp x;
    private static volatile dssr<dxbp> z;
    public int a;
    public dxbc e;
    public int f;
    public int g;
    public int h;
    public dwfl i;
    public dwzj j;
    public int l;
    public int m;
    public long n;
    public dqia r;
    public int s;
    public dxbo t;
    public drki u;
    public dxbm v;
    public dpmh w;
    private byte y = 2;
    public String b = "";
    public String c = "";
    public String d = "";
    public dsrj<dxbr> k = dssu.b;
    public String o = "";
    public String p = "";
    public String q = "";

    static {
        dxbp dxbpVar = new dxbp();
        x = dxbpVar;
        dsqw.cc(dxbp.class, dxbpVar);
    }

    private dxbp() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(x, "\u0001\u0016\u0000\u0001\u0001\u001f\u0016\u0000\u0001\u0006\u0001ᔈ\u0000\u0002ဈ\u0001\u0003ဌ\u0005\u0007ᐉ\f\u000bЛ\u000eင\u0011\u000fဈ\u0002\u0010ᐉ\u0003\u0012င\u0013\u0013င\u0007\u0014ဈ\u0015\u0015ဈ\u0016\u0016ဌ\u0004\u0017ဂ\u0014\u0018ဈ\u0017\u0019ဉ\u0018\u001aဌ\u0019\u001bᐉ\u001a\u001cဉ\b\u001dဉ\u001b\u001eᐉ\u001c\u001fဉ\u001d", new Object[]{"a", "b", "c", "g", dxbj.a, "j", "k", dxbr.class, "l", "d", "e", "m", "h", "o", "p", "f", dxbh.a, "n", "q", "r", "s", dxbf.a, "t", "i", "u", "v", "w"});
            }
            if (i2 == 3) {
                return new dxbp();
            }
            if (i2 == 4) {
                return new dxbe();
            }
            if (i2 == 5) {
                return x;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.y = b;
                return null;
            }
            dssr<dxbp> dssrVar = z;
            if (dssrVar == null) {
                synchronized (dxbp.class) {
                    dssrVar = z;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(x);
                        z = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.y);
    }
}
