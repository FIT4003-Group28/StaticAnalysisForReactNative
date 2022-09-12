package defpackage;
/* compiled from: PG */
/* renamed from: ddzu  reason: default package */
/* loaded from: classes.dex */
public final class ddzu extends dsqw<ddzu, ddzs> implements dssk {
    public static final ddzu g;
    private static volatile dssr<ddzu> h;
    public int a;
    public int b;
    public int c;
    public int d;
    public int e;
    public boolean f;

    static {
        ddzu ddzuVar = new ddzu();
        g = ddzuVar;
        dsqw.cc(ddzu.class, ddzuVar);
    }

    private ddzu() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003ဌ\u0002\u0004ဇ\u0004\u0005ဌ\u0003", new Object[]{"a", "b", "c", "d", ddzt.a, "f", "e", dgsn.c()});
            }
            if (i2 == 3) {
                return new ddzu();
            }
            if (i2 == 4) {
                return new ddzs();
            }
            if (i2 == 5) {
                return g;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<ddzu> dssrVar = h;
            if (dssrVar == null) {
                synchronized (ddzu.class) {
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
