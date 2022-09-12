package defpackage;
/* compiled from: PG */
/* renamed from: dgla  reason: default package */
/* loaded from: classes6.dex */
public final class dgla extends dsqw<dgla, dgkz> implements dssk {
    public static final dgla a;
    private static volatile dssr<dgla> b;

    static {
        dgla dglaVar = new dgla();
        a = dglaVar;
        dsqw.cc(dgla.class, dglaVar);
    }

    private dgla() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(a, "\u0001\u0000", null);
            }
            if (i2 == 3) {
                return new dgla();
            }
            if (i2 == 4) {
                return new dgkz();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dgla> dssrVar = b;
            if (dssrVar == null) {
                synchronized (dgla.class) {
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
