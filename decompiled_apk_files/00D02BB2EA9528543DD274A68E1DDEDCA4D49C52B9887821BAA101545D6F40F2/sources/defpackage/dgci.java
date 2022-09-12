package defpackage;
/* compiled from: PG */
/* renamed from: dgci  reason: default package */
/* loaded from: classes6.dex */
public final class dgci extends dsqw<dgci, dgch> implements dssk {
    public static final dgci a;
    private static volatile dssr<dgci> b;

    static {
        dgci dgciVar = new dgci();
        a = dgciVar;
        dsqw.cc(dgci.class, dgciVar);
    }

    private dgci() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(a, "\u0001\u0000", null);
            }
            if (i2 == 3) {
                return new dgci();
            }
            if (i2 == 4) {
                return new dgch();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dgci> dssrVar = b;
            if (dssrVar == null) {
                synchronized (dgci.class) {
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
