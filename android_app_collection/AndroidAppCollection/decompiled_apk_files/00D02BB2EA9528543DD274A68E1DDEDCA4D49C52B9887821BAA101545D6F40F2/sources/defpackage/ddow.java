package defpackage;
/* compiled from: PG */
/* renamed from: ddow  reason: default package */
/* loaded from: classes.dex */
public final class ddow extends dsqw<ddow, ddov> implements dssk {
    public static final ddow c;
    private static volatile dssr<ddow> d;
    public int a = 0;
    public Object b;

    static {
        ddow ddowVar = new ddow();
        c = ddowVar;
        dsqw.cc(ddow.class, ddowVar);
    }

    private ddow() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0003\u0001\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဿ\u0000\u0002ဿ\u0000\u0003ျ\u0000", new Object[]{"b", "a", dpyv.c(), aufo.c()});
            }
            if (i2 == 3) {
                return new ddow();
            }
            if (i2 == 4) {
                return new ddov();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<ddow> dssrVar = d;
            if (dssrVar == null) {
                synchronized (ddow.class) {
                    dssrVar = d;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(c);
                        d = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
