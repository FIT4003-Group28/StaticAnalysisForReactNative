package defpackage;
/* compiled from: PG */
/* renamed from: dvsk  reason: default package */
/* loaded from: classes.dex */
public final class dvsk extends dsqw<dvsk, dvsj> implements dssk {
    public static final dvsk e;
    private static volatile dssr<dvsk> g;
    public int a = 5000;
    public int b = 20;
    public float c = 0.6f;
    public long d = 1800000;
    private int f;

    static {
        dvsk dvskVar = new dvsk();
        e = dvskVar;
        dsqw.cc(dvsk.class, dvskVar);
    }

    private dvsk() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(e, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003ခ\u0002\u0004ဂ\u0003", new Object[]{"f", "a", "b", "c", "d"});
            }
            if (i2 == 3) {
                return new dvsk();
            }
            if (i2 == 4) {
                return new dvsj();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dvsk> dssrVar = g;
            if (dssrVar == null) {
                synchronized (dvsk.class) {
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
