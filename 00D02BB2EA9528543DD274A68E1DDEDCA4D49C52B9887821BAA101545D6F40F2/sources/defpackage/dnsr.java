package defpackage;
/* compiled from: PG */
/* renamed from: dnsr  reason: default package */
/* loaded from: classes6.dex */
public final class dnsr extends dsqw<dnsr, dnsq> implements dssk {
    public static final dnsr c;
    private static volatile dssr<dnsr> d;
    public int a;
    public long b;

    static {
        dnsr dnsrVar = new dnsr();
        c = dnsrVar;
        dsqw.cc(dnsr.class, dnsrVar);
    }

    private dnsr() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဂ\u0000", new Object[]{"a", "b"});
            }
            if (i2 == 3) {
                return new dnsr();
            }
            if (i2 == 4) {
                return new dnsq();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dnsr> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dnsr.class) {
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
