package defpackage;
/* compiled from: PG */
/* renamed from: drml  reason: default package */
/* loaded from: classes6.dex */
public final class drml extends dsqw<drml, drmk> implements dssk {
    public static final drml a;
    private static volatile dssr<drml> b;

    static {
        drml drmlVar = new drml();
        a = drmlVar;
        dsqw.cc(drml.class, drmlVar);
    }

    private drml() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(a, "\u0001\u0000", null);
            }
            if (i2 == 3) {
                return new drml();
            }
            if (i2 == 4) {
                return new drmk();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<drml> dssrVar = b;
            if (dssrVar == null) {
                synchronized (drml.class) {
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
