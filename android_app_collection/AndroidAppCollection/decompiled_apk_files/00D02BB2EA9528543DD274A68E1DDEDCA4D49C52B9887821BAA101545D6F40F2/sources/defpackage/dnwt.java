package defpackage;
/* compiled from: PG */
/* renamed from: dnwt  reason: default package */
/* loaded from: classes6.dex */
public final class dnwt extends dsqw<dnwt, dnws> implements dssk {
    public static final dnwt c;
    private static volatile dssr<dnwt> d;
    public int a;
    public dhkd b;

    static {
        dnwt dnwtVar = new dnwt();
        c = dnwtVar;
        dsqw.cc(dnwt.class, dnwtVar);
    }

    private dnwt() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"a", "b"});
            }
            if (i2 == 3) {
                return new dnwt();
            }
            if (i2 == 4) {
                return new dnws();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dnwt> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dnwt.class) {
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
