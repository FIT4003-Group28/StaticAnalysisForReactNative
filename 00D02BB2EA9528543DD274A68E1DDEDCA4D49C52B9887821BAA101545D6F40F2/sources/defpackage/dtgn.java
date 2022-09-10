package defpackage;
/* compiled from: PG */
/* renamed from: dtgn  reason: default package */
/* loaded from: classes6.dex */
public final class dtgn extends dsqw<dtgn, dtgl> implements dssk {
    public static final dtgn b;
    private static volatile dssr<dtgn> c;
    public dssd<String, String> a = dssd.b;

    static {
        dtgn dtgnVar = new dtgn();
        b = dtgnVar;
        dsqw.cc(dtgn.class, dtgnVar);
    }

    private dtgn() {
        dssu<Object> dssuVar = dssu.b;
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"a", dtgm.a});
            }
            if (i2 == 3) {
                return new dtgn();
            }
            if (i2 == 4) {
                return new dtgl();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dtgn> dssrVar = c;
            if (dssrVar == null) {
                synchronized (dtgn.class) {
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
