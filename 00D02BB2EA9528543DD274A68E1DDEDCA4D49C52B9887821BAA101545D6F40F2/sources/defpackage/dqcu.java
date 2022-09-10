package defpackage;
/* compiled from: PG */
/* renamed from: dqcu  reason: default package */
/* loaded from: classes6.dex */
public final class dqcu extends dsqw<dqcu, dqcr> implements dssk {
    public static final dqcu c;
    private static volatile dssr<dqcu> d;
    public int a;
    public int b = 1;

    static {
        dqcu dqcuVar = new dqcu();
        c = dqcuVar;
        dsqw.cc(dqcu.class, dqcuVar);
    }

    private dqcu() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"a", "b", dqcs.a});
            }
            if (i2 == 3) {
                return new dqcu();
            }
            if (i2 == 4) {
                return new dqcr();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dqcu> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dqcu.class) {
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
