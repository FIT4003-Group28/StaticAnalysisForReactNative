package defpackage;
/* compiled from: PG */
/* renamed from: dkbs  reason: default package */
/* loaded from: classes6.dex */
public final class dkbs extends dsqw<dkbs, dkbp> implements dssk {
    public static final dkbs b;
    private static volatile dssr<dkbs> d;
    public int a;
    private int c;

    static {
        dkbs dkbsVar = new dkbs();
        b = dkbsVar;
        dsqw.cc(dkbs.class, dkbsVar);
    }

    private dkbs() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"c", "a", dkbq.a});
            }
            if (i2 == 3) {
                return new dkbs();
            }
            if (i2 == 4) {
                return new dkbp();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dkbs> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dkbs.class) {
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
