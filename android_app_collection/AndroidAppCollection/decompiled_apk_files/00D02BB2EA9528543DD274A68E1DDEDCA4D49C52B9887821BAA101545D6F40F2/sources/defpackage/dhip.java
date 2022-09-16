package defpackage;
/* compiled from: PG */
/* renamed from: dhip  reason: default package */
/* loaded from: classes6.dex */
public final class dhip extends dsqw<dhip, dhif> implements dssk {
    public static final dhip f;
    private static volatile dssr<dhip> g;
    public int a;
    public int b;
    public dhij c;
    public int d;
    public dhin e;

    static {
        dhip dhipVar = new dhip();
        f = dhipVar;
        dsqw.cc(dhip.class, dhipVar);
    }

    private dhip() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဉ\u0001\u0003ဌ\u0002\u0004ဉ\u0003", new Object[]{"a", "b", dhig.a, "c", "d", dhio.a, "e"});
            }
            if (i2 == 3) {
                return new dhip();
            }
            if (i2 == 4) {
                return new dhif();
            }
            if (i2 == 5) {
                return f;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dhip> dssrVar = g;
            if (dssrVar == null) {
                synchronized (dhip.class) {
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
