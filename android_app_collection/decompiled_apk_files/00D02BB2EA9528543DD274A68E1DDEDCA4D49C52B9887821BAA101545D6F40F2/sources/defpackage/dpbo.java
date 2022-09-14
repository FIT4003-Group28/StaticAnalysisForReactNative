package defpackage;
/* compiled from: PG */
/* renamed from: dpbo  reason: default package */
/* loaded from: classes6.dex */
public final class dpbo extends dsqw<dpbo, dpbn> implements dssk {
    public static final dpbo c;
    private static volatile dssr<dpbo> e;
    public drip a;
    public boolean b;
    private int d;

    static {
        dpbo dpboVar = new dpbo();
        c = dpboVar;
        dsqw.cc(dpbo.class, dpboVar);
    }

    private dpbo() {
        dssu<Object> dssuVar = dssu.b;
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0003ဇ\u0001", new Object[]{"d", "a", "b"});
            }
            if (i2 == 3) {
                return new dpbo();
            }
            if (i2 == 4) {
                return new dpbn();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dpbo> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dpbo.class) {
                    dssrVar = e;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(c);
                        e = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
