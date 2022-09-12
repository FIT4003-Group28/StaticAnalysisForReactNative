package defpackage;
/* compiled from: PG */
/* renamed from: ccma  reason: default package */
/* loaded from: classes4.dex */
public final class ccma extends dsqw<ccma, cclx> implements dssk {
    public static final dsrg<Integer, cclz> b = new cclw();
    public static final ccma c;
    private static volatile dssr<ccma> d;
    public dsrf a = dsqz.b;

    static {
        ccma ccmaVar = new ccma();
        c = ccmaVar;
        dsqw.cc(ccma.class, ccmaVar);
    }

    private ccma() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001e", new Object[]{"a", cclz.c()});
            }
            if (i2 == 3) {
                return new ccma();
            }
            if (i2 == 4) {
                return new cclx();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<ccma> dssrVar = d;
            if (dssrVar == null) {
                synchronized (ccma.class) {
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
