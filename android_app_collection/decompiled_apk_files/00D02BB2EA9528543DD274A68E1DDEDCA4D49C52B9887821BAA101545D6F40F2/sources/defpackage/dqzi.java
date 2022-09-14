package defpackage;
/* compiled from: PG */
/* renamed from: dqzi  reason: default package */
/* loaded from: classes.dex */
public final class dqzi extends dsqw<dqzi, dqzh> implements dssk {
    public static final dqzi c;
    private static volatile dssr<dqzi> d;
    public int a;
    public int b;

    static {
        dqzi dqziVar = new dqzi();
        c = dqziVar;
        dsqw.cc(dqzi.class, dqziVar);
    }

    private dqzi() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001င\u0000", new Object[]{"a", "b"});
            }
            if (i2 == 3) {
                return new dqzi();
            }
            if (i2 == 4) {
                return new dqzh();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dqzi> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dqzi.class) {
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
