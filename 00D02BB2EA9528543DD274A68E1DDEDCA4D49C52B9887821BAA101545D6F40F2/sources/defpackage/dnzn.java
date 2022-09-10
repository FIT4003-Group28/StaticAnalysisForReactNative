package defpackage;
/* compiled from: PG */
/* renamed from: dnzn  reason: default package */
/* loaded from: classes6.dex */
public final class dnzn extends dsqw<dnzn, dnzm> implements dssk {
    public static final dnzn d;
    private static volatile dssr<dnzn> f;
    public int a;
    public drco b;
    private byte e = 2;
    public String c = "";

    static {
        dnzn dnznVar = new dnzn();
        d = dnznVar;
        dsqw.cc(dnzn.class, dnznVar);
    }

    private dnzn() {
        dssu<Object> dssuVar = dssu.b;
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0001\u0002ဈ\u0002", new Object[]{"a", "b", "c"});
            }
            if (i2 == 3) {
                return new dnzn();
            }
            if (i2 == 4) {
                return new dnzm();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.e = b;
                return null;
            }
            dssr<dnzn> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dnzn.class) {
                    dssrVar = f;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(d);
                        f = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.e);
    }
}
