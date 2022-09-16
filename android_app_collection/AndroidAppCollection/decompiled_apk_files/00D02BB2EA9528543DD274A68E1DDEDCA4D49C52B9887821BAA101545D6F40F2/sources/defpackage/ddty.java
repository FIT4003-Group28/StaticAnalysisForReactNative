package defpackage;
/* compiled from: PG */
/* renamed from: ddty  reason: default package */
/* loaded from: classes6.dex */
public final class ddty extends dsqw<ddty, ddtv> implements dssk {
    public static final ddty e;
    private static volatile dssr<ddty> f;
    public int a;
    public dsrf b = dsqz.b;
    public dsrf c = dsqz.b;
    public int d;

    static {
        ddty ddtyVar = new ddty();
        e = ddtyVar;
        dsqw.cc(ddty.class, ddtyVar);
    }

    private ddty() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0002\u0000\u0001\u001e\u0002\u0016\u0003င\u0000", new Object[]{"a", "b", ddtx.c(), "c", "d"});
            }
            if (i2 == 3) {
                return new ddty();
            }
            if (i2 == 4) {
                return new ddtv();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<ddty> dssrVar = f;
            if (dssrVar == null) {
                synchronized (ddty.class) {
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
