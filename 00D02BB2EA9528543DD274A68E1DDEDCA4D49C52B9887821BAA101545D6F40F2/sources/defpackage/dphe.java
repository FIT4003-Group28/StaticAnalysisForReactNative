package defpackage;
/* compiled from: PG */
/* renamed from: dphe  reason: default package */
/* loaded from: classes6.dex */
public final class dphe extends dsqw<dphe, dpgz> implements dssk {
    public static final dphe x;
    private static volatile dssr<dphe> z;
    public int a;
    public dpgw c;
    public dpgw d;
    public int e;
    public doxn g;
    public int h;
    public dpce i;
    public boolean k;
    public long p;
    public int q;
    public dphd r;
    public dgas s;
    public dpjb t;
    public int u;
    public dpgf v;
    private byte y = 2;
    public String b = "";
    public String f = "";
    public dsrj<dpgw> j = dssu.b;
    public dsrj<dotv> l = dssu.b;
    public String m = "";
    public String n = "";
    public String o = "";
    public dsrj<dphb> w = dssu.b;

    static {
        dphe dpheVar = new dphe();
        x = dpheVar;
        dsqw.cc(dphe.class, dpheVar);
    }

    private dphe() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(x, "\u0001\u0016\u0000\u0001\u0001\u001e\u0016\u0000\u0003\u0005\u0001ᐉ\u0001\u0002ᐉ\u0002\u0003င\u0003\u0004ဈ\u0004\u0006ဉ\u0006\u0007င\u0007\bЛ\fဇ\u000b\rЛ\u000fဈ\r\u0010ဌ\u0011\u0011ဉ\u0012\u0012ဉ\u0013\u0013ဈ\u000e\u0016ဉ\u0015\u0017ᐉ\b\u0018င\u0016\u0019ဈ\u000f\u001aဉ\u0017\u001b\u001b\u001dဂ\u0010\u001eဈ\u0000", new Object[]{"a", "c", "d", "e", "f", "g", "h", "j", dpgw.class, "k", "l", dotv.class, "m", "q", dpkg.a, "r", "s", "n", "t", "i", "u", "o", "v", "w", dphb.class, "p", "b"});
            }
            if (i2 == 3) {
                return new dphe();
            }
            if (i2 == 4) {
                return new dpgz();
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
            dssr<dphe> dssrVar = z;
            if (dssrVar == null) {
                synchronized (dphe.class) {
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
