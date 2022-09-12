package defpackage;
/* compiled from: PG */
/* renamed from: dtgx  reason: default package */
/* loaded from: classes6.dex */
public final class dtgx extends dsqw<dtgx, dtgu> implements dssk {
    public static final dtgx b;
    private static volatile dssr<dtgx> c;
    public dsrj<dtgw> a = dssu.b;

    static {
        dtgx dtgxVar = new dtgx();
        b = dtgxVar;
        dsqw.cc(dtgx.class, dtgxVar);
    }

    private dtgx() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", dtgw.class});
            }
            if (i2 == 3) {
                return new dtgx();
            }
            if (i2 == 4) {
                return new dtgu();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dtgx> dssrVar = c;
            if (dssrVar == null) {
                synchronized (dtgx.class) {
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
