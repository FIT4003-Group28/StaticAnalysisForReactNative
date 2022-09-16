package defpackage;
/* compiled from: PG */
/* renamed from: dtsr  reason: default package */
/* loaded from: classes6.dex */
public final class dtsr extends dsqw<dtsr, dtsn> implements dssk {
    public static final dtsr c;
    private static volatile dssr<dtsr> d;
    public dtsq a;
    public dspt b;

    static {
        dtsr dtsrVar = new dtsr();
        c = dtsrVar;
        dsqw.cc(dtsr.class, dtsrVar);
    }

    private dtsr() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\t", new Object[]{"a", "b"});
            }
            if (i2 == 3) {
                return new dtsr();
            }
            if (i2 == 4) {
                return new dtsn();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dtsr> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dtsr.class) {
                    dssrVar = d;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(c);
                        d = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
