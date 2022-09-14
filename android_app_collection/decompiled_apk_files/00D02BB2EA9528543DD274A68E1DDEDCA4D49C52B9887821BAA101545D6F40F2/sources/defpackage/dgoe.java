package defpackage;
/* compiled from: PG */
/* renamed from: dgoe  reason: default package */
/* loaded from: classes6.dex */
public final class dgoe extends dsqw<dgoe, dgod> implements dssk {
    public static final dgoe a;
    private static volatile dssr<dgoe> b;

    static {
        dgoe dgoeVar = new dgoe();
        a = dgoeVar;
        dsqw.cc(dgoe.class, dgoeVar);
    }

    private dgoe() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(a, "\u0001\u0000", null);
            }
            if (i2 == 3) {
                return new dgoe();
            }
            if (i2 == 4) {
                return new dgod();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dgoe> dssrVar = b;
            if (dssrVar == null) {
                synchronized (dgoe.class) {
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
