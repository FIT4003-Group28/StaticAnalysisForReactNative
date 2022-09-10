package defpackage;
/* compiled from: PG */
/* renamed from: dpax  reason: default package */
/* loaded from: classes6.dex */
public final class dpax extends dsqw<dpax, dpas> implements dssk {
    public static final dpax p;
    private static volatile dssr<dpax> r;
    public int a;
    public dpan b;
    public dgas c;
    public dquj d;
    public dqdk k;
    public boolean l;
    public dpar m;
    public dpau n;
    public dpaw o;
    private byte q = 2;
    public dsrj<dpce> e = dssu.b;
    public String f = "";
    public String g = "";
    public String h = "";
    public String i = "";
    public String j = "";

    static {
        dpax dpaxVar = new dpax();
        p = dpaxVar;
        dsqw.cc(dpax.class, dpaxVar);
    }

    private dpax() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(p, "\u0001\u000e\u0000\u0001\u0001\u000f\u000e\u0000\u0001\u0004\u0001ဉ\u0001\u0002ဉ\u0002\u0003Л\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဈ\u0005\u0007ᐉ\u0000\bဈ\u0006\tဉ\b\nᐉ\n\u000bᐉ\u000b\rဉ\r\u000eဇ\t\u000fဈ\u0007", new Object[]{"a", "c", "d", "e", dpce.class, "f", "g", "h", "b", "i", "k", "m", "n", "o", "l", "j"});
            }
            if (i2 == 3) {
                return new dpax();
            }
            if (i2 == 4) {
                return new dpas();
            }
            if (i2 == 5) {
                return p;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.q = b;
                return null;
            }
            dssr<dpax> dssrVar = r;
            if (dssrVar == null) {
                synchronized (dpax.class) {
                    dssrVar = r;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(p);
                        r = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.q);
    }
}
