package defpackage;
/* compiled from: PG */
/* renamed from: dnrn  reason: default package */
/* loaded from: classes6.dex */
public final class dnrn extends dsqw<dnrn, dnrm> implements dssk {
    public static final dnrn b;
    private static volatile dssr<dnrn> c;
    public dsrj<dnic> a = dssu.b;

    static {
        dnrn dnrnVar = new dnrn();
        b = dnrnVar;
        dsqw.cc(dnrn.class, dnrnVar);
    }

    private dnrn() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", dnic.class});
            }
            if (i2 == 3) {
                return new dnrn();
            }
            if (i2 == 4) {
                return new dnrm();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dnrn> dssrVar = c;
            if (dssrVar == null) {
                synchronized (dnrn.class) {
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
