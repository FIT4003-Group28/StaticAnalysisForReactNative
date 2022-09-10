package defpackage;
/* compiled from: PG */
/* renamed from: dkmz  reason: default package */
/* loaded from: classes.dex */
public final class dkmz extends dsqw<dkmz, dkmy> implements dssk {
    public static final dkmz e;
    private static volatile dssr<dkmz> g;
    public int a = 300958568;
    public int b = 300958568;
    public int c = 301089477;
    public int d = 301093249;
    private int f;

    static {
        dkmz dkmzVar = new dkmz();
        e = dkmzVar;
        dsqw.cc(dkmz.class, dkmzVar);
    }

    private dkmz() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(e, "\u0001\u0004\u0000\u0001\u0001\u0006\u0004\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0005င\u0003\u0006င\u0004", new Object[]{"f", "a", "b", "c", "d"});
            }
            if (i2 == 3) {
                return new dkmz();
            }
            if (i2 == 4) {
                return new dkmy();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dkmz> dssrVar = g;
            if (dssrVar == null) {
                synchronized (dkmz.class) {
                    dssrVar = g;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(e);
                        g = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
