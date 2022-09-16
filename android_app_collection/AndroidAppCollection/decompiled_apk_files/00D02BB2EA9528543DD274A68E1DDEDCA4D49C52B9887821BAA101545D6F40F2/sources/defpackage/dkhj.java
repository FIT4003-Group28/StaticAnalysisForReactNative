package defpackage;
/* compiled from: PG */
/* renamed from: dkhj  reason: default package */
/* loaded from: classes6.dex */
public final class dkhj extends dsqw<dkhj, dkhi> implements dssk {
    public static final dkhj b;
    private static volatile dssr<dkhj> d;
    public boolean a;
    private int c;

    static {
        dkhj dkhjVar = new dkhj();
        b = dkhjVar;
        dsqw.cc(dkhj.class, dkhjVar);
    }

    private dkhj() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဇ\u0000", new Object[]{"c", "a"});
            }
            if (i2 == 3) {
                return new dkhj();
            }
            if (i2 == 4) {
                return new dkhi();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dkhj> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dkhj.class) {
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
