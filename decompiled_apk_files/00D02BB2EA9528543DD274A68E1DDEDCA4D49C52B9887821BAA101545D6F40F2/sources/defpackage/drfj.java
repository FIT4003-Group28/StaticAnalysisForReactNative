package defpackage;
/* compiled from: PG */
/* renamed from: drfj  reason: default package */
/* loaded from: classes6.dex */
public final class drfj extends dsqw<drfj, drfg> implements dssk {
    public static final drfj e;
    private static volatile dssr<drfj> f;
    public int a;
    public drfq b;
    public String c = "";
    public int d;

    static {
        drfj drfjVar = new drfj();
        e = drfjVar;
        dsqw.cc(drfj.class, drfjVar);
    }

    private drfj() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဈ\u0001\u0003ဌ\u0002", new Object[]{"a", "b", "c", "d", drfh.a});
            }
            if (i2 == 3) {
                return new drfj();
            }
            if (i2 == 4) {
                return new drfg();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<drfj> dssrVar = f;
            if (dssrVar == null) {
                synchronized (drfj.class) {
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
