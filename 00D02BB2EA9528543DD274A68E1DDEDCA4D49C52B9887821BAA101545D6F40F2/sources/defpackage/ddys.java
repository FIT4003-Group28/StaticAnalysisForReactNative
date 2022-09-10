package defpackage;
/* compiled from: PG */
/* renamed from: ddys  reason: default package */
/* loaded from: classes6.dex */
public final class ddys extends dsqw<ddys, ddyr> implements dssk {
    public static final ddys d;
    private static volatile dssr<ddys> e;
    public int a;
    public int b;
    public int c;

    static {
        ddys ddysVar = new ddys();
        d = ddysVar;
        dsqw.cc(ddys.class, ddysVar);
    }

    private ddys() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001", new Object[]{"a", "b", "c"});
            }
            if (i2 == 3) {
                return new ddys();
            }
            if (i2 == 4) {
                return new ddyr();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<ddys> dssrVar = e;
            if (dssrVar == null) {
                synchronized (ddys.class) {
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
