package defpackage;
/* compiled from: PG */
/* renamed from: dnhi  reason: default package */
/* loaded from: classes.dex */
public final class dnhi extends dsqw<dnhi, dnhf> implements dssk {
    public static final dnhi f;
    private static volatile dssr<dnhi> g;
    public int a;
    public int b;
    public String c = "";
    public String d = "";
    public int e;

    static {
        dnhi dnhiVar = new dnhi();
        f = dnhiVar;
        dsqw.cc(dnhi.class, dnhiVar);
    }

    private dnhi() {
        dssu<Object> dssuVar = dssu.b;
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(f, "\u0001\u0004\u0000\u0001\u0001\u0006\u0004\u0000\u0000\u0000\u0001ဌ\u0001\u0002ဈ\u0002\u0003ဈ\u0006\u0006င\u0007", new Object[]{"a", "b", dnhg.a, "c", "d", "e"});
            }
            if (i2 == 3) {
                return new dnhi();
            }
            if (i2 == 4) {
                return new dnhf();
            }
            if (i2 == 5) {
                return f;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dnhi> dssrVar = g;
            if (dssrVar == null) {
                synchronized (dnhi.class) {
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
