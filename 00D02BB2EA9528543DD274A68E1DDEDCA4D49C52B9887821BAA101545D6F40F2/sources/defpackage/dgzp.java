package defpackage;
/* compiled from: PG */
/* renamed from: dgzp  reason: default package */
/* loaded from: classes6.dex */
public final class dgzp extends dsqw<dgzp, dgzo> implements dssk {
    public static final dgzp e;
    private static volatile dssr<dgzp> f;
    public int a;
    public int b;
    public dgzl c;
    public dgzn d;

    static {
        dgzp dgzpVar = new dgzp();
        e = dgzpVar;
        dsqw.cc(dgzp.class, dgzpVar);
    }

    private dgzp() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(e, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0003ဉ\u0003\u0004ဉ\u0002", new Object[]{"a", "b", dgxs.c(), "d", "c"});
            }
            if (i2 == 3) {
                return new dgzp();
            }
            if (i2 == 4) {
                return new dgzo();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dgzp> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dgzp.class) {
                    dssrVar = f;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(e);
                        f = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
