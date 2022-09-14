package defpackage;
/* compiled from: PG */
/* renamed from: dgzv  reason: default package */
/* loaded from: classes6.dex */
public final class dgzv extends dsqw<dgzv, dgzs> implements dssk {
    public static final dgzv c;
    private static volatile dssr<dgzv> d;
    public dhad a;
    public dgzu b;

    static {
        dgzv dgzvVar = new dgzv();
        c = dgzvVar;
        dsqw.cc(dgzv.class, dgzvVar);
    }

    private dgzv() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0000\u0002\u0000\u0000\u0002\u0004\u0002\u0000\u0000\u0000\u0002\t\u0004\t", new Object[]{"a", "b"});
            }
            if (i2 == 3) {
                return new dgzv();
            }
            if (i2 == 4) {
                return new dgzs();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dgzv> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dgzv.class) {
                    dssrVar = d;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(c);
                        d = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
