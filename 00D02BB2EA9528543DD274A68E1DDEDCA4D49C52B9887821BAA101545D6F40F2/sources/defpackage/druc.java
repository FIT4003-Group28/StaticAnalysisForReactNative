package defpackage;
/* compiled from: PG */
/* renamed from: druc  reason: default package */
/* loaded from: classes6.dex */
public final class druc extends dsqw<druc, drua> implements dssk {
    public static final druc e;
    private static volatile dssr<druc> f;
    public int a;
    public int b = 0;
    public Object c;
    public drtz d;

    static {
        druc drucVar = new druc();
        e = drucVar;
        dsqw.cc(druc.class, drucVar);
    }

    private druc() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(e, "\u0001\u0004\u0001\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ြ\u0000\u0003ြ\u0000\u0004ြ\u0000", new Object[]{"c", "b", "a", "d", drwy.class, drvj.class, drwl.class});
            }
            if (i2 == 3) {
                return new druc();
            }
            if (i2 == 4) {
                return new drua();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<druc> dssrVar = f;
            if (dssrVar == null) {
                synchronized (druc.class) {
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
