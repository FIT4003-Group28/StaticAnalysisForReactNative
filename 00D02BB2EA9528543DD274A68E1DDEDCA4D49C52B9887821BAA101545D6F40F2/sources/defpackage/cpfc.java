package defpackage;
/* compiled from: PG */
/* renamed from: cpfc  reason: default package */
/* loaded from: classes5.dex */
public final class cpfc extends dsqw<cpfc, cpfb> implements dssk {
    public static final cpfc a;
    public static final dsqv<dtrw, cpfc> b;
    private static volatile dssr<cpfc> e;
    private int c;
    private eavq d;

    static {
        cpfc cpfcVar = new cpfc();
        a = cpfcVar;
        dsqw.cc(cpfc.class, cpfcVar);
        b = dsqw.newSingularGeneratedExtension(dtrw.a, cpfcVar, cpfcVar, null, 339888364, dsur.MESSAGE, cpfc.class);
    }

    private cpfc() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(a, "\u0001\u0001\u0000\u0001\u0004\u0004\u0001\u0000\u0000\u0000\u0004ဉ\u0003", new Object[]{"c", "d"});
            }
            if (i2 == 3) {
                return new cpfc();
            }
            if (i2 == 4) {
                return new cpfb();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<cpfc> dssrVar = e;
            if (dssrVar == null) {
                synchronized (cpfc.class) {
                    dssrVar = e;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(a);
                        e = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
