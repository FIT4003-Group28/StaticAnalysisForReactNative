package defpackage;
/* compiled from: PG */
/* renamed from: ddma  reason: default package */
/* loaded from: classes6.dex */
public final class ddma extends dsqw<ddma, ddlz> implements dssk {
    public static final ddma e;
    private static volatile dssr<ddma> f;
    public int a;
    public int b;
    public int c;
    public int d = 1;

    static {
        ddma ddmaVar = new ddma();
        e = ddmaVar;
        dsqw.cc(ddma.class, ddmaVar);
    }

    private ddma() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(e, "\u0001\u0003\u0000\u0001\u0002\u0004\u0003\u0000\u0000\u0000\u0002င\u0001\u0003င\u0002\u0004ဌ\u0003", new Object[]{"a", "b", "c", "d", dqum.c()});
            }
            if (i2 == 3) {
                return new ddma();
            }
            if (i2 == 4) {
                return new ddlz();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<ddma> dssrVar = f;
            if (dssrVar == null) {
                synchronized (ddma.class) {
                    dssrVar = f;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(e);
                        f = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
