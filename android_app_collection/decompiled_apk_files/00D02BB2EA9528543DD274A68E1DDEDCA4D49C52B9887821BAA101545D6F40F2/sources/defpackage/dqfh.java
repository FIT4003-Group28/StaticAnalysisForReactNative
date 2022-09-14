package defpackage;
/* compiled from: PG */
/* renamed from: dqfh  reason: default package */
/* loaded from: classes6.dex */
public final class dqfh extends dsqw<dqfh, dqfe> implements dssk {
    public static final dqfh b;
    private static volatile dssr<dqfh> d;
    public int a;
    private int c;

    static {
        dqfh dqfhVar = new dqfh();
        b = dqfhVar;
        dsqw.cc(dqfh.class, dqfhVar);
    }

    private dqfh() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"c", "a", dqfg.c()});
            }
            if (i2 == 3) {
                return new dqfh();
            }
            if (i2 == 4) {
                return new dqfe();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dqfh> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dqfh.class) {
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
