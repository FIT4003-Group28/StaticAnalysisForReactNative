package defpackage;
/* compiled from: PG */
/* renamed from: dtpt  reason: default package */
/* loaded from: classes6.dex */
public final class dtpt extends dsqw<dtpt, dtpq> implements dssk {
    public static final dtpt b;
    private static volatile dssr<dtpt> c;
    public dsrj<dtps> a = dssu.b;

    static {
        dtpt dtptVar = new dtpt();
        b = dtptVar;
        dsqw.cc(dtpt.class, dtptVar);
    }

    private dtpt() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", dtps.class});
            }
            if (i2 == 3) {
                return new dtpt();
            }
            if (i2 == 4) {
                return new dtpq();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dtpt> dssrVar = c;
            if (dssrVar == null) {
                synchronized (dtpt.class) {
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
