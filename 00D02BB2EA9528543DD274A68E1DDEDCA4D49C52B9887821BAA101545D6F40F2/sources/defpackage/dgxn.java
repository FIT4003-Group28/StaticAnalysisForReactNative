package defpackage;
/* compiled from: PG */
/* renamed from: dgxn  reason: default package */
/* loaded from: classes6.dex */
public final class dgxn extends dsqw<dgxn, dgxk> implements dssk {
    public static final dgxn a;
    private static volatile dssr<dgxn> d;
    private dssd<String, String> b = dssd.b;
    private dssd<String, String> c = dssd.b;

    static {
        dgxn dgxnVar = new dgxn();
        a = dgxnVar;
        dsqw.cc(dgxn.class, dgxnVar);
    }

    private dgxn() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(a, "\u0001\u0002\u0000\u0000\u0015\u0016\u0002\u0002\u0000\u0000\u00152\u00162", new Object[]{"b", dgxl.a, "c", dgxm.a});
            }
            if (i2 == 3) {
                return new dgxn();
            }
            if (i2 == 4) {
                return new dgxk();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dgxn> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dgxn.class) {
                    dssrVar = d;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(a);
                        d = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
