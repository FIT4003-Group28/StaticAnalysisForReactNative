package defpackage;
/* compiled from: PG */
/* renamed from: dgzd  reason: default package */
/* loaded from: classes6.dex */
public final class dgzd extends dsqw<dgzd, dgza> implements dssk {
    public static final dgzd d;
    private static volatile dssr<dgzd> e;
    public int a;
    public dgzc b;
    public dgyz c;

    static {
        dgzd dgzdVar = new dgzd();
        d = dgzdVar;
        dsqw.cc(dgzd.class, dgzdVar);
    }

    private dgzd() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0002", new Object[]{"a", "b", "c"});
            }
            if (i2 == 3) {
                return new dgzd();
            }
            if (i2 == 4) {
                return new dgza();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dgzd> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dgzd.class) {
                    dssrVar = e;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(d);
                        e = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
