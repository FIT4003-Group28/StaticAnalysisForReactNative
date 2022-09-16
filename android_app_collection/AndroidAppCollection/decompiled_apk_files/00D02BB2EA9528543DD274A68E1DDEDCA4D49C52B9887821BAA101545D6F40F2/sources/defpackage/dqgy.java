package defpackage;
/* compiled from: PG */
/* renamed from: dqgy  reason: default package */
/* loaded from: classes.dex */
public final class dqgy extends dsqw<dqgy, dqgx> implements dssk {
    public static final dqgy e;
    private static volatile dssr<dqgy> f;
    public int a;
    public dqcy b;
    public dsrj<dqer> c = dssu.b;
    public boolean d;

    static {
        dqgy dqgyVar = new dqgy();
        e = dqgyVar;
        dsqw.cc(dqgy.class, dqgyVar);
    }

    private dqgy() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(e, "\u0001\u0003\u0000\u0001\u0002\u0004\u0003\u0000\u0001\u0000\u0002ဉ\u0000\u0003\u001b\u0004ဇ\u0001", new Object[]{"a", "b", "c", dqer.class, "d"});
            }
            if (i2 == 3) {
                return new dqgy();
            }
            if (i2 == 4) {
                return new dqgx();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dqgy> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dqgy.class) {
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
