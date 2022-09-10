package defpackage;
/* compiled from: PG */
/* renamed from: dhve  reason: default package */
/* loaded from: classes6.dex */
public final class dhve extends dsqw<dhve, dhvb> implements dssk {
    public static final dhve b;
    private static volatile dssr<dhve> d;
    public int a;
    private int c;

    static {
        dhve dhveVar = new dhve();
        b = dhveVar;
        dsqw.cc(dhve.class, dhveVar);
    }

    private dhve() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"c", "a", dhvc.a});
            }
            if (i2 == 3) {
                return new dhve();
            }
            if (i2 == 4) {
                return new dhvb();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dhve> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dhve.class) {
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
