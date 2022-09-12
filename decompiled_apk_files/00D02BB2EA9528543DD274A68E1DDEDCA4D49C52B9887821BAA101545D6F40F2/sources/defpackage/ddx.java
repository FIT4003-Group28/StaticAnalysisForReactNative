package defpackage;
/* compiled from: PG */
/* renamed from: ddx  reason: default package */
/* loaded from: classes6.dex */
public final class ddx extends dsqw<ddx, ddw> implements dssk {
    public static final ddx e;
    private static volatile dssr<ddx> f;
    public int a;
    public boolean b;
    public dstv c;
    public boolean d;

    static {
        ddx ddxVar = new ddx();
        e = ddxVar;
        dsqw.cc(ddx.class, ddxVar);
    }

    private ddx() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဉ\u0001\u0003ဇ\u0002", new Object[]{"a", "b", "c", "d"});
            }
            if (i2 == 3) {
                return new ddx();
            }
            if (i2 == 4) {
                return new ddw();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<ddx> dssrVar = f;
            if (dssrVar == null) {
                synchronized (ddx.class) {
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
