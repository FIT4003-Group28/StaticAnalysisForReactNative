package defpackage;
/* compiled from: PG */
/* renamed from: dgem  reason: default package */
/* loaded from: classes6.dex */
public final class dgem extends dsqw<dgem, dgel> implements dssk {
    public static final dgem a;
    private static volatile dssr<dgem> b;

    static {
        dgem dgemVar = new dgem();
        a = dgemVar;
        dsqw.cc(dgem.class, dgemVar);
    }

    private dgem() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(a, "\u0001\u0000", null);
            }
            if (i2 == 3) {
                return new dgem();
            }
            if (i2 == 4) {
                return new dgel();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dgem> dssrVar = b;
            if (dssrVar == null) {
                synchronized (dgem.class) {
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
