package defpackage;
/* compiled from: PG */
/* renamed from: dgmv  reason: default package */
/* loaded from: classes6.dex */
public final class dgmv extends dsqw<dgmv, dgmu> implements dssk {
    public static final dgmv a;
    private static volatile dssr<dgmv> b;

    static {
        dgmv dgmvVar = new dgmv();
        a = dgmvVar;
        dsqw.cc(dgmv.class, dgmvVar);
    }

    private dgmv() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(a, "\u0001\u0000", null);
            }
            if (i2 == 3) {
                return new dgmv();
            }
            if (i2 == 4) {
                return new dgmu();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dgmv> dssrVar = b;
            if (dssrVar == null) {
                synchronized (dgmv.class) {
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
