package defpackage;
/* compiled from: PG */
/* renamed from: dnfo  reason: default package */
/* loaded from: classes6.dex */
public final class dnfo extends dsqw<dnfo, dnfn> implements dssk {
    public static final dnfo d;
    private static volatile dssr<dnfo> e;
    public int a;
    public boolean b;
    public boolean c;

    static {
        dnfo dnfoVar = new dnfo();
        d = dnfoVar;
        dsqw.cc(dnfo.class, dnfoVar);
    }

    private dnfo() {
        dssu<Object> dssuVar = dssu.b;
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0002\u0003\u0002\u0000\u0000\u0000\u0002ဇ\u0000\u0003ဇ\u0001", new Object[]{"a", "b", "c"});
            }
            if (i2 == 3) {
                return new dnfo();
            }
            if (i2 == 4) {
                return new dnfn();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dnfo> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dnfo.class) {
                    dssrVar = e;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(d);
                        e = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
