package defpackage;
/* compiled from: PG */
/* renamed from: dqzu  reason: default package */
/* loaded from: classes6.dex */
public final class dqzu extends dsqw<dqzu, dqzr> implements dssk {
    public static final dqzu b;
    private static volatile dssr<dqzu> d;
    public int a;
    private int c;

    static {
        dqzu dqzuVar = new dqzu();
        b = dqzuVar;
        dsqw.cc(dqzu.class, dqzuVar);
    }

    private dqzu() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"c", "a", dqzs.a});
            }
            if (i2 == 3) {
                return new dqzu();
            }
            if (i2 == 4) {
                return new dqzr();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dqzu> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dqzu.class) {
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
