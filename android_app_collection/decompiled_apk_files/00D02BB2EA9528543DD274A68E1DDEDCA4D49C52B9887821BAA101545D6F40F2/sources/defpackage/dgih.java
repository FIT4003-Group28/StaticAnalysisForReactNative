package defpackage;
/* compiled from: PG */
/* renamed from: dgih  reason: default package */
/* loaded from: classes6.dex */
public final class dgih extends dsqw<dgih, dgie> implements dssk {
    public static final dgih b;
    private static volatile dssr<dgih> d;
    public dgig a;
    private int c;

    static {
        dgih dgihVar = new dgih();
        b = dgihVar;
        dsqw.cc(dgih.class, dgihVar);
    }

    private dgih() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"c", "a"});
            }
            if (i2 == 3) {
                return new dgih();
            }
            if (i2 == 4) {
                return new dgie();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dgih> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dgih.class) {
                    dssrVar = d;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(b);
                        d = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
