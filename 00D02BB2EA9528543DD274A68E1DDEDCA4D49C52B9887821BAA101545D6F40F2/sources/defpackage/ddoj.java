package defpackage;
/* compiled from: PG */
/* renamed from: ddoj  reason: default package */
/* loaded from: classes6.dex */
public final class ddoj extends dsqw<ddoj, ddog> implements dssk {
    public static final ddoj e;
    private static volatile dssr<ddoj> f;
    public int a;
    public int b;
    public boolean c;
    public int d;

    static {
        ddoj ddojVar = new ddoj();
        e = ddojVar;
        dsqw.cc(ddoj.class, ddojVar);
    }

    private ddoj() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဇ\u0001\u0003င\u0002", new Object[]{"a", "b", ddoi.c(), "c", "d"});
            }
            if (i2 == 3) {
                return new ddoj();
            }
            if (i2 == 4) {
                return new ddog();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<ddoj> dssrVar = f;
            if (dssrVar == null) {
                synchronized (ddoj.class) {
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
