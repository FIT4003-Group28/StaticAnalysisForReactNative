package defpackage;
/* compiled from: PG */
/* renamed from: dgny  reason: default package */
/* loaded from: classes6.dex */
public final class dgny extends dsqw<dgny, dgnx> implements dssk {
    public static final dgny a;
    private static volatile dssr<dgny> b;

    static {
        dgny dgnyVar = new dgny();
        a = dgnyVar;
        dsqw.cc(dgny.class, dgnyVar);
    }

    private dgny() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(a, "\u0001\u0000", null);
            }
            if (i2 == 3) {
                return new dgny();
            }
            if (i2 == 4) {
                return new dgnx();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dgny> dssrVar = b;
            if (dssrVar == null) {
                synchronized (dgny.class) {
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
