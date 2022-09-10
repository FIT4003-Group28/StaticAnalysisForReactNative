package defpackage;
/* compiled from: PG */
/* renamed from: dnms  reason: default package */
/* loaded from: classes6.dex */
public final class dnms extends dsqw<dnms, dnlt> implements dssk {
    public static final dnms e;
    private static volatile dssr<dnms> g;
    public int a;
    public dnmr b;
    public dqgw c;
    public dnlx d;
    private byte f = 2;

    static {
        dnms dnmsVar = new dnms();
        e = dnmsVar;
        dsqw.cc(dnms.class, dnmsVar);
    }

    private dnms() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0001\u0001ဉ\u0000\u0002ᐉ\u0001\u0003ဉ\u0002", new Object[]{"a", "b", "c", "d"});
            }
            if (i2 == 3) {
                return new dnms();
            }
            if (i2 == 4) {
                return new dnlt();
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
            dssr<dnms> dssrVar = g;
            if (dssrVar == null) {
                synchronized (dnms.class) {
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
