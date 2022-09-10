package defpackage;
/* compiled from: PG */
/* renamed from: dpgn  reason: default package */
/* loaded from: classes6.dex */
public final class dpgn extends dsqw<dpgn, dpgm> implements dssk {
    public static final dpgn c;
    private static volatile dssr<dpgn> d;
    public int a;
    public int b;

    static {
        dpgn dpgnVar = new dpgn();
        c = dpgnVar;
        dsqw.cc(dpgn.class, dpgnVar);
    }

    private dpgn() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"a", "b", dqtz.c()});
            }
            if (i2 == 3) {
                return new dpgn();
            }
            if (i2 == 4) {
                return new dpgm();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dpgn> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dpgn.class) {
                    dssrVar = d;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(c);
                        d = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
