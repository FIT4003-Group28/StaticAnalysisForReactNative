package defpackage;
/* compiled from: PG */
/* renamed from: ckwp  reason: default package */
/* loaded from: classes5.dex */
public final class ckwp extends dsqw<ckwp, ckwo> implements dssk {
    public static final ckwp b;
    private static volatile dssr<ckwp> c;
    public dsri a = dsrx.b;

    static {
        ckwp ckwpVar = new ckwp();
        b = ckwpVar;
        dsqw.cc(ckwp.class, ckwpVar);
    }

    private ckwp() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0014", new Object[]{"a"});
            }
            if (i2 == 3) {
                return new ckwp();
            }
            if (i2 == 4) {
                return new ckwo();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<ckwp> dssrVar = c;
            if (dssrVar == null) {
                synchronized (ckwp.class) {
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
