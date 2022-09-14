package defpackage;
/* compiled from: PG */
/* renamed from: dnsc  reason: default package */
/* loaded from: classes6.dex */
public final class dnsc extends dsqw<dnsc, dnsb> implements dnsd {
    public static final dnsc f;
    private static volatile dssr<dnsc> g;
    public int a;
    public Object c;
    public dnic d;
    public int b = 0;
    public String e = "";

    static {
        dnsc dnscVar = new dnsc();
        f = dnscVar;
        dsqw.cc(dnsc.class, dnscVar);
    }

    private dnsc() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(f, "\u0001\u0005\u0001\u0001\u0001\u0006\u0005\u0000\u0000\u0000\u0001ြ\u0000\u0002ဉ\u0003\u0003ဿ\u0000\u0005ဈ\u0005\u0006ြ\u0000", new Object[]{"c", "b", "a", dniu.class, "d", dqjl.c(), "e", dnsa.class});
            }
            if (i2 == 3) {
                return new dnsc();
            }
            if (i2 == 4) {
                return new dnsb();
            }
            if (i2 == 5) {
                return f;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dnsc> dssrVar = g;
            if (dssrVar == null) {
                synchronized (dnsc.class) {
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
