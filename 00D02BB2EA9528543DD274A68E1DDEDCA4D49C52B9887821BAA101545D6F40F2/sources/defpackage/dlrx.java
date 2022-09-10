package defpackage;
/* compiled from: PG */
/* renamed from: dlrx  reason: default package */
/* loaded from: classes6.dex */
public final class dlrx extends dsqw<dlrx, dlru> implements dssk {
    public static final dlrx b;
    private static volatile dssr<dlrx> c;
    public dsrj<dlrw> a = dssu.b;

    static {
        dlrx dlrxVar = new dlrx();
        b = dlrxVar;
        dsqw.cc(dlrx.class, dlrxVar);
    }

    private dlrx() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", dlrw.class});
            }
            if (i2 == 3) {
                return new dlrx();
            }
            if (i2 == 4) {
                return new dlru();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dlrx> dssrVar = c;
            if (dssrVar == null) {
                synchronized (dlrx.class) {
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
