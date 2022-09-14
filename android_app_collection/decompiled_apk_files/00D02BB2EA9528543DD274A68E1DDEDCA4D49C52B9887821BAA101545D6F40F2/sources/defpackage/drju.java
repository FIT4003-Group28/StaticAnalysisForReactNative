package defpackage;
/* compiled from: PG */
/* renamed from: drju  reason: default package */
/* loaded from: classes6.dex */
public final class drju extends dsqw<drju, drjt> implements dssk {
    public static final drju d;
    private static volatile dssr<drju> f;
    public drdg a;
    public dqfu b;
    public int c;
    private int e;

    static {
        drju drjuVar = new drju();
        d = drjuVar;
        dsqw.cc(drju.class, drjuVar);
    }

    private drju() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0003\u0000\u0001\u0002\u0005\u0003\u0000\u0000\u0000\u0002ဉ\u0000\u0003ဉ\u0001\u0005င\u0002", new Object[]{"e", "a", "b", "c"});
            }
            if (i2 == 3) {
                return new drju();
            }
            if (i2 == 4) {
                return new drjt();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<drju> dssrVar = f;
            if (dssrVar == null) {
                synchronized (drju.class) {
                    dssrVar = f;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(d);
                        f = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
