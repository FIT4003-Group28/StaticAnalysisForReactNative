package defpackage;
/* compiled from: PG */
/* renamed from: ddua  reason: default package */
/* loaded from: classes6.dex */
public final class ddua extends dsqw<ddua, ddtz> implements dssk {
    public static final ddua a;
    private static volatile dssr<ddua> b;

    static {
        ddua dduaVar = new ddua();
        a = dduaVar;
        dsqw.cc(ddua.class, dduaVar);
    }

    private ddua() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(a, "\u0001\u0000", null);
            }
            if (i2 == 3) {
                return new ddua();
            }
            if (i2 == 4) {
                return new ddtz();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<ddua> dssrVar = b;
            if (dssrVar == null) {
                synchronized (ddua.class) {
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
