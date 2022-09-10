package defpackage;
/* compiled from: PG */
/* renamed from: dnxd  reason: default package */
/* loaded from: classes6.dex */
public final class dnxd extends dsqw<dnxd, dnxc> implements dssk {
    public static final dnxd b;
    private static volatile dssr<dnxd> d;
    public ddih a;
    private int c;

    static {
        dnxd dnxdVar = new dnxd();
        b = dnxdVar;
        dsqw.cc(dnxd.class, dnxdVar);
    }

    private dnxd() {
        dssu<Object> dssuVar = dssu.b;
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002ဉ\u0000", new Object[]{"c", "a"});
            }
            if (i2 == 3) {
                return new dnxd();
            }
            if (i2 == 4) {
                return new dnxc();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dnxd> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dnxd.class) {
                    dssrVar = d;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(b);
                        d = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
