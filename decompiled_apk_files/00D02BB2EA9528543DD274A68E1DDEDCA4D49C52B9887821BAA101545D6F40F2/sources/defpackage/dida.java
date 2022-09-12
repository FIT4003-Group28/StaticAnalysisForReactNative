package defpackage;
/* compiled from: PG */
/* renamed from: dida  reason: default package */
/* loaded from: classes6.dex */
public final class dida extends dsqw<dida, dicz> implements dssk {
    public static final dida b;
    private static volatile dssr<dida> d;
    public dqac a;
    private int c;

    static {
        dida didaVar = new dida();
        b = didaVar;
        dsqw.cc(dida.class, didaVar);
    }

    private dida() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"c", "a"});
            }
            if (i2 == 3) {
                return new dida();
            }
            if (i2 == 4) {
                return new dicz();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dida> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dida.class) {
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
