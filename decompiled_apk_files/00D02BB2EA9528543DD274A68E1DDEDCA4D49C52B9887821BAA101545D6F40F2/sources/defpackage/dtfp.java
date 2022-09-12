package defpackage;
/* compiled from: PG */
/* renamed from: dtfp  reason: default package */
/* loaded from: classes6.dex */
public final class dtfp extends dsqw<dtfp, dtfo> implements dssk {
    public static final dtfp a;
    private static volatile dssr<dtfp> b;

    static {
        dtfp dtfpVar = new dtfp();
        a = dtfpVar;
        dsqw.cc(dtfp.class, dtfpVar);
    }

    private dtfp() {
        dsrx dsrxVar = dsrx.b;
        dssu<Object> dssuVar = dssu.b;
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(a, "\u0000\u0000", null);
            }
            if (i2 == 3) {
                return new dtfp();
            }
            if (i2 == 4) {
                return new dtfo();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dtfp> dssrVar = b;
            if (dssrVar == null) {
                synchronized (dtfp.class) {
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
