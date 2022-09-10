package defpackage;
/* compiled from: PG */
/* renamed from: dpjx  reason: default package */
/* loaded from: classes.dex */
public final class dpjx extends dsqw<dpjx, dpjq> implements dssk {
    public static final dpjx n;
    private static volatile dssr<dpjx> o;
    public int a;
    public dnoh d;
    public int g;
    public dnfi h;
    public dpbj k;
    public boolean l;
    public dpju m;
    public String b = "";
    public String c = "";
    public String e = "";
    public int f = 4;
    public String i = "";
    public String j = "";

    static {
        dpjx dpjxVar = new dpjx();
        n = dpjxVar;
        dsqw.cc(dpjx.class, dpjxVar);
    }

    private dpjx() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(n, "\u0001\f\u0000\u0001\u0001\u0017\f\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဉ\u0002\u0004ဈ\u0007\u0005ဌ\b\u0006ဌ\t\u0007ဉ\n\rဈ\r\u000eဈ\u000f\u0010ဉ\u0010\u0012ဇ\u0011\u0017ဉ\u0012", new Object[]{"a", "b", "c", "d", "e", "f", dpjs.c(), "g", dpjv.a, "h", "i", "j", "k", "l", "m"});
            }
            if (i2 == 3) {
                return new dpjx();
            }
            if (i2 == 4) {
                return new dpjq();
            }
            if (i2 == 5) {
                return n;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dpjx> dssrVar = o;
            if (dssrVar == null) {
                synchronized (dpjx.class) {
                    dssrVar = o;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(n);
                        o = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
