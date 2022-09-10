package defpackage;
/* compiled from: PG */
/* renamed from: dqhm  reason: default package */
/* loaded from: classes6.dex */
public final class dqhm extends dsqw<dqhm, dqhl> implements dssk {
    public static final dqhm b;
    private static volatile dssr<dqhm> d;
    public String a = "";
    private int c;

    static {
        dqhm dqhmVar = new dqhm();
        b = dqhmVar;
        dsqw.cc(dqhm.class, dqhmVar);
    }

    private dqhm() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"c", "a"});
            }
            if (i2 == 3) {
                return new dqhm();
            }
            if (i2 == 4) {
                return new dqhl();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dqhm> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dqhm.class) {
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
