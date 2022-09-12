package defpackage;
/* compiled from: PG */
/* renamed from: dimu  reason: default package */
/* loaded from: classes6.dex */
public final class dimu extends dsqw<dimu, dimt> implements dssk {
    public static final dimu a;
    private static volatile dssr<dimu> b;

    static {
        dimu dimuVar = new dimu();
        a = dimuVar;
        dsqw.cc(dimu.class, dimuVar);
    }

    private dimu() {
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
                return new dimu();
            }
            if (i2 == 4) {
                return new dimt();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dimu> dssrVar = b;
            if (dssrVar == null) {
                synchronized (dimu.class) {
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
