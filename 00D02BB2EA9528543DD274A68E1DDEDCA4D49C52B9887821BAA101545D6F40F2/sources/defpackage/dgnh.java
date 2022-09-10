package defpackage;
/* compiled from: PG */
/* renamed from: dgnh  reason: default package */
/* loaded from: classes6.dex */
public final class dgnh extends dsqw<dgnh, dgng> implements dssk {
    public static final dgnh a;
    private static volatile dssr<dgnh> b;

    static {
        dgnh dgnhVar = new dgnh();
        a = dgnhVar;
        dsqw.cc(dgnh.class, dgnhVar);
    }

    private dgnh() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(a, "\u0001\u0000", null);
            }
            if (i2 == 3) {
                return new dgnh();
            }
            if (i2 == 4) {
                return new dgng();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dgnh> dssrVar = b;
            if (dssrVar == null) {
                synchronized (dgnh.class) {
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
