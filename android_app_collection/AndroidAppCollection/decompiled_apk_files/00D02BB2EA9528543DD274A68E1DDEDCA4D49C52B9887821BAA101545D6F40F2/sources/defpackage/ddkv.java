package defpackage;
/* compiled from: PG */
/* renamed from: ddkv  reason: default package */
/* loaded from: classes5.dex */
public final class ddkv extends dsqw<ddkv, ddku> implements dssk {
    public static final ddkv c;
    private static volatile dssr<ddkv> d;
    public int a;
    public int b;

    static {
        ddkv ddkvVar = new ddkv();
        c = ddkvVar;
        dsqw.cc(ddkv.class, ddkvVar);
    }

    private ddkv() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"a", "b", ddkt.c()});
            }
            if (i2 == 3) {
                return new ddkv();
            }
            if (i2 == 4) {
                return new ddku();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<ddkv> dssrVar = d;
            if (dssrVar == null) {
                synchronized (ddkv.class) {
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
