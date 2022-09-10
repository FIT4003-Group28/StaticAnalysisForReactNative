package defpackage;
/* compiled from: PG */
/* renamed from: ccwf  reason: default package */
/* loaded from: classes4.dex */
public final class ccwf extends dsqw<ccwf, ccwc> implements dssk {
    public static final ccwf e;
    private static volatile dssr<ccwf> g;
    public int a;
    public ccwb b;
    public int c;
    public ccwm d;
    private byte f = 2;

    static {
        ccwf ccwfVar = new ccwf();
        e = ccwfVar;
        dsqw.cc(ccwf.class, ccwfVar);
    }

    private ccwf() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(e, "\u0001\u0003\u0000\u0001\u0002\u0004\u0003\u0000\u0000\u0001\u0002ဉ\u0000\u0003ဌ\u0001\u0004ᐉ\u0002", new Object[]{"a", "b", "c", ccwd.a, "d"});
            }
            if (i2 == 3) {
                return new ccwf();
            }
            if (i2 == 4) {
                return new ccwc();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.f = b;
                return null;
            }
            dssr<ccwf> dssrVar = g;
            if (dssrVar == null) {
                synchronized (ccwf.class) {
                    dssrVar = g;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(e);
                        g = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.f);
    }
}
