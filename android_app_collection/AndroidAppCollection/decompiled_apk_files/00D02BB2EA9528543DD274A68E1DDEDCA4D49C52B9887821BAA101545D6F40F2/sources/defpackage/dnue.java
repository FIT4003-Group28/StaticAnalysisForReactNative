package defpackage;
/* compiled from: PG */
/* renamed from: dnue  reason: default package */
/* loaded from: classes6.dex */
public final class dnue extends dsqw<dnue, dnud> implements dssk {
    public static final dnue b;
    private static volatile dssr<dnue> d;
    public int a;
    private int c;

    static {
        dnue dnueVar = new dnue();
        b = dnueVar;
        dsqw.cc(dnue.class, dnueVar);
    }

    private dnue() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"c", "a", dqek.c()});
            }
            if (i2 == 3) {
                return new dnue();
            }
            if (i2 == 4) {
                return new dnud();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dnue> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dnue.class) {
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
