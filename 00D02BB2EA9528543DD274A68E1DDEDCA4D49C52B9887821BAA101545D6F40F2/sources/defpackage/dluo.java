package defpackage;
/* compiled from: PG */
/* renamed from: dluo  reason: default package */
/* loaded from: classes6.dex */
public final class dluo extends dsqw<dluo, dlun> implements dssk {
    public static final dluo b;
    private static volatile dssr<dluo> d;
    public int a;
    private int c;

    static {
        dluo dluoVar = new dluo();
        b = dluoVar;
        dsqw.cc(dluo.class, dluoVar);
    }

    private dluo() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"c", "a", dlup.a});
            }
            if (i2 == 3) {
                return new dluo();
            }
            if (i2 == 4) {
                return new dlun();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dluo> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dluo.class) {
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
