package defpackage;
/* compiled from: PG */
/* renamed from: aqxp  reason: default package */
/* loaded from: classes2.dex */
public final class aqxp extends dsqw<aqxp, aqxn> implements dssk {
    public static final aqxp b;
    private static volatile dssr<aqxp> c;
    public int a;

    static {
        aqxp aqxpVar = new aqxp();
        b = aqxpVar;
        dsqw.cc(aqxp.class, aqxpVar);
    }

    private aqxp() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\f", new Object[]{"a"});
            }
            if (i2 == 3) {
                return new aqxp();
            }
            if (i2 == 4) {
                return new aqxn();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<aqxp> dssrVar = c;
            if (dssrVar == null) {
                synchronized (aqxp.class) {
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
