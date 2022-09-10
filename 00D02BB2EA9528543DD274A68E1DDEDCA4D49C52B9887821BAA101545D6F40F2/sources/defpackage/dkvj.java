package defpackage;
/* compiled from: PG */
/* renamed from: dkvj  reason: default package */
/* loaded from: classes.dex */
public final class dkvj extends dsqw<dkvj, dkvg> implements dssk {
    public static final dkvj e;
    private static volatile dssr<dkvj> f;
    public int a;
    public int b = 1;
    public int c = 2;
    public int d = 2;

    static {
        dkvj dkvjVar = new dkvj();
        e = dkvjVar;
        dsqw.cc(dkvj.class, dkvjVar);
    }

    private dkvj() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001\u0003ဌ\u0002", new Object[]{"a", "b", dkvh.a, "c", dkvh.a, "d", dkvh.a});
            }
            if (i2 == 3) {
                return new dkvj();
            }
            if (i2 == 4) {
                return new dkvg();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dkvj> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dkvj.class) {
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
