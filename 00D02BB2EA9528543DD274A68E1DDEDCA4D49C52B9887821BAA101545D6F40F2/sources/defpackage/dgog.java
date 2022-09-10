package defpackage;
/* compiled from: PG */
/* renamed from: dgog  reason: default package */
/* loaded from: classes6.dex */
public final class dgog extends dsqw<dgog, dgof> implements dssk {
    public static final dgog a;
    private static volatile dssr<dgog> b;

    static {
        dgog dgogVar = new dgog();
        a = dgogVar;
        dsqw.cc(dgog.class, dgogVar);
    }

    private dgog() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(a, "\u0001\u0000", null);
            }
            if (i2 == 3) {
                return new dgog();
            }
            if (i2 == 4) {
                return new dgof();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dgog> dssrVar = b;
            if (dssrVar == null) {
                synchronized (dgog.class) {
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
