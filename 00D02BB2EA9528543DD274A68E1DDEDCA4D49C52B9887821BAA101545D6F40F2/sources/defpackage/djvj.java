package defpackage;
/* compiled from: PG */
/* renamed from: djvj  reason: default package */
/* loaded from: classes6.dex */
public final class djvj extends dsqw<djvj, djvi> implements dssk {
    public static final djvj e;
    private static volatile dssr<djvj> f;
    public int a;
    public djvl b;
    public int c;
    public dqjy d;

    static {
        djvj djvjVar = new djvj();
        e = djvjVar;
        dsqw.cc(djvj.class, djvjVar);
    }

    private djvj() {
        dssu<Object> dssuVar = dssu.b;
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(e, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002င\u0001\u0004ဉ\u0003", new Object[]{"a", "b", "c", "d"});
            }
            if (i2 == 3) {
                return new djvj();
            }
            if (i2 == 4) {
                return new djvi();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<djvj> dssrVar = f;
            if (dssrVar == null) {
                synchronized (djvj.class) {
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
