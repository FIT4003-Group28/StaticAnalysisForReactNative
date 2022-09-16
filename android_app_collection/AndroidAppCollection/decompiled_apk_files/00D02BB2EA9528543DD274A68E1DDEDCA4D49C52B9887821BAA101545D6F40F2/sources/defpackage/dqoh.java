package defpackage;
/* compiled from: PG */
/* renamed from: dqoh  reason: default package */
/* loaded from: classes6.dex */
public final class dqoh extends dsqw<dqoh, dqog> implements dssk {
    public static final dqoh b;
    private static volatile dssr<dqoh> d;
    public boolean a;
    private int c;

    static {
        dqoh dqohVar = new dqoh();
        b = dqohVar;
        dsqw.cc(dqoh.class, dqohVar);
    }

    private dqoh() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002ဇ\u0001", new Object[]{"c", "a"});
            }
            if (i2 == 3) {
                return new dqoh();
            }
            if (i2 == 4) {
                return new dqog();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dqoh> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dqoh.class) {
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
