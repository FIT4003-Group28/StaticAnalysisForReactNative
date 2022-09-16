package defpackage;
/* compiled from: PG */
/* renamed from: dkvu  reason: default package */
/* loaded from: classes.dex */
public final class dkvu extends dsqw<dkvu, dkvt> implements dssk {
    public static final dkvu b;
    private static volatile dssr<dkvu> d;
    public dkhd a;
    private int c;

    static {
        dkvu dkvuVar = new dkvu();
        b = dkvuVar;
        dsqw.cc(dkvu.class, dkvuVar);
    }

    private dkvu() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"c", "a"});
            }
            if (i2 == 3) {
                return new dkvu();
            }
            if (i2 == 4) {
                return new dkvt();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dkvu> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dkvu.class) {
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
