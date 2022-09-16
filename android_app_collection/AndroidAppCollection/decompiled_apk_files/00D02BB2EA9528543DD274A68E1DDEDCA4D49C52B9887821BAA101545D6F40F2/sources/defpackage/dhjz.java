package defpackage;
/* compiled from: PG */
/* renamed from: dhjz  reason: default package */
/* loaded from: classes.dex */
public final class dhjz extends dsqw<dhjz, dhjy> implements dssk {
    public static final dhjz e;
    private static volatile dssr<dhjz> f;
    public int a;
    public double b;
    public double c;
    public double d;

    static {
        dhjz dhjzVar = new dhjz();
        e = dhjzVar;
        dsqw.cc(dhjz.class, dhjzVar);
    }

    private dhjz() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001က\u0002\u0002က\u0000\u0003က\u0001", new Object[]{"a", "d", "b", "c"});
            }
            if (i2 == 3) {
                return new dhjz();
            }
            if (i2 == 4) {
                return new dhjy();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dhjz> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dhjz.class) {
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
