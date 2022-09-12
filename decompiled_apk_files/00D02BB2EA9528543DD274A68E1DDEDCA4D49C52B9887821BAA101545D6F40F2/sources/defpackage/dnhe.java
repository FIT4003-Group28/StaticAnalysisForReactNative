package defpackage;
/* compiled from: PG */
/* renamed from: dnhe  reason: default package */
/* loaded from: classes6.dex */
public final class dnhe extends dsqw<dnhe, dnhd> implements dssk {
    public static final dnhe b;
    private static volatile dssr<dnhe> d;
    public dngs a;
    private int c;

    static {
        dnhe dnheVar = new dnhe();
        b = dnheVar;
        dsqw.cc(dnhe.class, dnheVar);
    }

    private dnhe() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"c", "a"});
            }
            if (i2 == 3) {
                return new dnhe();
            }
            if (i2 == 4) {
                return new dnhd();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dnhe> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dnhe.class) {
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
