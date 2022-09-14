package defpackage;
/* compiled from: PG */
/* renamed from: byql  reason: default package */
/* loaded from: classes4.dex */
public final class byql extends dsqw<byql, byqk> implements dssk {
    public static final byql e;
    private static volatile dssr<byql> f;
    public int a;
    public long b;
    public dspd c = dspd.b;
    public String d = "";

    static {
        byql byqlVar = new byql();
        e = byqlVar;
        dsqw.cc(byql.class, byqlVar);
    }

    private byql() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဂ\u0000\u0002ည\u0001\u0003ဈ\u0002", new Object[]{"a", "b", "c", "d"});
            }
            if (i2 == 3) {
                return new byql();
            }
            if (i2 == 4) {
                return new byqk();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<byql> dssrVar = f;
            if (dssrVar == null) {
                synchronized (byql.class) {
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
