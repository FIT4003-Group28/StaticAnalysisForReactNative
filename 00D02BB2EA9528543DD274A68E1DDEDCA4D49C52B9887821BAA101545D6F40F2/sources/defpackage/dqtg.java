package defpackage;
/* compiled from: PG */
/* renamed from: dqtg  reason: default package */
/* loaded from: classes6.dex */
public final class dqtg extends dsqw<dqtg, dqsr> implements dssk {
    public static final dqtg c;
    private static volatile dssr<dqtg> d;
    public int a = 0;
    public Object b;

    static {
        dqtg dqtgVar = new dqtg();
        c = dqtgVar;
        dsqw.cc(dqtg.class, dqtgVar);
    }

    private dqtg() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0003\u0001\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001ြ\u0000\u0002ြ\u0000\u0003ြ\u0000", new Object[]{"b", "a", dqsq.class, dqtf.class, dqst.class});
            }
            if (i2 == 3) {
                return new dqtg();
            }
            if (i2 == 4) {
                return new dqsr();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dqtg> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dqtg.class) {
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
