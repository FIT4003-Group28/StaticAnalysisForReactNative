package defpackage;
/* compiled from: PG */
/* renamed from: dpwc  reason: default package */
/* loaded from: classes6.dex */
public final class dpwc extends dsqw<dpwc, dpwb> implements dssk {
    public static final dpwc d;
    private static volatile dssr<dpwc> e;
    public int a;
    public int b;
    public int c;

    static {
        dpwc dpwcVar = new dpwc();
        d = dpwcVar;
        dsqw.cc(dpwc.class, dpwcVar);
    }

    private dpwc() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002င\u0001", new Object[]{"a", "b", dpwe.c(), "c"});
            }
            if (i2 == 3) {
                return new dpwc();
            }
            if (i2 == 4) {
                return new dpwb();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dpwc> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dpwc.class) {
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
