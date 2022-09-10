package defpackage;
/* compiled from: PG */
/* renamed from: dpzi  reason: default package */
/* loaded from: classes.dex */
public final class dpzi extends dsqw<dpzi, dpzf> implements dssk {
    public static final dpzi e;
    private static volatile dssr<dpzi> f;
    public int a;
    public int b;
    public dsrj<dpzs> c = dssu.b;
    public int d;

    static {
        dpzi dpziVar = new dpzi();
        e = dpziVar;
        dsqw.cc(dpzi.class, dpziVar);
    }

    private dpzi() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(e, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0001\u0000\u0001ဌ\u0000\u0003\u001b\u0004ဋ\u0003", new Object[]{"a", "b", dpzh.c(), "c", dpzs.class, "d"});
            }
            if (i2 == 3) {
                return new dpzi();
            }
            if (i2 == 4) {
                return new dpzf();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dpzi> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dpzi.class) {
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
