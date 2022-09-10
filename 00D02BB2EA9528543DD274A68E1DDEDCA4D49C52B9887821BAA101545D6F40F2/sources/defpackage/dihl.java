package defpackage;
/* compiled from: PG */
/* renamed from: dihl  reason: default package */
/* loaded from: classes6.dex */
public final class dihl extends dsqw<dihl, dihk> implements dssk {
    public static final dihl a;
    private static volatile dssr<dihl> b;

    static {
        dihl dihlVar = new dihl();
        a = dihlVar;
        dsqw.cc(dihl.class, dihlVar);
    }

    private dihl() {
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
                return new dihl();
            }
            if (i2 == 4) {
                return new dihk();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dihl> dssrVar = b;
            if (dssrVar == null) {
                synchronized (dihl.class) {
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
