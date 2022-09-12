package defpackage;
/* compiled from: PG */
/* renamed from: ddnh  reason: default package */
/* loaded from: classes.dex */
public final class ddnh extends dsqw<ddnh, ddng> implements dssk {
    public static final ddnh f;
    private static volatile dssr<ddnh> g;
    public int a;
    public long b;
    public int c;
    public int d;
    public int e;

    static {
        ddnh ddnhVar = new ddnh();
        f = ddnhVar;
        dsqw.cc(ddnh.class, ddnhVar);
    }

    private ddnh() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဂ\u0000\u0002င\u0001\u0003င\u0002\u0004င\u0003", new Object[]{"a", "b", "c", "d", "e"});
            }
            if (i2 == 3) {
                return new ddnh();
            }
            if (i2 == 4) {
                return new ddng();
            }
            if (i2 == 5) {
                return f;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<ddnh> dssrVar = g;
            if (dssrVar == null) {
                synchronized (ddnh.class) {
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
