package defpackage;
/* compiled from: PG */
/* renamed from: daye  reason: default package */
/* loaded from: classes5.dex */
public final class daye extends dsqw<daye, dayd> implements dssk {
    public static final daye b;
    private static volatile dssr<daye> d;
    public boolean a;
    private int c;

    static {
        daye dayeVar = new daye();
        b = dayeVar;
        dsqw.cc(daye.class, dayeVar);
    }

    private daye() {
        dssu<Object> dssuVar = dssu.b;
        dsqz dsqzVar = dsqz.b;
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0001\u0003\u0003\u0001\u0000\u0000\u0000\u0003ဇ\u0005", new Object[]{"c", "a"});
            }
            if (i2 == 3) {
                return new daye();
            }
            if (i2 == 4) {
                return new dayd();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<daye> dssrVar = d;
            if (dssrVar == null) {
                synchronized (daye.class) {
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
