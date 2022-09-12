package defpackage;
/* compiled from: PG */
/* renamed from: drjw  reason: default package */
/* loaded from: classes6.dex */
public final class drjw extends dsqw<drjw, drjv> implements dssk {
    public static final drjw a;
    private static volatile dssr<drjw> b;

    static {
        drjw drjwVar = new drjw();
        a = drjwVar;
        dsqw.cc(drjw.class, drjwVar);
    }

    private drjw() {
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
                return new drjw();
            }
            if (i2 == 4) {
                return new drjv();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<drjw> dssrVar = b;
            if (dssrVar == null) {
                synchronized (drjw.class) {
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
