package defpackage;
/* compiled from: PG */
/* renamed from: ddqo  reason: default package */
/* loaded from: classes.dex */
public final class ddqo extends dsqw<ddqo, ddqn> implements dssk {
    public static final ddqo f;
    private static volatile dssr<ddqo> g;
    public int a;
    public boolean b;
    public boolean c;
    public int d;
    public int e;

    static {
        ddqo ddqoVar = new ddqo();
        f = ddqoVar;
        dsqw.cc(ddqo.class, ddqoVar);
    }

    private ddqo() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(f, "\u0001\u0004\u0000\u0001\u0007\n\u0004\u0000\u0000\u0000\u0007ဇ\u0006\bဇ\u0007\tဌ\b\nဌ\t", new Object[]{"a", "b", "c", "d", dovb.c(), "e", dqvj.d()});
            }
            if (i2 == 3) {
                return new ddqo();
            }
            if (i2 == 4) {
                return new ddqn();
            }
            if (i2 == 5) {
                return f;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<ddqo> dssrVar = g;
            if (dssrVar == null) {
                synchronized (ddqo.class) {
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
