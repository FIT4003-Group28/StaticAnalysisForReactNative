package defpackage;
/* compiled from: PG */
/* renamed from: dlpa  reason: default package */
/* loaded from: classes6.dex */
public final class dlpa extends dsqw<dlpa, dloy> implements dssk {
    public static final dlpa c;
    private static volatile dssr<dlpa> d;
    public int a;
    public int b;

    static {
        dlpa dlpaVar = new dlpa();
        c = dlpaVar;
        dsqw.cc(dlpa.class, dlpaVar);
    }

    private dlpa() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"a", "b", dloz.a});
            }
            if (i2 == 3) {
                return new dlpa();
            }
            if (i2 == 4) {
                return new dloy();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dlpa> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dlpa.class) {
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
