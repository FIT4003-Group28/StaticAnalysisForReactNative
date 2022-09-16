package defpackage;
/* compiled from: PG */
/* renamed from: dnbv  reason: default package */
/* loaded from: classes.dex */
public final class dnbv extends dsqw<dnbv, dnbu> implements dssk {
    public static final dnbv c;
    private static volatile dssr<dnbv> d;
    public int a;
    public dndc b;

    static {
        dnbv dnbvVar = new dnbv();
        c = dnbvVar;
        dsqw.cc(dnbv.class, dnbvVar);
    }

    private dnbv() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"a", "b"});
            }
            if (i2 == 3) {
                return new dnbv();
            }
            if (i2 == 4) {
                return new dnbu();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dnbv> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dnbv.class) {
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
