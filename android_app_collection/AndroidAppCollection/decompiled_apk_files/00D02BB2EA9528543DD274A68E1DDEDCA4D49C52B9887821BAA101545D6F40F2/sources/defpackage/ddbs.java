package defpackage;
/* compiled from: PG */
/* renamed from: ddbs  reason: default package */
/* loaded from: classes5.dex */
public final class ddbs extends dsqw<ddbs, ddbr> implements dssk {
    public static final ddbs f;
    private static volatile dssr<ddbs> g;
    public int a;
    public int b;
    public int c;
    public dsrf d = dsqz.b;
    public int e;

    static {
        ddbs ddbsVar = new ddbs();
        f = ddbsVar;
        dsqw.cc(ddbs.class, ddbsVar);
    }

    private ddbs() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001င\u0000\u0002င\u0001\u0003\u0016\u0004ဌ\u0002", new Object[]{"a", "b", "c", "d", "e", deaf.c()});
            }
            if (i2 == 3) {
                return new ddbs();
            }
            if (i2 == 4) {
                return new ddbr();
            }
            if (i2 == 5) {
                return f;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<ddbs> dssrVar = g;
            if (dssrVar == null) {
                synchronized (ddbs.class) {
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
