package defpackage;
/* compiled from: PG */
/* renamed from: dngu  reason: default package */
/* loaded from: classes6.dex */
public final class dngu extends dsqw<dngu, dngt> implements dssk {
    public static final dngu e;
    private static volatile dssr<dngu> f;
    public int a;
    public int b;
    public int c;
    public int d;

    static {
        dngu dnguVar = new dngu();
        e = dnguVar;
        dsqw.cc(dngu.class, dnguVar);
    }

    private dngu() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0002", new Object[]{"a", "b", "c", "d"});
            }
            if (i2 == 3) {
                return new dngu();
            }
            if (i2 == 4) {
                return new dngt();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dngu> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dngu.class) {
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
