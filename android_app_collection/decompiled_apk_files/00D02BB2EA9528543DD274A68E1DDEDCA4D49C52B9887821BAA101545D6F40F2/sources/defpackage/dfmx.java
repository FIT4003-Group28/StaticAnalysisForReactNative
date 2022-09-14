package defpackage;
/* compiled from: PG */
/* renamed from: dfmx  reason: default package */
/* loaded from: classes6.dex */
public final class dfmx extends dsqw<dfmx, dfmw> implements dssk {
    public static final dfmx b;
    private static volatile dssr<dfmx> d;
    public dspd a = dspd.b;
    private int c;

    static {
        dfmx dfmxVar = new dfmx();
        b = dfmxVar;
        dsqw.cc(dfmx.class, dfmxVar);
    }

    private dfmx() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ည\u0000", new Object[]{"c", "a"});
            }
            if (i2 == 3) {
                return new dfmx();
            }
            if (i2 == 4) {
                return new dfmw();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dfmx> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dfmx.class) {
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
