package defpackage;
/* compiled from: PG */
/* renamed from: dpyk  reason: default package */
/* loaded from: classes6.dex */
public final class dpyk extends dsqw<dpyk, dpyj> implements dssk {
    public static final dpyk e;
    private static volatile dssr<dpyk> f;
    public int a;
    public dnpq c;
    public String b = "";
    public String d = "";

    static {
        dpyk dpykVar = new dpyk();
        e = dpykVar;
        dsqw.cc(dpyk.class, dpykVar);
    }

    private dpyk() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(e, "\u0001\u0003\u0000\u0001\u0001\u0005\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0004ဉ\u0003\u0005ဈ\u0004", new Object[]{"a", "b", "c", "d"});
            }
            if (i2 == 3) {
                return new dpyk();
            }
            if (i2 == 4) {
                return new dpyj();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dpyk> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dpyk.class) {
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
