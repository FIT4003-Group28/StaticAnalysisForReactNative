package defpackage;
/* compiled from: PG */
/* renamed from: dryt  reason: default package */
/* loaded from: classes6.dex */
public final class dryt extends dsqw<dryt, drys> implements dssk {
    public static final dryt a;
    private static volatile dssr<dryt> b;

    static {
        dryt drytVar = new dryt();
        a = drytVar;
        dsqw.cc(dryt.class, drytVar);
    }

    private dryt() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(a, "\u0001\u0000", null);
            }
            if (i2 == 3) {
                return new dryt();
            }
            if (i2 == 4) {
                return new drys();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dryt> dssrVar = b;
            if (dssrVar == null) {
                synchronized (dryt.class) {
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
