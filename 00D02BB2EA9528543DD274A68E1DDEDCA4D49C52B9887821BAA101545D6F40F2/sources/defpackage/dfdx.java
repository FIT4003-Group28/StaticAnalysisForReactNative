package defpackage;
/* compiled from: PG */
/* renamed from: dfdx  reason: default package */
/* loaded from: classes6.dex */
public final class dfdx extends dsqw<dfdx, dfdu> implements dssk {
    public static final dfdx b;
    private static volatile dssr<dfdx> c;
    public dsrj<dfdw> a = dssu.b;

    static {
        dfdx dfdxVar = new dfdx();
        b = dfdxVar;
        dsqw.cc(dfdx.class, dfdxVar);
    }

    private dfdx() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", dfdw.class});
            }
            if (i2 == 3) {
                return new dfdx();
            }
            if (i2 == 4) {
                return new dfdu();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dfdx> dssrVar = c;
            if (dssrVar == null) {
                synchronized (dfdx.class) {
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
