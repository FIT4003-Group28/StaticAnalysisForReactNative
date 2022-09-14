package defpackage;
/* compiled from: PG */
/* renamed from: dfqq  reason: default package */
/* loaded from: classes6.dex */
public final class dfqq extends dsqs<dfqq, dfql> implements dsqt {
    private static volatile dssr<dfqq> A;
    public static final dfqq x;
    public int a;
    public dfqi f;
    public dgrh g;
    public int k;
    public long n;
    public long o;
    public int p;
    public boolean q;
    public long r;
    public dfqn s;
    public int u;
    private dsxz y;
    private byte z = 2;
    public String b = "";
    public String c = "";
    public String d = "";
    public String e = "";
    public String h = "";
    public dsrj<dszs> i = dssu.b;
    public String j = "";
    public String l = "";
    public String m = "";
    public dsrj<dfqk> t = dssu.b;
    public String v = "";
    public String w = "";

    static {
        dfqq dfqqVar = new dfqq();
        x = dfqqVar;
        dsqw.cc(dfqq.class, dfqqVar);
    }

    private dfqq() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(x, "\u0001\u0017\u0000\u0001\u0001$\u0017\u0000\u0002\u0002\u0001ဈ\u0000\u0002ဉ\u0004\u0003ᐉ\b\u0004ဈ\u000e\u0007ᐉ\u0005\t\u001b\u000bဈ\u0003\fဈ\u000f\rဂ\u0010\u000eဂ\u0011\u000fင\u0012\u0011ဇ\u0013\u0012ဂ\u0014\u0013ဈ\u0006\u0014ဈ\u0007\u0015ဌ\r\u001dဉ\u0018\u001e\u001b\u001fဌ\u0019!ဈ\u0001\"ဈ\u001a#ဈ\u001b$ဈ\u0002", new Object[]{"a", "b", "f", "y", "l", "g", "i", dszs.class, "e", "m", "n", "o", "p", "q", "r", "h", "j", "k", dgpw.d(), "s", "t", dfqk.class, "u", dgpp.a, "c", "v", "w", "d"});
            }
            if (i2 == 3) {
                return new dfqq();
            }
            if (i2 == 4) {
                return new dfql();
            }
            if (i2 == 5) {
                return x;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.z = b;
                return null;
            }
            dssr<dfqq> dssrVar = A;
            if (dssrVar == null) {
                synchronized (dfqq.class) {
                    dssrVar = A;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(x);
                        A = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.z);
    }
}
