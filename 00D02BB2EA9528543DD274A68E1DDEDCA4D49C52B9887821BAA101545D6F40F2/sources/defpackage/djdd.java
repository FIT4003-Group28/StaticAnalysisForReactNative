package defpackage;
/* compiled from: PG */
/* renamed from: djdd  reason: default package */
/* loaded from: classes6.dex */
public final class djdd extends dsqw<djdd, djdc> implements dssk {
    public static final djdd e;
    private static volatile dssr<djdd> f;
    public int a;
    public int b;
    public String c = "";
    public String d = "";

    static {
        djdd djddVar = new djdd();
        e = djddVar;
        dsqw.cc(djdd.class, djddVar);
    }

    private djdd() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(e, "\u0001\u0003\u0000\u0001\u0001\u0005\u0003\u0000\u0000\u0000\u0001င\u0000\u0002ဈ\u0001\u0005ဈ\u0002", new Object[]{"a", "b", "c", "d"});
            }
            if (i2 == 3) {
                return new djdd();
            }
            if (i2 == 4) {
                return new djdc();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<djdd> dssrVar = f;
            if (dssrVar == null) {
                synchronized (djdd.class) {
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
