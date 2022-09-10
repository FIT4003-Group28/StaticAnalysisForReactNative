package defpackage;
/* compiled from: PG */
/* renamed from: dqhw  reason: default package */
/* loaded from: classes.dex */
public final class dqhw extends dsqw<dqhw, dqhu> implements dssk {
    public static final dqhw g;
    private static volatile dssr<dqhw> h;
    public int a;
    public dhkd b;
    public int d;
    public int e;
    public float c = 1.0f;
    public int f = 88;

    static {
        dqhw dqhwVar = new dqhw();
        g = dqhwVar;
        dsqw.cc(dqhw.class, dqhwVar);
    }

    private dqhw() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဌ\u0003\u0003င\u0004\u0004င\u0002\u0005ခ\u0001", new Object[]{"a", "b", "e", dqhv.a, "f", "d", "c"});
            }
            if (i2 == 3) {
                return new dqhw();
            }
            if (i2 == 4) {
                return new dqhu();
            }
            if (i2 == 5) {
                return g;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dqhw> dssrVar = h;
            if (dssrVar == null) {
                synchronized (dqhw.class) {
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
