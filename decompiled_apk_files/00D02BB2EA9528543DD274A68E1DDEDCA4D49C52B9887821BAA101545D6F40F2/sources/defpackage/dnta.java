package defpackage;
/* compiled from: PG */
/* renamed from: dnta  reason: default package */
/* loaded from: classes6.dex */
public final class dnta extends dsqw<dnta, dnsm> implements dssk {
    public static final dnta f;
    private static volatile dssr<dnta> g;
    public int a;
    public dsrj<dnsz> b = dssu.b;
    public dsrj<dnsx> c = dssu.b;
    public dsrj<dnst> d = dssu.b;
    public dnsp e;

    static {
        dnta dntaVar = new dnta();
        f = dntaVar;
        dsqw.cc(dnta.class, dntaVar);
    }

    private dnta() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0003\u0000\u0001\u001b\u0002\u001b\u0003\u001b\u0004ဉ\u0000", new Object[]{"a", "b", dnsz.class, "c", dnsx.class, "d", dnst.class, "e"});
            }
            if (i2 == 3) {
                return new dnta();
            }
            if (i2 == 4) {
                return new dnsm();
            }
            if (i2 == 5) {
                return f;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dnta> dssrVar = g;
            if (dssrVar == null) {
                synchronized (dnta.class) {
                    dssrVar = g;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(f);
                        g = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
