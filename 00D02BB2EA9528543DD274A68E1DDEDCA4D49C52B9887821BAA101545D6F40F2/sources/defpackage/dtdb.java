package defpackage;
/* compiled from: PG */
/* renamed from: dtdb  reason: default package */
/* loaded from: classes6.dex */
public final class dtdb extends dsqw<dtdb, dtda> implements dssk {
    public static final dtdb a;
    private static volatile dssr<dtdb> b;

    static {
        dtdb dtdbVar = new dtdb();
        a = dtdbVar;
        dsqw.cc(dtdb.class, dtdbVar);
    }

    private dtdb() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(a, "\u0000\u0000", null);
            }
            if (i2 == 3) {
                return new dtdb();
            }
            if (i2 == 4) {
                return new dtda();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dtdb> dssrVar = b;
            if (dssrVar == null) {
                synchronized (dtdb.class) {
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
