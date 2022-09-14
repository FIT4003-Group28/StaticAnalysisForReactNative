package defpackage;
/* compiled from: PG */
/* renamed from: dnsp  reason: default package */
/* loaded from: classes6.dex */
public final class dnsp extends dsqw<dnsp, dnsn> implements dssk {
    public static final dnsp c;
    private static volatile dssr<dnsp> d;
    public int a;
    public int b;

    static {
        dnsp dnspVar = new dnsp();
        c = dnspVar;
        dsqw.cc(dnsp.class, dnspVar);
    }

    private dnsp() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"a", "b", dnso.a});
            }
            if (i2 == 3) {
                return new dnsp();
            }
            if (i2 == 4) {
                return new dnsn();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dnsp> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dnsp.class) {
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
