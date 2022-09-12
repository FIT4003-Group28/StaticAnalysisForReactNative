package defpackage;
/* compiled from: PG */
/* renamed from: tqt  reason: default package */
/* loaded from: classes7.dex */
public final class tqt extends dsqw<tqt, tqs> implements dssk {
    public static final tqt c;
    private static volatile dssr<tqt> d;
    public int a;
    public int b = 1;

    static {
        tqt tqtVar = new tqt();
        c = tqtVar;
        dsqw.cc(tqt.class, tqtVar);
    }

    private tqt() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"a", "b", dqvb.c()});
            }
            if (i2 == 3) {
                return new tqt();
            }
            if (i2 == 4) {
                return new tqs();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<tqt> dssrVar = d;
            if (dssrVar == null) {
                synchronized (tqt.class) {
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
