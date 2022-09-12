package defpackage;
/* compiled from: PG */
/* renamed from: dpco  reason: default package */
/* loaded from: classes6.dex */
public final class dpco extends dsqw<dpco, dpcl> implements dssk {
    public static final dpco e;
    private static volatile dssr<dpco> f;
    public int a;
    public int b;
    public long c;
    public int d;

    static {
        dpco dpcoVar = new dpco();
        e = dpcoVar;
        dsqw.cc(dpco.class, dpcoVar);
    }

    private dpco() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(e, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0000\u0001င\u0000\u0002ဂ\u0001\u0004ဌ\u0002", new Object[]{"a", "b", "c", "d", dpcm.a});
            }
            if (i2 == 3) {
                return new dpco();
            }
            if (i2 == 4) {
                return new dpcl();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dpco> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dpco.class) {
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
