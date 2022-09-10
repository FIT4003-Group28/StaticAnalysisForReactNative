package defpackage;
/* compiled from: PG */
/* renamed from: dupr  reason: default package */
/* loaded from: classes.dex */
public final class dupr extends dsqw<dupr, dupq> implements dssk {
    public static final dupr f;
    private static volatile dssr<dupr> g;
    public int a;
    public int b;
    public String c = "";
    public String d = "";
    public int e;

    static {
        dupr duprVar = new dupr();
        f = duprVar;
        dsqw.cc(dupr.class, duprVar);
    }

    private dupr() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(f, "\u0001\u0004\u0000\u0001\u0001\u0006\u0004\u0000\u0000\u0000\u0001င\u0000\u0002ဈ\u0001\u0003ဈ\u0003\u0006င\u0005", new Object[]{"a", "b", "c", "d", "e"});
            }
            if (i2 == 3) {
                return new dupr();
            }
            if (i2 == 4) {
                return new dupq();
            }
            if (i2 == 5) {
                return f;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dupr> dssrVar = g;
            if (dssrVar == null) {
                synchronized (dupr.class) {
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
