package defpackage;
/* compiled from: PG */
/* renamed from: dipk  reason: default package */
/* loaded from: classes6.dex */
public final class dipk extends dsqw<dipk, dioj> implements dssk {
    public static final dipk x;
    private static volatile dssr<dipk> z;
    public int a;
    public Object c;
    public long d;
    public long e;
    public int f;
    public dipf h;
    public diph i;
    public diph k;
    public dior l;
    public dioz n;
    public int t;
    public dgbw u;
    public dgcc w;
    public int b = 0;
    private byte y = 2;
    public String g = "";
    public String j = "";
    public dsrj<diov> m = dssu.b;
    public String o = "";
    public String p = "";
    public String q = "";
    public String r = "";
    public String s = "";
    public String v = "";

    static {
        dipk dipkVar = new dipk();
        x = dipkVar;
        dsqw.cc(dipk.class, dipkVar);
    }

    private dipk() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(x, "\u0001\u0017\u0001\u0001\u0001\u0018\u0017\u0000\u0001\u0002\u0001ဈ\u0003\u0002ဉ\u0004\u0003ဉ\u0005\u0004ဉ\u0007\u0005ᐉ\b\u0006\u001b\u0007ဃ\u0000\bဃ\u0001\tဉ\f\nဈ\r\u000bဈ\u000f\fဈ\u000e\rဈ\u0006\u000eဌ\u0002\u000fြ\u0000\u0010ဈ\u0010\u0011ဈ\u0011\u0012ဌ\u0012\u0013ဉ\u0013\u0014ဈ\u0014\u0016ᐼ\u0000\u0017ြ\u0000\u0018ဉ\u0015", new Object[]{"c", "b", "a", "g", "h", "i", "k", "l", "m", diov.class, "d", "e", "n", "o", "q", "p", "j", "f", dgcd.a, dipj.class, "r", "s", "t", dgbx.a, "u", "v", diot.class, diox.class, "w"});
            }
            if (i2 == 3) {
                return new dipk();
            }
            if (i2 == 4) {
                return new dioj();
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
            dssr<dipk> dssrVar = z;
            if (dssrVar == null) {
                synchronized (dipk.class) {
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
