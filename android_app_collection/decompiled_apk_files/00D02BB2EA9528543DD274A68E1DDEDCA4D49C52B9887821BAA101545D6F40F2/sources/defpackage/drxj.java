package defpackage;
/* compiled from: PG */
/* renamed from: drxj  reason: default package */
/* loaded from: classes6.dex */
public final class drxj extends dsqw<drxj, drxg> implements dssk {
    public static final drxj e;
    private static volatile dssr<drxj> f;
    public Object b;
    public Object d;
    public int a = 0;
    public int c = 0;

    static {
        drxj drxjVar = new drxj();
        e = drxjVar;
        dsqw.cc(drxj.class, drxjVar);
    }

    private drxj() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(e, "\u0001\u0004\u0002\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001ျ\u0000\u0002ြ\u0000\u0003ြ\u0001\u0004ြ\u0001", new Object[]{"b", "a", "d", "c", dsay.class, drxi.class, drxf.class});
            }
            if (i2 == 3) {
                return new drxj();
            }
            if (i2 == 4) {
                return new drxg();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<drxj> dssrVar = f;
            if (dssrVar == null) {
                synchronized (drxj.class) {
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
