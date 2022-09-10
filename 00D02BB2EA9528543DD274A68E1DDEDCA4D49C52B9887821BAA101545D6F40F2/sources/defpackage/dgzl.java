package defpackage;
/* compiled from: PG */
/* renamed from: dgzl  reason: default package */
/* loaded from: classes6.dex */
public final class dgzl extends dsqw<dgzl, dgzk> implements dssk {
    public static final dgzl a;
    private static volatile dssr<dgzl> b;

    static {
        dgzl dgzlVar = new dgzl();
        a = dgzlVar;
        dsqw.cc(dgzl.class, dgzlVar);
    }

    private dgzl() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(a, "\u0001\u0000", null);
            }
            if (i2 == 3) {
                return new dgzl();
            }
            if (i2 == 4) {
                return new dgzk();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dgzl> dssrVar = b;
            if (dssrVar == null) {
                synchronized (dgzl.class) {
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
