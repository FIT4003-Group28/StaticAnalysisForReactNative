package defpackage;
/* compiled from: PG */
/* renamed from: dmif  reason: default package */
/* loaded from: classes6.dex */
public final class dmif extends dsqw<dmif, dmie> implements dssk {
    public static final dmif e;
    private static volatile dssr<dmif> g;
    public double a;
    public double b;
    public double c;
    public double d;
    private int f;

    static {
        dmif dmifVar = new dmif();
        e = dmifVar;
        dsqw.cc(dmif.class, dmifVar);
    }

    private dmif() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(e, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001က\u0000\u0002က\u0001\u0003က\u0002\u0004က\u0003", new Object[]{"f", "a", "b", "c", "d"});
            }
            if (i2 == 3) {
                return new dmif();
            }
            if (i2 == 4) {
                return new dmie();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dmif> dssrVar = g;
            if (dssrVar == null) {
                synchronized (dmif.class) {
                    dssrVar = g;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(e);
                        g = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
