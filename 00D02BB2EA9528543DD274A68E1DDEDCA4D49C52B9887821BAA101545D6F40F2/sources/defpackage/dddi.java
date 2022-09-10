package defpackage;
/* compiled from: PG */
/* renamed from: dddi  reason: default package */
/* loaded from: classes5.dex */
public final class dddi extends dsqw<dddi, dddh> implements dssk {
    public static final dddi f;
    private static volatile dssr<dddi> g;
    public int a;
    public dspd b = dspd.b;
    public dspd c = dspd.b;
    public dspd d = dspd.b;
    public dspd e = dspd.b;

    static {
        dddi dddiVar = new dddi();
        f = dddiVar;
        dsqw.cc(dddi.class, dddiVar);
    }

    private dddi() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ည\u0000\u0002ည\u0001\u0003ည\u0002\u0004ည\u0003", new Object[]{"a", "b", "c", "d", "e"});
            }
            if (i2 == 3) {
                return new dddi();
            }
            if (i2 == 4) {
                return new dddh();
            }
            if (i2 == 5) {
                return f;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dddi> dssrVar = g;
            if (dssrVar == null) {
                synchronized (dddi.class) {
                    dssrVar = g;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(f);
                        g = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
