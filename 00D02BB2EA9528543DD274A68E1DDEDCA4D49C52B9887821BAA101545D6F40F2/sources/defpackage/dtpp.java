package defpackage;
/* compiled from: PG */
/* renamed from: dtpp  reason: default package */
/* loaded from: classes6.dex */
public final class dtpp extends dsqw<dtpp, dtpo> implements dssk {
    public static final dtpp a;
    private static volatile dssr<dtpp> b;

    static {
        dtpp dtppVar = new dtpp();
        a = dtppVar;
        dsqw.cc(dtpp.class, dtppVar);
    }

    private dtpp() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(a, "\u0001\u0000", null);
            }
            if (i2 == 3) {
                return new dtpp();
            }
            if (i2 == 4) {
                return new dtpo();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dtpp> dssrVar = b;
            if (dssrVar == null) {
                synchronized (dtpp.class) {
                    dssrVar = b;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(a);
                        b = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
