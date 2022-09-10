package defpackage;
/* compiled from: PG */
/* renamed from: dnar  reason: default package */
/* loaded from: classes6.dex */
public final class dnar extends dsqw<dnar, dnaq> implements dssk {
    public static final dnar a;
    private static volatile dssr<dnar> b;

    static {
        dnar dnarVar = new dnar();
        a = dnarVar;
        dsqw.cc(dnar.class, dnarVar);
    }

    private dnar() {
        dssu<Object> dssuVar = dssu.b;
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(a, "\u0001\u0000", null);
            }
            if (i2 == 3) {
                return new dnar();
            }
            if (i2 == 4) {
                return new dnaq();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dnar> dssrVar = b;
            if (dssrVar == null) {
                synchronized (dnar.class) {
                    dssrVar = b;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(a);
                        b = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
