package defpackage;
/* compiled from: PG */
/* renamed from: dqio  reason: default package */
/* loaded from: classes.dex */
public final class dqio extends dsqw<dqio, dqin> implements dssk {
    public static final dqio b;
    private static volatile dssr<dqio> d;
    public boolean a;
    private int c;

    static {
        dqio dqioVar = new dqio();
        b = dqioVar;
        dsqw.cc(dqio.class, dqioVar);
    }

    private dqio() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဇ\u0000", new Object[]{"c", "a"});
            }
            if (i2 == 3) {
                return new dqio();
            }
            if (i2 == 4) {
                return new dqin();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dqio> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dqio.class) {
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
