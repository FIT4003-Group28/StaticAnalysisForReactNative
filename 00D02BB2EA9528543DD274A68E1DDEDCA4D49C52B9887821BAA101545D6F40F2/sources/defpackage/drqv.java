package defpackage;
/* compiled from: PG */
/* renamed from: drqv  reason: default package */
/* loaded from: classes6.dex */
public final class drqv extends dsqw<drqv, drqu> implements dssk {
    public static final drqv a;
    private static volatile dssr<drqv> b;

    static {
        drqv drqvVar = new drqv();
        a = drqvVar;
        dsqw.cc(drqv.class, drqvVar);
    }

    private drqv() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(a, "\u0001\u0000", null);
            }
            if (i2 == 3) {
                return new drqv();
            }
            if (i2 == 4) {
                return new drqu();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<drqv> dssrVar = b;
            if (dssrVar == null) {
                synchronized (drqv.class) {
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
