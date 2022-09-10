package defpackage;
/* compiled from: PG */
/* renamed from: drvj  reason: default package */
/* loaded from: classes6.dex */
public final class drvj extends dsqw<drvj, drvf> implements dssk {
    public static final drvj e;
    private static volatile dssr<drvj> f;
    public int a;
    public int b;
    public int c;
    public int d;

    static {
        drvj drvjVar = new drvj();
        e = drvjVar;
        dsqw.cc(drvj.class, drvjVar);
    }

    private drvj() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(e, "\u0001\u0003\u0000\u0001\u0001%\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0003ဌ\u0003%ဌ\u0001", new Object[]{"a", "b", drvh.a, "d", drvg.a, "c", drub.a});
            }
            if (i2 == 3) {
                return new drvj();
            }
            if (i2 == 4) {
                return new drvf();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<drvj> dssrVar = f;
            if (dssrVar == null) {
                synchronized (drvj.class) {
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
