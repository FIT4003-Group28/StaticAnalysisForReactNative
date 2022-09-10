package defpackage;
/* compiled from: PG */
/* renamed from: dgde  reason: default package */
/* loaded from: classes6.dex */
public final class dgde extends dsqw<dgde, dgdd> implements dssk {
    public static final dgde f;
    private static volatile dssr<dgde> g;
    public int a;
    public dgcs b;
    public dgdl c;
    public dgcw d;
    public dgcu e;

    static {
        dgde dgdeVar = new dgde();
        f = dgdeVar;
        dsqw.cc(dgde.class, dgdeVar);
    }

    private dgde() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(f, "\u0001\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0005ဉ\u0004", new Object[]{"a", "b", "c", "d", "e"});
            }
            if (i2 == 3) {
                return new dgde();
            }
            if (i2 == 4) {
                return new dgdd();
            }
            if (i2 == 5) {
                return f;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dgde> dssrVar = g;
            if (dssrVar == null) {
                synchronized (dgde.class) {
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
