package defpackage;
/* compiled from: PG */
/* renamed from: dhhi  reason: default package */
/* loaded from: classes6.dex */
public final class dhhi extends dsqs<dhhi, dhhh> implements dsqt {
    public static final dhhi d;
    private static volatile dssr<dhhi> g;
    public int a;
    public dhhg b;
    private ddyb e;
    private byte f = 2;
    public String c = "";

    static {
        dhhi dhhiVar = new dhhi();
        d = dhhiVar;
        dsqw.cc(dhhi.class, dhhiVar);
    }

    private dhhi() {
        dssu<Object> dssuVar = dssu.b;
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(d, "\u0001\u0003\u0000\u0001\u0003\n\u0003\u0000\u0000\u0001\u0003ᐉ\u0000\u0006ဉ\u0004\nဈ\u0007", new Object[]{"a", "e", "b", "c"});
            }
            if (i2 == 3) {
                return new dhhi();
            }
            if (i2 == 4) {
                return new dhhh();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.f = b;
                return null;
            }
            dssr<dhhi> dssrVar = g;
            if (dssrVar == null) {
                synchronized (dhhi.class) {
                    dssrVar = g;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(d);
                        g = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.f);
    }
}
