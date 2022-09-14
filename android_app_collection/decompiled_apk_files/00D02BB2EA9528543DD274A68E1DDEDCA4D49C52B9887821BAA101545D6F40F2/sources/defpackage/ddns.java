package defpackage;
/* compiled from: PG */
/* renamed from: ddns  reason: default package */
/* loaded from: classes6.dex */
public final class ddns extends dsqw<ddns, ddnr> implements dssk {
    public static final ddns e;
    private static volatile dssr<ddns> f;
    public int a;
    public int b;
    public int c;
    public int d;

    static {
        ddns ddnsVar = new ddns();
        e = ddnsVar;
        dsqw.cc(ddns.class, ddnsVar);
    }

    private ddns() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0002", new Object[]{"a", "b", "c", "d"});
            }
            if (i2 == 3) {
                return new ddns();
            }
            if (i2 == 4) {
                return new ddnr();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<ddns> dssrVar = f;
            if (dssrVar == null) {
                synchronized (ddns.class) {
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
