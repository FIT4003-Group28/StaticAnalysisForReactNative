package defpackage;
/* compiled from: PG */
/* renamed from: dnsx  reason: default package */
/* loaded from: classes6.dex */
public final class dnsx extends dsqw<dnsx, dnsu> implements dssk {
    public static final dnsx d;
    private static volatile dssr<dnsx> e;
    public int a;
    public dsrj<dnsr> b = dssu.b;
    public dnsw c;

    static {
        dnsx dnsxVar = new dnsx();
        d = dnsxVar;
        dsqw.cc(dnsx.class, dnsxVar);
    }

    private dnsx() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002ဉ\u0000", new Object[]{"a", "b", dnsr.class, "c"});
            }
            if (i2 == 3) {
                return new dnsx();
            }
            if (i2 == 4) {
                return new dnsu();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dnsx> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dnsx.class) {
                    dssrVar = e;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(d);
                        e = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
