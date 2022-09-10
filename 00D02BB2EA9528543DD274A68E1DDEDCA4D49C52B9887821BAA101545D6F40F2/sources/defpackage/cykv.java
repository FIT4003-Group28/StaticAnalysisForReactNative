package defpackage;
/* compiled from: PG */
/* renamed from: cykv  reason: default package */
/* loaded from: classes5.dex */
public final class cykv extends dsqw<cykv, cyku> implements dssk {
    public static final cykv b;
    private static volatile dssr<cykv> c;
    public int a;

    static {
        cykv cykvVar = new cykv();
        b = cykvVar;
        dsqw.cc(cykv.class, cykvVar);
    }

    private cykv() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0004", new Object[]{"a"});
            }
            if (i2 == 3) {
                return new cykv();
            }
            if (i2 == 4) {
                return new cyku();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<cykv> dssrVar = c;
            if (dssrVar == null) {
                synchronized (cykv.class) {
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
