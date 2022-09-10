package defpackage;
/* compiled from: PG */
/* renamed from: dtov  reason: default package */
/* loaded from: classes6.dex */
public final class dtov extends dsqw<dtov, dtou> implements dssk {
    public static final dtov o;
    private static volatile dssr<dtov> s;
    public int a;
    public dgrh d;
    public boolean e;
    public dgrn f;
    public boolean g;
    public boolean l;
    public boolean m;
    public boolean n;
    private dgrt p;
    private dtod q;
    private byte r = 2;
    public String b = "";
    public String c = "";
    public String h = "";
    public int i = -1;
    public dspd j = dspd.b;
    public String k = "";

    static {
        dtov dtovVar = new dtov();
        o = dtovVar;
        dsqw.cc(dtov.class, dtovVar);
    }

    private dtov() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(o, "\u0001\u000f\u0000\u0001\u0001\u0017\u000f\u0000\u0000\u0004\u0001ဈ\u0000\u0002ဈ\u0001\u0003ᐉ\u0002\u0004ᐉ\u0006\u0005ဈ\t\nဇ\u0007\fည\f\rᐉ\u0004\u000eᐉ\u0010\u0010ဌ\n\u0011ဇ\u0003\u0013ဈ\r\u0015ဇ\u0013\u0016ဇ\u0014\u0017ဇ\u0015", new Object[]{"a", "b", "c", "d", "f", "h", "g", "j", "p", "q", "i", dtnw.a, "e", "k", "l", "m", "n"});
            }
            if (i2 == 3) {
                return new dtov();
            }
            if (i2 == 4) {
                return new dtou();
            }
            if (i2 == 5) {
                return o;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.r = b;
                return null;
            }
            dssr<dtov> dssrVar = s;
            if (dssrVar == null) {
                synchronized (dtov.class) {
                    dssrVar = s;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(o);
                        s = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.r);
    }
}
