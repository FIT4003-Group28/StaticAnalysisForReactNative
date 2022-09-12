package defpackage;
/* compiled from: PG */
/* renamed from: dpst  reason: default package */
/* loaded from: classes6.dex */
public final class dpst extends dsqw<dpst, dpss> implements dssk {
    public static final dpst c;
    private static volatile dssr<dpst> d;
    public int a;
    public boolean b;

    static {
        dpst dpstVar = new dpst();
        c = dpstVar;
        dsqw.cc(dpst.class, dpstVar);
    }

    private dpst() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဇ\u0000", new Object[]{"a", "b"});
            }
            if (i2 == 3) {
                return new dpst();
            }
            if (i2 == 4) {
                return new dpss();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dpst> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dpst.class) {
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
