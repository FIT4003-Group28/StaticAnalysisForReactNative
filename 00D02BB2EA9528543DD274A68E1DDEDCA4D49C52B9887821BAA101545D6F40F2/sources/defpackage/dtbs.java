package defpackage;
/* compiled from: PG */
/* renamed from: dtbs  reason: default package */
/* loaded from: classes6.dex */
public final class dtbs extends dsqw<dtbs, dtbr> implements dssk {
    public static final dtbs g;
    private static volatile dssr<dtbs> h;
    public int a;
    public int b;
    public int c;
    public long d;
    public long e;
    public long f;

    static {
        dtbs dtbsVar = new dtbs();
        g = dtbsVar;
        dsqw.cc(dtbs.class, dtbsVar);
    }

    private dtbs() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(g, "\u0001\u0005\u0000\u0001\u0002\u0006\u0005\u0000\u0000\u0000\u0002ဍ\u0001\u0003ဍ\u0002\u0004စ\u0003\u0005စ\u0004\u0006စ\u0005", new Object[]{"a", "b", "c", "d", "e", "f"});
            }
            if (i2 == 3) {
                return new dtbs();
            }
            if (i2 == 4) {
                return new dtbr();
            }
            if (i2 == 5) {
                return g;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dtbs> dssrVar = h;
            if (dssrVar == null) {
                synchronized (dtbs.class) {
                    dssrVar = h;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(g);
                        h = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
