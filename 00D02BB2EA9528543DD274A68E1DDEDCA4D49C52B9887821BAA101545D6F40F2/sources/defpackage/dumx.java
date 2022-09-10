package defpackage;
/* compiled from: PG */
/* renamed from: dumx  reason: default package */
/* loaded from: classes6.dex */
public final class dumx extends dsqw<dumx, dumj> implements dssk {
    public static final dumx P;
    private static volatile dssr<dumx> Q;
    public dumv B;
    public int D;
    public long E;
    public long F;
    public boolean G;
    public dump I;
    public int M;
    public dumr N;
    public dhmr O;
    public int a;
    public int b;
    public dkgr e;
    public boolean g;
    public long k;
    public int o;
    public int p;
    public boolean q;
    public boolean r;
    public boolean s;
    public boolean t;
    public int u;
    public int v;
    public boolean w;
    public int x;
    public int y;
    public String c = "";
    public String d = "";
    public String f = "";
    public String h = "";
    public String i = "";
    public String j = "";
    public String l = "";
    public String m = "";
    public String n = "";
    public String z = "";
    public String A = "";
    public String C = "";
    public String H = "";
    public String J = "";
    public String K = "";
    public String L = "";

    static {
        dumx dumxVar = new dumx();
        P = dumxVar;
        dsqw.cc(dumx.class, dumxVar);
    }

    private dumx() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(P, "\u0001'\u0000\u0002\u0001*'\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0005\u0003ဈ\u0006\u0004ဈ\t\u0005ဈ\n\u0006ဈ\u000b\u0007ဌ\r\bဇ\u000e\tဇ\u000f\nဇ\u0010\u000bဌ\u0012\fဇ\u0014\rင\u0015\u000eင\u0016\u0010ဉ\u0019\u0011ဈ\u001a\u0012င\u001b\u0013ဂ\u001c\u0014ဂ\u001d\u0015ဇ\u001e\u0016ဈ\u001f\u0017ဈ\u0017\u0018ဈ\u0018\u0019ဉ \u001aဈ!\u001bဈ\"\u001cဇ\u0011\u001dဈ#\u001fဌ$ ဈ\u0001!ဈ\u0003\"ဌ\u0013#ဉ%%ဈ\u0007&ဂ\b'ဌ\f(ဇ\u0004)ဉ\u0002*ဉ'", new Object[]{"a", "b", "c", "h", "i", "l", "m", "n", "p", dumw.a, "q", "r", "s", "u", dumk.a, "w", "x", "y", "B", "C", "D", "E", "F", "G", "H", "z", "A", "I", "J", "K", "t", "L", "M", dumt.c(), "d", "f", "v", dumk.a, "N", "j", "k", "o", dvoz.c(), "g", "e", "O"});
            }
            if (i2 == 3) {
                return new dumx();
            }
            if (i2 == 4) {
                return new dumj();
            }
            if (i2 == 5) {
                return P;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dumx> dssrVar = Q;
            if (dssrVar == null) {
                synchronized (dumx.class) {
                    dssrVar = Q;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(P);
                        Q = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
