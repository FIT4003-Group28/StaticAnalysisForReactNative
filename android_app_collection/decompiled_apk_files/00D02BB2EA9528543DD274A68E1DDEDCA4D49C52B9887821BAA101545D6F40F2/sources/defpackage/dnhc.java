package defpackage;
/* compiled from: PG */
/* renamed from: dnhc  reason: default package */
/* loaded from: classes.dex */
public final class dnhc extends dsqw<dnhc, dnhb> implements dssk {
    public static final dnhc b;
    private static volatile dssr<dnhc> d;
    public String a = "";
    private int c;

    static {
        dnhc dnhcVar = new dnhc();
        b = dnhcVar;
        dsqw.cc(dnhc.class, dnhcVar);
    }

    private dnhc() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002ဈ\u0001", new Object[]{"c", "a"});
            }
            if (i2 == 3) {
                return new dnhc();
            }
            if (i2 == 4) {
                return new dnhb();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dnhc> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dnhc.class) {
                    dssrVar = d;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(b);
                        d = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
