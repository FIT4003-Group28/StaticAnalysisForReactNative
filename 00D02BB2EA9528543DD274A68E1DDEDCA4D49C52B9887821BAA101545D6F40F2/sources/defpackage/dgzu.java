package defpackage;
/* compiled from: PG */
/* renamed from: dgzu  reason: default package */
/* loaded from: classes6.dex */
public final class dgzu extends dsqw<dgzu, dgzt> implements dssk {
    public static final dgzu b;
    private static volatile dssr<dgzu> c;
    public dhah a;

    static {
        dgzu dgzuVar = new dgzu();
        b = dgzuVar;
        dsqw.cc(dgzu.class, dgzuVar);
    }

    private dgzu() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\t", new Object[]{"a"});
            }
            if (i2 == 3) {
                return new dgzu();
            }
            if (i2 == 4) {
                return new dgzt();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dgzu> dssrVar = c;
            if (dssrVar == null) {
                synchronized (dgzu.class) {
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
