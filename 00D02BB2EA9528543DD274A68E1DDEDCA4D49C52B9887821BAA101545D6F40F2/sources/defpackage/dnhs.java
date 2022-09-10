package defpackage;
/* compiled from: PG */
/* renamed from: dnhs  reason: default package */
/* loaded from: classes.dex */
public final class dnhs extends dsqw<dnhs, dnhr> implements dssk {
    public static final dnhs a;
    private static volatile dssr<dnhs> e;
    private int b;
    private dnqh c;
    private byte d = 2;

    static {
        dnhs dnhsVar = new dnhs();
        a = dnhsVar;
        dsqw.cc(dnhs.class, dnhsVar);
    }

    private dnhs() {
        dssu<Object> dssuVar = dssu.b;
        dspd dspdVar = dspd.b;
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(a, "\u0001\u0001\u0000\u0001\u000f\u000f\u0001\u0000\u0000\u0001\u000fᐉ\u0012", new Object[]{"b", "c"});
            }
            if (i2 == 3) {
                return new dnhs();
            }
            if (i2 == 4) {
                return new dnhr();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.d = b;
                return null;
            }
            dssr<dnhs> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dnhs.class) {
                    dssrVar = e;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(a);
                        e = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.d);
    }
}
