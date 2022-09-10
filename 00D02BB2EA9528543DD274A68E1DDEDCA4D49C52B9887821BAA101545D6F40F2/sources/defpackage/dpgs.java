package defpackage;
/* compiled from: PG */
/* renamed from: dpgs  reason: default package */
/* loaded from: classes6.dex */
public final class dpgs extends dsqw<dpgs, dpgr> implements dssk {
    public static final dpgs c;
    private static volatile dssr<dpgs> d;
    public int a;
    public int b;

    static {
        dpgs dpgsVar = new dpgs();
        c = dpgsVar;
        dsqw.cc(dpgs.class, dpgsVar);
    }

    private dpgs() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"a", "b", dqvh.c()});
            }
            if (i2 == 3) {
                return new dpgs();
            }
            if (i2 == 4) {
                return new dpgr();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dpgs> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dpgs.class) {
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
