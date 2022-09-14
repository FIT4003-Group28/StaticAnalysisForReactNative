package defpackage;
/* compiled from: PG */
/* renamed from: druw  reason: default package */
/* loaded from: classes6.dex */
public final class druw extends dsqw<druw, druv> implements dssk {
    public static final druw a;
    private static volatile dssr<druw> b;

    static {
        druw druwVar = new druw();
        a = druwVar;
        dsqw.cc(druw.class, druwVar);
    }

    private druw() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(a, "\u0001\u0000", null);
            }
            if (i2 == 3) {
                return new druw();
            }
            if (i2 == 4) {
                return new druv();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<druw> dssrVar = b;
            if (dssrVar == null) {
                synchronized (druw.class) {
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
