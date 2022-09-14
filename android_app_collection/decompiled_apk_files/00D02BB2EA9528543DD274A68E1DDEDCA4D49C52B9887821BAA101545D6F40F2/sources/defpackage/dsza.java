package defpackage;
/* compiled from: PG */
/* renamed from: dsza  reason: default package */
/* loaded from: classes6.dex */
public final class dsza extends dsqw<dsza, dsyz> implements dssk {
    public static final dsza e;
    private static volatile dssr<dsza> f;
    public int a;
    public double b;
    public double c;
    public double d;

    static {
        dsza dszaVar = new dsza();
        e = dszaVar;
        dsqw.cc(dsza.class, dszaVar);
    }

    private dsza() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001က\u0000\u0002က\u0001\u0003က\u0002", new Object[]{"a", "b", "c", "d"});
            }
            if (i2 == 3) {
                return new dsza();
            }
            if (i2 == 4) {
                return new dsyz();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dsza> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dsza.class) {
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
