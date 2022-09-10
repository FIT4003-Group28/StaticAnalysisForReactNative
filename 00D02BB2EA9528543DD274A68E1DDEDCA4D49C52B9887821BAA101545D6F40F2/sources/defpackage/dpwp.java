package defpackage;
/* compiled from: PG */
/* renamed from: dpwp  reason: default package */
/* loaded from: classes6.dex */
public final class dpwp extends dsqw<dpwp, dpwo> implements dssk {
    public static final dpwp d;
    private static volatile dssr<dpwp> e;
    public int a;
    public dqmz b;
    public dpmp c;

    static {
        dpwp dpwpVar = new dpwp();
        d = dpwpVar;
        dsqw.cc(dpwp.class, dpwpVar);
    }

    private dpwp() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0002\u0003\u0002\u0000\u0000\u0000\u0002ဉ\u0002\u0003ဉ\u0001", new Object[]{"a", "c", "b"});
            }
            if (i2 == 3) {
                return new dpwp();
            }
            if (i2 == 4) {
                return new dpwo();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dpwp> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dpwp.class) {
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
