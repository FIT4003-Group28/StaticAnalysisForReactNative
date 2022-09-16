package defpackage;
/* compiled from: PG */
/* renamed from: dqqj  reason: default package */
/* loaded from: classes6.dex */
public final class dqqj extends dsqw<dqqj, dqqi> implements dssk {
    public static final dqqj c;
    private static volatile dssr<dqqj> d;
    public int a;
    public int b;

    static {
        dqqj dqqjVar = new dqqj();
        c = dqqjVar;
        dsqw.cc(dqqj.class, dqqjVar);
    }

    private dqqj() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"a", "b", dqrc.a});
            }
            if (i2 == 3) {
                return new dqqj();
            }
            if (i2 == 4) {
                return new dqqi();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dqqj> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dqqj.class) {
                    dssrVar = d;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(c);
                        d = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
