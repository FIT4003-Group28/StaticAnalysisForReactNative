package defpackage;
/* compiled from: PG */
/* renamed from: ddhm  reason: default package */
/* loaded from: classes5.dex */
public final class ddhm extends dsqw<ddhm, ddhl> implements dssk {
    public static final ddhm b;
    private static volatile dssr<ddhm> c;
    public dsrf a = dsqz.b;

    static {
        ddhm ddhmVar = new ddhm();
        b = ddhmVar;
        dsqw.cc(ddhm.class, ddhmVar);
    }

    private ddhm() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0016", new Object[]{"a"});
            }
            if (i2 == 3) {
                return new ddhm();
            }
            if (i2 == 4) {
                return new ddhl();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<ddhm> dssrVar = c;
            if (dssrVar == null) {
                synchronized (ddhm.class) {
                    dssrVar = c;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(b);
                        c = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
