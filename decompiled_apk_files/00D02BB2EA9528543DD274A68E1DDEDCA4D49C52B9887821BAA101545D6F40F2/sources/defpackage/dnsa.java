package defpackage;
/* compiled from: PG */
/* renamed from: dnsa  reason: default package */
/* loaded from: classes6.dex */
public final class dnsa extends dsqw<dnsa, dnrz> implements dssk {
    public static final dnsa c;
    private static volatile dssr<dnsa> d;
    public int a;
    public int b;

    static {
        dnsa dnsaVar = new dnsa();
        c = dnsaVar;
        dsqw.cc(dnsa.class, dnsaVar);
    }

    private dnsa() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002ဌ\u0001", new Object[]{"a", "b", dqjl.c()});
            }
            if (i2 == 3) {
                return new dnsa();
            }
            if (i2 == 4) {
                return new dnrz();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dnsa> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dnsa.class) {
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