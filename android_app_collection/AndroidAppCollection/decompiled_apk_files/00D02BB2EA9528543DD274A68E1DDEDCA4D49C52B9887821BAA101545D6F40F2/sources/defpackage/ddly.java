package defpackage;
/* compiled from: PG */
/* renamed from: ddly  reason: default package */
/* loaded from: classes6.dex */
public final class ddly extends dsqw<ddly, ddlx> implements dssk {
    public static final ddly d;
    private static volatile dssr<ddly> e;
    public int a;
    public int b;
    public int c;

    static {
        ddly ddlyVar = new ddly();
        d = ddlyVar;
        dsqw.cc(ddly.class, ddlyVar);
    }

    private ddly() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001", new Object[]{"a", "b", "c"});
            }
            if (i2 == 3) {
                return new ddly();
            }
            if (i2 == 4) {
                return new ddlx();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<ddly> dssrVar = e;
            if (dssrVar == null) {
                synchronized (ddly.class) {
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
