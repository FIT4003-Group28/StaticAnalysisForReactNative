package defpackage;
/* compiled from: PG */
/* renamed from: dprk  reason: default package */
/* loaded from: classes6.dex */
public final class dprk extends dsqw<dprk, dprj> implements dssk {
    public static final dprk d;
    private static volatile dssr<dprk> g;
    public int a = 0;
    public dspd b = dspd.b;
    public String c = "";
    private int e;
    private Object f;

    static {
        dprk dprkVar = new dprk();
        d = dprkVar;
        dsqw.cc(dprk.class, dprkVar);
    }

    private dprk() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0003\u0001\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ည\u0000\u0002ဈ\u0001\u0003ြ\u0000", new Object[]{"f", "a", "e", "b", "c", dpyh.class});
            }
            if (i2 == 3) {
                return new dprk();
            }
            if (i2 == 4) {
                return new dprj();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dprk> dssrVar = g;
            if (dssrVar == null) {
                synchronized (dprk.class) {
                    dssrVar = g;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(d);
                        g = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
