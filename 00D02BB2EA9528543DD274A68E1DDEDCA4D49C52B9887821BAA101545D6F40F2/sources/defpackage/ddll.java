package defpackage;
/* compiled from: PG */
/* renamed from: ddll  reason: default package */
/* loaded from: classes.dex */
public final class ddll extends dsqw<ddll, ddlk> implements dssk {
    public static final ddll e;
    private static volatile dssr<ddll> f;
    public int a;
    public int b;
    public int c;
    public int d;

    static {
        ddll ddllVar = new ddll();
        e = ddllVar;
        dsqw.cc(ddll.class, ddllVar);
    }

    private ddll() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001\u0003င\u0002", new Object[]{"a", "b", duks.a, "c", dusa.a, "d"});
            }
            if (i2 == 3) {
                return new ddll();
            }
            if (i2 == 4) {
                return new ddlk();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<ddll> dssrVar = f;
            if (dssrVar == null) {
                synchronized (ddll.class) {
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
