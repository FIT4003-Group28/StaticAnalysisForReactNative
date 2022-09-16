package defpackage;
/* compiled from: PG */
/* renamed from: dhpx  reason: default package */
/* loaded from: classes.dex */
public final class dhpx extends dsqw<dhpx, dhpu> implements dssk {
    public static final dhpx e;
    private static volatile dssr<dhpx> g;
    public boolean a;
    public boolean b = true;
    public int c = 2;
    public int d = 5;
    private int f;

    static {
        dhpx dhpxVar = new dhpx();
        e = dhpxVar;
        dsqw.cc(dhpx.class, dhpxVar);
    }

    private dhpx() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(e, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003င\u0003\u0004ဌ\u0002", new Object[]{"f", "a", "b", "d", "c", dhpv.a});
            }
            if (i2 == 3) {
                return new dhpx();
            }
            if (i2 == 4) {
                return new dhpu();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dhpx> dssrVar = g;
            if (dssrVar == null) {
                synchronized (dhpx.class) {
                    dssrVar = g;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(e);
                        g = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
