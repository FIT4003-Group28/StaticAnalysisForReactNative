package defpackage;
/* compiled from: PG */
/* renamed from: dpwf  reason: default package */
/* loaded from: classes6.dex */
public final class dpwf extends dsqw<dpwf, dpwa> implements dssk {
    public static final dpwf b;
    private static volatile dssr<dpwf> c;
    public dsrj<dpwc> a = dssu.b;

    static {
        dpwf dpwfVar = new dpwf();
        b = dpwfVar;
        dsqw.cc(dpwf.class, dpwfVar);
    }

    private dpwf() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", dpwc.class});
            }
            if (i2 == 3) {
                return new dpwf();
            }
            if (i2 == 4) {
                return new dpwa();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dpwf> dssrVar = c;
            if (dssrVar == null) {
                synchronized (dpwf.class) {
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
