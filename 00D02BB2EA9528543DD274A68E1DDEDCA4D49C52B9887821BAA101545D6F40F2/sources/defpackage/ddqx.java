package defpackage;
/* compiled from: PG */
/* renamed from: ddqx  reason: default package */
/* loaded from: classes6.dex */
public final class ddqx extends dsqw<ddqx, ddqw> implements dssk {
    public static final ddqx d;
    private static volatile dssr<ddqx> e;
    public int a;
    public boolean b = true;
    public int c;

    static {
        ddqx ddqxVar = new ddqx();
        d = ddqxVar;
        dsqw.cc(ddqx.class, ddqxVar);
    }

    private ddqx() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0002င\u0001", new Object[]{"a", "b", "c"});
            }
            if (i2 == 3) {
                return new ddqx();
            }
            if (i2 == 4) {
                return new ddqw();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<ddqx> dssrVar = e;
            if (dssrVar == null) {
                synchronized (ddqx.class) {
                    dssrVar = e;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(d);
                        e = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
