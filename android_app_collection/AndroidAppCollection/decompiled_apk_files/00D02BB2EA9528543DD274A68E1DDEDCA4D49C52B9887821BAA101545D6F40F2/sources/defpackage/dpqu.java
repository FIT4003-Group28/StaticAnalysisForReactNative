package defpackage;
/* compiled from: PG */
/* renamed from: dpqu  reason: default package */
/* loaded from: classes6.dex */
public final class dpqu extends dsqw<dpqu, dpqt> implements dssk {
    public static final dpqu b;
    private static volatile dssr<dpqu> d;
    public dpsn a;
    private int c;

    static {
        dpqu dpquVar = new dpqu();
        b = dpquVar;
        dsqw.cc(dpqu.class, dpquVar);
    }

    private dpqu() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"c", "a"});
            }
            if (i2 == 3) {
                return new dpqu();
            }
            if (i2 == 4) {
                return new dpqt();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dpqu> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dpqu.class) {
                    dssrVar = d;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(b);
                        d = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
