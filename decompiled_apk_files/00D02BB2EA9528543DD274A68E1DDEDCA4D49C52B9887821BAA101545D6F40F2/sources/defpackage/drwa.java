package defpackage;
/* compiled from: PG */
/* renamed from: drwa  reason: default package */
/* loaded from: classes6.dex */
public final class drwa extends dsqw<drwa, drvt> implements dssk {
    public static final drwa f;
    private static volatile dssr<drwa> g;
    public int a;
    public drvq b;
    public drvx c;
    public drvz d;
    public int e;

    static {
        drwa drwaVar = new drwa();
        f = drwaVar;
        dsqw.cc(drwa.class, drwaVar);
    }

    private drwa() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဌ\u0003", new Object[]{"a", "b", "c", "d", "e", drvu.a});
            }
            if (i2 == 3) {
                return new drwa();
            }
            if (i2 == 4) {
                return new drvt();
            }
            if (i2 == 5) {
                return f;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<drwa> dssrVar = g;
            if (dssrVar == null) {
                synchronized (drwa.class) {
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
