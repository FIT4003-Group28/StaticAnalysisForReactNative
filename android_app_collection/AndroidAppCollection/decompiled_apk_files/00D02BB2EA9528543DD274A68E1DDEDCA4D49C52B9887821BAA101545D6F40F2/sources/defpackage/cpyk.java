package defpackage;
/* compiled from: PG */
/* renamed from: cpyk  reason: default package */
/* loaded from: classes5.dex */
public final class cpyk extends dsqw<cpyk, cpyd> implements dssk {
    public static final cpyk f;
    private static volatile dssr<cpyk> h;
    public int a;
    public int b;
    public int c;
    public int d;
    public boolean e = true;
    private int g;

    static {
        cpyk cpykVar = new cpyk();
        f = cpykVar;
        dsqw.cc(cpyk.class, cpykVar);
    }

    private cpyk() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(f, "\u0001\u0005\u0000\u0001\u0001\u0007\u0005\u0000\u0000\u0000\u0001ဌ\u0000\u0002င\u0001\u0004ဌ\u0003\u0006ဌ\u0005\u0007ဇ\u0006", new Object[]{"g", "a", cpyi.a, "b", "c", cpye.a, "d", cpyg.a, "e"});
            }
            if (i2 == 3) {
                return new cpyk();
            }
            if (i2 == 4) {
                return new cpyd();
            }
            if (i2 == 5) {
                return f;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<cpyk> dssrVar = h;
            if (dssrVar == null) {
                synchronized (cpyk.class) {
                    dssrVar = h;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(f);
                        h = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
