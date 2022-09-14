package defpackage;
/* compiled from: PG */
/* renamed from: drhn  reason: default package */
/* loaded from: classes6.dex */
public final class drhn extends dsqw<drhn, drhm> implements dssk {
    public static final drhn g;
    private static volatile dssr<drhn> h;
    public int a;
    public drhj b;
    public int c;
    public int d;
    public drhx e;
    public drhh f;

    static {
        drhn drhnVar = new drhn();
        g = drhnVar;
        dsqw.cc(drhn.class, drhnVar);
    }

    private drhn() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(g, "\u0001\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဌ\u0001\u0004ဉ\u0003\u0005ဉ\u0004\u0006ဌ\u0002", new Object[]{"a", "b", "c", drhl.c(), "e", "f", "d", drhl.c()});
            }
            if (i2 == 3) {
                return new drhn();
            }
            if (i2 == 4) {
                return new drhm();
            }
            if (i2 == 5) {
                return g;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<drhn> dssrVar = h;
            if (dssrVar == null) {
                synchronized (drhn.class) {
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
