package defpackage;
/* compiled from: PG */
/* renamed from: dqcw  reason: default package */
/* loaded from: classes6.dex */
public final class dqcw extends dsqw<dqcw, dqcv> implements dssk {
    public static final dqcw b;
    private static volatile dssr<dqcw> d;
    public int a;
    private int c;

    static {
        dqcw dqcwVar = new dqcw();
        b = dqcwVar;
        dsqw.cc(dqcw.class, dqcwVar);
    }

    private dqcw() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"c", "a", dpqg.c()});
            }
            if (i2 == 3) {
                return new dqcw();
            }
            if (i2 == 4) {
                return new dqcv();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dqcw> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dqcw.class) {
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
