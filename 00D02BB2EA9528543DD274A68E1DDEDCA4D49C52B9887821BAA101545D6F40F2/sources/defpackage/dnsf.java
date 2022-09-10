package defpackage;
/* compiled from: PG */
/* renamed from: dnsf  reason: default package */
/* loaded from: classes6.dex */
public final class dnsf extends dsqw<dnsf, dnse> implements dssk {
    public static final dnsf c;
    private static volatile dssr<dnsf> d;
    public int a = 0;
    public Object b;

    static {
        dnsf dnsfVar = new dnsf();
        c = dnsfVar;
        dsqw.cc(dnsf.class, dnsfVar);
    }

    private dnsf() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဿ\u0000\u0002ဿ\u0000", new Object[]{"b", "a", dqkk.a, dqki.a});
            }
            if (i2 == 3) {
                return new dnsf();
            }
            if (i2 == 4) {
                return new dnse();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dnsf> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dnsf.class) {
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
