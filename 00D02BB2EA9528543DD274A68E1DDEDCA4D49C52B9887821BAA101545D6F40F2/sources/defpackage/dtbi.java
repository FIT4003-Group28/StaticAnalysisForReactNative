package defpackage;
/* compiled from: PG */
/* renamed from: dtbi  reason: default package */
/* loaded from: classes6.dex */
public final class dtbi extends dsqw<dtbi, dtbe> implements dssk {
    public static final dtbi y;
    private static volatile dssr<dtbi> z;
    public int a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int h;
    public boolean j;
    public boolean k;
    public boolean l;
    public boolean m;
    public boolean n;
    public boolean o;
    public int p;
    public int q;
    public int r;
    public int s;
    public int t;
    public ddjb w;
    public long x;
    public String g = "";
    public String i = "";
    public String u = "";
    public dsrj<String> v = dssu.b;

    static {
        dtbi dtbiVar = new dtbi();
        y = dtbiVar;
        dsqw.cc(dtbi.class, dtbiVar);
    }

    private dtbi() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(y, "\u0001\u0017\u0000\u0001\u0001\u0019\u0017\u0000\u0001\u0000\u0001ဌ\u0000\u0002ဌ\u0001\u0003ဌ\u0002\u0004ဌ\u0003\u0005ဌ\u0004\u0006ဈ\u0005\u0007ဌ\u0006\bဈ\u0007\tဇ\b\nဇ\t\u000bဇ\n\fဇ\u000b\rဇ\f\u000eင\u000e\u000fင\u000f\u0010ဌ\u0010\u0013င\u0014\u0014ဈ\u0015\u0015\u001a\u0016ဇ\r\u0017ဉ\u0016\u0018ဂ\u0017\u0019ဌ\u0013", new Object[]{"a", "b", dgpr.a, "c", dgpu.c(), "d", dgpw.d(), "e", dtbh.c(), "f", dgpm.c(), "g", "h", dtbf.a, "i", "j", "k", "l", "m", "n", "p", "q", "r", crud.a, "t", "u", "v", "o", "w", "x", "s", cruf.c()});
            }
            if (i2 == 3) {
                return new dtbi();
            }
            if (i2 == 4) {
                return new dtbe();
            }
            if (i2 == 5) {
                return y;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dtbi> dssrVar = z;
            if (dssrVar == null) {
                synchronized (dtbi.class) {
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
