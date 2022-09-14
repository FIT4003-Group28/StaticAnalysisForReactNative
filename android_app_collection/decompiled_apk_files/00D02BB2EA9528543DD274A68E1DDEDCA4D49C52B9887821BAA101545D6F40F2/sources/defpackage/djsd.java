package defpackage;
/* compiled from: PG */
/* renamed from: djsd  reason: default package */
/* loaded from: classes.dex */
public final class djsd extends dsqw<djsd, djsa> implements dssk {
    public static final djsd f;
    private static volatile dssr<djsd> g;
    public int a;
    public dhxu b;
    public int c;
    public int d;
    public int e;

    static {
        djsd djsdVar = new djsd();
        f = djsdVar;
        dsqw.cc(djsd.class, djsdVar);
    }

    private djsd() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဌ\u0001\u0003ဆ\u0002\u0004ဆ\u0003", new Object[]{"a", "b", "c", djsb.a, "d", "e"});
            }
            if (i2 == 3) {
                return new djsd();
            }
            if (i2 == 4) {
                return new djsa();
            }
            if (i2 == 5) {
                return f;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<djsd> dssrVar = g;
            if (dssrVar == null) {
                synchronized (djsd.class) {
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
