package defpackage;
/* compiled from: PG */
/* renamed from: dkfj  reason: default package */
/* loaded from: classes6.dex */
public final class dkfj extends dsqw<dkfj, dkfi> implements dssk {
    public static final dkfj b;
    private static volatile dssr<dkfj> d;
    public int a = -1;
    private int c;

    static {
        dkfj dkfjVar = new dkfj();
        b = dkfjVar;
        dsqw.cc(dkfj.class, dkfjVar);
    }

    private dkfj() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"c", "a", dplb.a});
            }
            if (i2 == 3) {
                return new dkfj();
            }
            if (i2 == 4) {
                return new dkfi();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dkfj> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dkfj.class) {
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
