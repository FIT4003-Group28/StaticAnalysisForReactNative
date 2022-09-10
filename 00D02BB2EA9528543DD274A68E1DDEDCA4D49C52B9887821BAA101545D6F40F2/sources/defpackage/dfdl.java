package defpackage;
/* compiled from: PG */
/* renamed from: dfdl  reason: default package */
/* loaded from: classes6.dex */
public final class dfdl extends dsqw<dfdl, dfdk> implements dssk {
    public static final dfdl e;
    private static volatile dssr<dfdl> f;
    public int a;
    public int b;
    public String c = "";
    public String d = "";

    static {
        dfdl dfdlVar = new dfdl();
        e = dfdlVar;
        dsqw.cc(dfdl.class, dfdlVar);
    }

    private dfdl() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(e, "\u0001\u0003\u0000\u0001\u0002\u0005\u0003\u0000\u0000\u0000\u0002င\u0000\u0004ဈ\u0001\u0005ဈ\u0002", new Object[]{"a", "b", "c", "d"});
            }
            if (i2 == 3) {
                return new dfdl();
            }
            if (i2 == 4) {
                return new dfdk();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dfdl> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dfdl.class) {
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
