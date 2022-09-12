package defpackage;
/* compiled from: PG */
/* renamed from: dryl  reason: default package */
/* loaded from: classes6.dex */
public final class dryl extends dsqw<dryl, dryk> implements dssk {
    public static final dryl a;
    private static volatile dssr<dryl> b;

    static {
        dryl drylVar = new dryl();
        a = drylVar;
        dsqw.cc(dryl.class, drylVar);
    }

    private dryl() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(a, "\u0001\u0000", null);
            }
            if (i2 == 3) {
                return new dryl();
            }
            if (i2 == 4) {
                return new dryk();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dryl> dssrVar = b;
            if (dssrVar == null) {
                synchronized (dryl.class) {
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
