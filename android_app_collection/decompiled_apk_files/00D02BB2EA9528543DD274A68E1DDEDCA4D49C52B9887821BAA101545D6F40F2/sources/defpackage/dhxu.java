package defpackage;
/* compiled from: PG */
/* renamed from: dhxu  reason: default package */
/* loaded from: classes.dex */
public final class dhxu extends dsqw<dhxu, dhxt> implements dssk {
    public static final dhxu s;
    private static volatile dssr<dhxu> t;
    public int a;
    public dnpq e;
    public dwfl h;
    public dhti k;
    public int l;
    public dgaq m;
    public int n;
    public dgaq o;
    public int p;
    public dgaq q;
    public dqja r;
    public String b = "";
    public String c = "";
    public int d = 1;
    public String f = "";
    public dsrj<String> g = dssu.b;
    public String i = "";
    public String j = "";

    static {
        dhxu dhxuVar = new dhxu();
        s = dhxuVar;
        dsqw.cc(dhxu.class, dhxuVar);
    }

    private dhxu() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(s, "\u0001\u0011\u0000\u0001\u0001\u0019\u0011\u0000\u0001\u0000\u0001ဈ\u0001\u0002ဈ\u0004\u0003\u001a\u0005ဉ\u0005\bဈ\u0006\nဈ\u0000\rဉ\u0003\u000eဌ\u0002\u000fဉ\t\u0010ဆ\u000b\u0011ဆ\r\u0012ဉ\u0011\u0014ဆ\u000f\u0015ဈ\u0007\u0017ဉ\f\u0018ဉ\u000e\u0019ဉ\u0010", new Object[]{"a", "c", "f", "g", "h", "i", "b", "e", "d", dpuk.c(), "k", "l", "n", "r", "p", "j", "m", "o", "q"});
            }
            if (i2 == 3) {
                return new dhxu();
            }
            if (i2 == 4) {
                return new dhxt();
            }
            if (i2 == 5) {
                return s;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dhxu> dssrVar = t;
            if (dssrVar == null) {
                synchronized (dhxu.class) {
                    dssrVar = t;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(s);
                        t = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
