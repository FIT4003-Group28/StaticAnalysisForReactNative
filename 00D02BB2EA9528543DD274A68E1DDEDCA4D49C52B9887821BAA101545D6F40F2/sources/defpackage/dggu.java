package defpackage;
/* compiled from: PG */
/* renamed from: dggu  reason: default package */
/* loaded from: classes6.dex */
public final class dggu extends dsqw<dggu, dggt> implements dssk {
    public static final dggu f;
    private static volatile dssr<dggu> g;
    public int a;
    public dghc b;
    public dggm c;
    public dggk d;
    public dgha e;

    static {
        dggu dgguVar = new dggu();
        f = dgguVar;
        dsqw.cc(dggu.class, dgguVar);
    }

    private dggu() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(f, "\u0001\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0005ဉ\u0004", new Object[]{"a", "b", "c", "d", "e"});
            }
            if (i2 == 3) {
                return new dggu();
            }
            if (i2 == 4) {
                return new dggt();
            }
            if (i2 == 5) {
                return f;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dggu> dssrVar = g;
            if (dssrVar == null) {
                synchronized (dggu.class) {
                    dssrVar = g;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(f);
                        g = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
