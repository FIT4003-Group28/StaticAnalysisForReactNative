package defpackage;
/* compiled from: PG */
/* renamed from: drve  reason: default package */
/* loaded from: classes6.dex */
public final class drve extends dsqw<drve, drvd> implements dssk {
    public static final drve a;
    private static volatile dssr<drve> b;

    static {
        drve drveVar = new drve();
        a = drveVar;
        dsqw.cc(drve.class, drveVar);
    }

    private drve() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(a, "\u0001\u0000", null);
            }
            if (i2 == 3) {
                return new drve();
            }
            if (i2 == 4) {
                return new drvd();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<drve> dssrVar = b;
            if (dssrVar == null) {
                synchronized (drve.class) {
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
