package defpackage;
/* compiled from: PG */
/* renamed from: dpph  reason: default package */
/* loaded from: classes6.dex */
public final class dpph extends dsqw<dpph, dppg> implements dssk {
    public static final dpph c;
    private static volatile dssr<dpph> e;
    public dqjt a;
    public dqjt b;
    private int d;

    static {
        dpph dpphVar = new dpph();
        c = dpphVar;
        dsqw.cc(dpph.class, dpphVar);
    }

    private dpph() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"d", "a", "b"});
            }
            if (i2 == 3) {
                return new dpph();
            }
            if (i2 == 4) {
                return new dppg();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dpph> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dpph.class) {
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
