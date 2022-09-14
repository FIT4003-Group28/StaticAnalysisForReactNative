package defpackage;
/* compiled from: PG */
/* renamed from: ddfd  reason: default package */
/* loaded from: classes.dex */
public final class ddfd extends dsqw<ddfd, ddfc> implements dssk {
    public static final ddfd c;
    private static volatile dssr<ddfd> d;
    public int a;
    public int b;

    static {
        ddfd ddfdVar = new ddfd();
        c = ddfdVar;
        dsqw.cc(ddfd.class, ddfdVar);
    }

    private ddfd() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"a", "b", dpvf.c()});
            }
            if (i2 == 3) {
                return new ddfd();
            }
            if (i2 == 4) {
                return new ddfc();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<ddfd> dssrVar = d;
            if (dssrVar == null) {
                synchronized (ddfd.class) {
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
