package defpackage;
/* compiled from: PG */
/* renamed from: dnii  reason: default package */
/* loaded from: classes6.dex */
public final class dnii extends dsqw<dnii, dnih> implements dssk {
    public static final dnii b;
    private static volatile dssr<dnii> d;
    public String a = "";
    private int c;

    static {
        dnii dniiVar = new dnii();
        b = dniiVar;
        dsqw.cc(dnii.class, dniiVar);
    }

    private dnii() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"c", "a"});
            }
            if (i2 == 3) {
                return new dnii();
            }
            if (i2 == 4) {
                return new dnih();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dnii> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dnii.class) {
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
