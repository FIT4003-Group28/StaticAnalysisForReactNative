package defpackage;
/* compiled from: PG */
/* renamed from: ddfo  reason: default package */
/* loaded from: classes.dex */
public final class ddfo extends dsqw<ddfo, ddfl> implements dssk {
    public static final ddfo f;
    private static volatile dssr<ddfo> g;
    public int a;
    public int b;
    public int c = -1;
    public int d;
    public int e;

    static {
        ddfo ddfoVar = new ddfo();
        f = ddfoVar;
        dsqw.cc(ddfo.class, ddfoVar);
    }

    private ddfo() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(f, "\u0001\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0000\u0000\u0001ဌ\u0000\u0003င\u0002\u0004ဌ\u0003\u0005င\u0004", new Object[]{"a", "b", dqfn.c(), "c", "d", ddfn.c(), "e"});
            }
            if (i2 == 3) {
                return new ddfo();
            }
            if (i2 == 4) {
                return new ddfl();
            }
            if (i2 == 5) {
                return f;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<ddfo> dssrVar = g;
            if (dssrVar == null) {
                synchronized (ddfo.class) {
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
