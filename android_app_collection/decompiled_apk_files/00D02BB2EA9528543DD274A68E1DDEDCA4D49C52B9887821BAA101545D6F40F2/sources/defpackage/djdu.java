package defpackage;
/* compiled from: PG */
/* renamed from: djdu  reason: default package */
/* loaded from: classes6.dex */
public final class djdu extends dsqw<djdu, djdt> implements dssk {
    public static final djdu a;
    private static volatile dssr<djdu> b;

    static {
        djdu djduVar = new djdu();
        a = djduVar;
        dsqw.cc(djdu.class, djduVar);
    }

    private djdu() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(a, "\u0001\u0000", null);
            }
            if (i2 == 3) {
                return new djdu();
            }
            if (i2 == 4) {
                return new djdt();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<djdu> dssrVar = b;
            if (dssrVar == null) {
                synchronized (djdu.class) {
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
