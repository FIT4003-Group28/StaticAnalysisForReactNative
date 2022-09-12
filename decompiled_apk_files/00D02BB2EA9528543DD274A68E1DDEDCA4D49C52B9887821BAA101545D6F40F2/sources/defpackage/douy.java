package defpackage;
/* compiled from: PG */
/* renamed from: douy  reason: default package */
/* loaded from: classes6.dex */
public final class douy extends dsqw<douy, doux> implements dssk {
    public static final douy b;
    private static volatile dssr<douy> d;
    public int a;
    private int c;

    static {
        douy douyVar = new douy();
        b = douyVar;
        dsqw.cc(douy.class, douyVar);
    }

    private douy() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"c", "a", dqvh.c()});
            }
            if (i2 == 3) {
                return new douy();
            }
            if (i2 == 4) {
                return new doux();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<douy> dssrVar = d;
            if (dssrVar == null) {
                synchronized (douy.class) {
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
