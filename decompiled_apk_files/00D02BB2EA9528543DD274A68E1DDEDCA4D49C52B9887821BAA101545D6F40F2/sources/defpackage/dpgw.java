package defpackage;
/* compiled from: PG */
/* renamed from: dpgw  reason: default package */
/* loaded from: classes6.dex */
public final class dpgw extends dsqw<dpgw, dpgt> implements dssk {
    public static final dpgw r;
    private static volatile dssr<dpgw> t;
    public int a;
    public douj d;
    public dgaw e;
    public dgaw f;
    public dgaw g;
    public dgaw h;
    public dnoh i;
    public int p;
    public int q;
    private byte s = 2;
    public String b = "";
    public String c = "";
    public String j = "";
    public String k = "";
    public String l = "";
    public String m = "";
    public String n = "";
    public dsrj<dozz> o = dssu.b;

    static {
        dpgw dpgwVar = new dpgw();
        r = dpgwVar;
        dsqw.cc(dpgw.class, dpgwVar);
    }

    private dpgw() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(r, "\u0001\u0010\u0000\u0001\u0001\u0010\u0010\u0000\u0001\u0002\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဉ\u0003\u0004ဉ\u0004\u0005ဉ\u0007\u0006ဈ\t\u0007ဈ\f\bဉ\u0005\tဉ\u0006\nЛ\u000bဌ\r\fဈ\n\rဈ\u000b\u000eဈ\b\u000fဌ\u000e\u0010ᐉ\u0002", new Object[]{"a", "b", "c", "e", "f", "i", "k", "n", "g", "h", "o", dozz.class, "p", dpbw.c(), "l", "m", "j", "q", dpgu.a, "d"});
            }
            if (i2 == 3) {
                return new dpgw();
            }
            if (i2 == 4) {
                return new dpgt();
            }
            if (i2 == 5) {
                return r;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.s = b;
                return null;
            }
            dssr<dpgw> dssrVar = t;
            if (dssrVar == null) {
                synchronized (dpgw.class) {
                    dssrVar = t;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(r);
                        t = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.s);
    }
}
