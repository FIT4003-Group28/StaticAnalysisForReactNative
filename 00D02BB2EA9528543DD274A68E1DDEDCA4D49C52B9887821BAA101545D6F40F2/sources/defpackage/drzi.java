package defpackage;
/* compiled from: PG */
/* renamed from: drzi  reason: default package */
/* loaded from: classes6.dex */
public final class drzi extends dsqw<drzi, drzh> implements dssk {
    public static final drzi a;
    private static volatile dssr<drzi> b;

    static {
        drzi drziVar = new drzi();
        a = drziVar;
        dsqw.cc(drzi.class, drziVar);
    }

    private drzi() {
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
                return new drzi();
            }
            if (i2 == 4) {
                return new drzh();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<drzi> dssrVar = b;
            if (dssrVar == null) {
                synchronized (drzi.class) {
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
