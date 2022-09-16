package defpackage;
/* compiled from: PG */
/* renamed from: drzo  reason: default package */
/* loaded from: classes6.dex */
public final class drzo extends dsqw<drzo, drzn> implements dssk {
    public static final drzo a;
    private static volatile dssr<drzo> b;

    static {
        drzo drzoVar = new drzo();
        a = drzoVar;
        dsqw.cc(drzo.class, drzoVar);
    }

    private drzo() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(a, "\u0001\u0000", null);
            }
            if (i2 == 3) {
                return new drzo();
            }
            if (i2 == 4) {
                return new drzn();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<drzo> dssrVar = b;
            if (dssrVar == null) {
                synchronized (drzo.class) {
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
