package defpackage;
/* compiled from: PG */
/* renamed from: dtgp  reason: default package */
/* loaded from: classes6.dex */
public final class dtgp extends dsqw<dtgp, dtgo> implements dssk {
    public static final dtgp b;
    public static final dsqv<dsyn, dtgp> c;
    private static volatile dssr<dtgp> e;
    public dtgx a;
    private int d;

    static {
        dtgp dtgpVar = new dtgp();
        b = dtgpVar;
        dsqw.cc(dtgp.class, dtgpVar);
        c = dsqw.newSingularGeneratedExtension(dsyn.e, dtgpVar, dtgpVar, null, 284070414, dsur.MESSAGE, dtgp.class);
    }

    private dtgp() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0001\u0003\u0003\u0001\u0000\u0000\u0000\u0003ဉ\u0002", new Object[]{"d", "a"});
            }
            if (i2 == 3) {
                return new dtgp();
            }
            if (i2 == 4) {
                return new dtgo();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dtgp> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dtgp.class) {
                    dssrVar = e;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(b);
                        e = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
