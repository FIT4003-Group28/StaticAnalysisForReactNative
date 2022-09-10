package defpackage;
/* compiled from: PG */
/* renamed from: ddgy  reason: default package */
/* loaded from: classes.dex */
public final class ddgy extends dsqw<ddgy, ddgx> implements dssk {
    public static final ddgy d;
    public static final dsqv<ddhk, ddgy> e;
    private static volatile dssr<ddgy> f;
    public int a;
    public int b;
    public String c = "";

    static {
        ddgy ddgyVar = new ddgy();
        d = ddgyVar;
        dsqw.cc(ddgy.class, ddgyVar);
        e = dsqw.newSingularGeneratedExtension(ddhk.k, ddgyVar, ddgyVar, null, 355, dsur.MESSAGE, ddgy.class);
    }

    private ddgy() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002ဈ\u0001", new Object[]{"a", "b", "c"});
            }
            if (i2 == 3) {
                return new ddgy();
            }
            if (i2 == 4) {
                return new ddgx();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<ddgy> dssrVar = f;
            if (dssrVar == null) {
                synchronized (ddgy.class) {
                    dssrVar = f;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(d);
                        f = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
