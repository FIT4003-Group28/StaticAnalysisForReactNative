package defpackage;
/* compiled from: PG */
/* renamed from: djdw  reason: default package */
/* loaded from: classes6.dex */
public final class djdw extends dsqw<djdw, djdv> implements dssk {
    public static final djdw b;
    private static volatile dssr<djdw> d;
    public dqdk a;
    private int c;

    static {
        djdw djdwVar = new djdw();
        b = djdwVar;
        dsqw.cc(djdw.class, djdwVar);
    }

    private djdw() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"c", "a"});
            }
            if (i2 == 3) {
                return new djdw();
            }
            if (i2 == 4) {
                return new djdv();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<djdw> dssrVar = d;
            if (dssrVar == null) {
                synchronized (djdw.class) {
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
