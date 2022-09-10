package defpackage;
/* compiled from: PG */
/* renamed from: ddrs  reason: default package */
/* loaded from: classes6.dex */
public final class ddrs extends dsqw<ddrs, ddrr> implements dssk {
    public static final ddrs g;
    private static volatile dssr<ddrs> h;
    public int a;
    public int b;
    public dsrf c = dsqz.b;
    public dsrf d = dsqz.b;
    public dsrf e = dsqz.b;
    public dsrf f = dsqz.b;

    static {
        ddrs ddrsVar = new ddrs();
        g = ddrsVar;
        dsqw.cc(ddrs.class, ddrsVar);
    }

    private ddrs() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0004\u0000\u0001င\u0000\u0002\u0016\u0003\u0016\u0004!\u0005!", new Object[]{"a", "b", "c", "d", "e", "f"});
            }
            if (i2 == 3) {
                return new ddrs();
            }
            if (i2 == 4) {
                return new ddrr();
            }
            if (i2 == 5) {
                return g;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<ddrs> dssrVar = h;
            if (dssrVar == null) {
                synchronized (ddrs.class) {
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
