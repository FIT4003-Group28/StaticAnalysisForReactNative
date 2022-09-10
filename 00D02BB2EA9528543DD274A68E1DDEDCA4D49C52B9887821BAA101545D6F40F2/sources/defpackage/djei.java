package defpackage;
/* compiled from: PG */
/* renamed from: djei  reason: default package */
/* loaded from: classes6.dex */
public final class djei extends dsqw<djei, djeh> implements dssk {
    public static final djei a;
    private static volatile dssr<djei> b;

    static {
        djei djeiVar = new djei();
        a = djeiVar;
        dsqw.cc(djei.class, djeiVar);
    }

    private djei() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(a, "\u0001\u0000", null);
            }
            if (i2 == 3) {
                return new djei();
            }
            if (i2 == 4) {
                return new djeh();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<djei> dssrVar = b;
            if (dssrVar == null) {
                synchronized (djei.class) {
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
