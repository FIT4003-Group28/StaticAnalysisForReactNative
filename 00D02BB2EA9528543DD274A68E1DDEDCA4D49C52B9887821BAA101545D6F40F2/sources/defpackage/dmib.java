package defpackage;
/* compiled from: PG */
/* renamed from: dmib  reason: default package */
/* loaded from: classes6.dex */
public final class dmib extends dsqw<dmib, dmia> implements dssk {
    public static final dmib c;
    private static volatile dssr<dmib> e;
    public dmid a;
    public double b;
    private int d;

    static {
        dmib dmibVar = new dmib();
        c = dmibVar;
        dsqw.cc(dmib.class, dmibVar);
    }

    private dmib() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002က\u0001", new Object[]{"d", "a", "b"});
            }
            if (i2 == 3) {
                return new dmib();
            }
            if (i2 == 4) {
                return new dmia();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dmib> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dmib.class) {
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
