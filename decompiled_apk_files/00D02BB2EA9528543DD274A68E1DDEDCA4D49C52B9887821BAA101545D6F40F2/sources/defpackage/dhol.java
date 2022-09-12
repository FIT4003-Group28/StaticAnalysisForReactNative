package defpackage;
/* compiled from: PG */
/* renamed from: dhol  reason: default package */
/* loaded from: classes.dex */
public final class dhol extends dsqw<dhol, dhok> implements dssk {
    public static final dhol b;
    private static volatile dssr<dhol> d;
    public dnyw a;
    private int c;

    static {
        dhol dholVar = new dhol();
        b = dholVar;
        dsqw.cc(dhol.class, dholVar);
    }

    private dhol() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"c", "a"});
            }
            if (i2 == 3) {
                return new dhol();
            }
            if (i2 == 4) {
                return new dhok();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dhol> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dhol.class) {
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
