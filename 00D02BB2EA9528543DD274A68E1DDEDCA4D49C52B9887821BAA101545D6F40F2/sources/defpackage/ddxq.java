package defpackage;
/* compiled from: PG */
/* renamed from: ddxq  reason: default package */
/* loaded from: classes6.dex */
public final class ddxq extends dsqw<ddxq, ddxp> implements dssk {
    public static final ddxq g;
    private static volatile dssr<ddxq> h;
    public int a;
    public dspt b;
    public dspt c;
    public int d;
    public int e;
    public int f;

    static {
        ddxq ddxqVar = new ddxq();
        g = ddxqVar;
        dsqw.cc(ddxq.class, ddxqVar);
    }

    private ddxq() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဏ\u0002\u0004ဌ\u0003\u0005ဌ\u0004", new Object[]{"a", "b", "c", "d", "e", dpej.c(), "f", dpej.c()});
            }
            if (i2 == 3) {
                return new ddxq();
            }
            if (i2 == 4) {
                return new ddxp();
            }
            if (i2 == 5) {
                return g;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<ddxq> dssrVar = h;
            if (dssrVar == null) {
                synchronized (ddxq.class) {
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
