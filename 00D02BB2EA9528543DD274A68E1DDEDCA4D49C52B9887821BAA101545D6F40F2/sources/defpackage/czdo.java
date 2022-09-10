package defpackage;
/* compiled from: PG */
/* renamed from: czdo  reason: default package */
/* loaded from: classes5.dex */
public final class czdo extends dsqw<czdo, czdm> implements dssk {
    public static final czdo e;
    private static volatile dssr<czdo> f;
    public long a;
    public cylc b;
    public int c;
    public dsrj<String> d = dssu.b;

    static {
        czdo czdoVar = new czdo();
        e = czdoVar;
        dsqw.cc(czdo.class, czdoVar);
    }

    private czdo() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(e, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0001\u0000\u0001\u0003\u0002\t\u0003\f\u0004Ț", new Object[]{"a", "b", "c", "d"});
            }
            if (i2 == 3) {
                return new czdo();
            }
            if (i2 == 4) {
                return new czdm();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<czdo> dssrVar = f;
            if (dssrVar == null) {
                synchronized (czdo.class) {
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
