package defpackage;
/* compiled from: PG */
/* renamed from: amyt  reason: default package */
/* loaded from: classes.dex */
public final class amyt extends dsqw<amyt, amys> implements dssk {
    public static final amyt c;
    private static volatile dssr<amyt> e;
    public amyx a;
    public dspd b = dspd.b;
    private int d;

    static {
        amyt amytVar = new amyt();
        c = amytVar;
        dsqw.cc(amyt.class, amytVar);
    }

    private amyt() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ည\u0001", new Object[]{"d", "a", "b"});
            }
            if (i2 == 3) {
                return new amyt();
            }
            if (i2 == 4) {
                return new amys();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<amyt> dssrVar = e;
            if (dssrVar == null) {
                synchronized (amyt.class) {
                    dssrVar = e;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(c);
                        e = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
