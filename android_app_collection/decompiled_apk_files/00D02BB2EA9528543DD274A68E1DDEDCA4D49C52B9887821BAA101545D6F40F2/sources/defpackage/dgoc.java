package defpackage;
/* compiled from: PG */
/* renamed from: dgoc  reason: default package */
/* loaded from: classes6.dex */
public final class dgoc extends dsqw<dgoc, dgob> implements dssk {
    public static final dgoc a;
    private static volatile dssr<dgoc> b;

    static {
        dgoc dgocVar = new dgoc();
        a = dgocVar;
        dsqw.cc(dgoc.class, dgocVar);
    }

    private dgoc() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(a, "\u0001\u0000", null);
            }
            if (i2 == 3) {
                return new dgoc();
            }
            if (i2 == 4) {
                return new dgob();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dgoc> dssrVar = b;
            if (dssrVar == null) {
                synchronized (dgoc.class) {
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
