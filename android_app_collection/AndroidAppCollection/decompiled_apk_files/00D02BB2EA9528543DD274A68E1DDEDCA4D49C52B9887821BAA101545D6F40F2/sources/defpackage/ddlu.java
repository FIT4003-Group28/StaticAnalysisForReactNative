package defpackage;
/* compiled from: PG */
/* renamed from: ddlu  reason: default package */
/* loaded from: classes6.dex */
public final class ddlu extends dsqw<ddlu, ddlt> implements dssk {
    public static final ddlu g;
    private static volatile dssr<ddlu> h;
    public int a;
    public boolean b;
    public boolean c;
    public boolean d;
    public boolean e;
    public ddly f;

    static {
        ddlu ddluVar = new ddlu();
        g = ddluVar;
        dsqw.cc(ddlu.class, ddluVar);
    }

    private ddlu() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004ဉ\u0004\u0005ဇ\u0003", new Object[]{"a", "b", "c", "d", "f", "e"});
            }
            if (i2 == 3) {
                return new ddlu();
            }
            if (i2 == 4) {
                return new ddlt();
            }
            if (i2 == 5) {
                return g;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<ddlu> dssrVar = h;
            if (dssrVar == null) {
                synchronized (ddlu.class) {
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
