package defpackage;
/* compiled from: PG */
/* renamed from: bzjl  reason: default package */
/* loaded from: classes4.dex */
public final class bzjl extends dsqw<bzjl, bzjk> implements dssk {
    public static final bzjl e;
    private static volatile dssr<bzjl> f;
    public int a;
    public long b;
    public long c;
    public long d;

    static {
        bzjl bzjlVar = new bzjl();
        e = bzjlVar;
        dsqw.cc(bzjl.class, bzjlVar);
    }

    private bzjl() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003ဂ\u0002", new Object[]{"a", "b", "c", "d"});
            }
            if (i2 == 3) {
                return new bzjl();
            }
            if (i2 == 4) {
                return new bzjk();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<bzjl> dssrVar = f;
            if (dssrVar == null) {
                synchronized (bzjl.class) {
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
