package defpackage;
/* compiled from: PG */
/* renamed from: djov  reason: default package */
/* loaded from: classes6.dex */
public final class djov extends dsqw<djov, djou> implements dssk {
    public static final djov a;
    private static volatile dssr<djov> b;

    static {
        djov djovVar = new djov();
        a = djovVar;
        dsqw.cc(djov.class, djovVar);
    }

    private djov() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(a, "\u0001\u0000", null);
            }
            if (i2 == 3) {
                return new djov();
            }
            if (i2 == 4) {
                return new djou();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<djov> dssrVar = b;
            if (dssrVar == null) {
                synchronized (djov.class) {
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
