package defpackage;
/* compiled from: PG */
/* renamed from: dfsg  reason: default package */
/* loaded from: classes6.dex */
public final class dfsg extends dsqw<dfsg, dfsf> implements dssk {
    public static final dfsg e;
    private static volatile dssr<dfsg> f;
    public int a;
    public int b;
    public dftd c;
    public dhjx d;

    static {
        dfsg dfsgVar = new dfsg();
        e = dfsgVar;
        dsqw.cc(dfsg.class, dfsgVar);
    }

    private dfsg() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new Object[]{"a", "b", dfsd.a, "c", "d"});
            }
            if (i2 == 3) {
                return new dfsg();
            }
            if (i2 == 4) {
                return new dfsf();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dfsg> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dfsg.class) {
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
