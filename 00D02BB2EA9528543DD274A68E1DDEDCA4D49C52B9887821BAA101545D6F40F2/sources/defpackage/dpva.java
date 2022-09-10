package defpackage;
/* compiled from: PG */
/* renamed from: dpva  reason: default package */
/* loaded from: classes.dex */
public final class dpva extends dsqw<dpva, dpux> implements dssk {
    public static final dpva c;
    private static volatile dssr<dpva> d;
    public int a;
    public int b;

    static {
        dpva dpvaVar = new dpva();
        c = dpvaVar;
        dsqw.cc(dpva.class, dpvaVar);
    }

    private dpva() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"a", "b", dpuz.c()});
            }
            if (i2 == 3) {
                return new dpva();
            }
            if (i2 == 4) {
                return new dpux();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dpva> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dpva.class) {
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
