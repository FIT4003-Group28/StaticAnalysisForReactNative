package defpackage;
/* compiled from: PG */
/* renamed from: dqth  reason: default package */
/* loaded from: classes6.dex */
public final class dqth extends dsqw<dqth, dqsm> implements dssk {
    public static final dqth b;
    private static volatile dssr<dqth> c;
    public dsrj<dqtg> a = dssu.b;

    static {
        dqth dqthVar = new dqth();
        b = dqthVar;
        dsqw.cc(dqth.class, dqthVar);
    }

    private dqth() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", dqtg.class});
            }
            if (i2 == 3) {
                return new dqth();
            }
            if (i2 == 4) {
                return new dqsm();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dqth> dssrVar = c;
            if (dssrVar == null) {
                synchronized (dqth.class) {
                    dssrVar = c;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(b);
                        c = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
