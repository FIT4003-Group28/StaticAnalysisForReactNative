package defpackage;
/* compiled from: PG */
/* renamed from: ddxi  reason: default package */
/* loaded from: classes6.dex */
public final class ddxi extends dsqw<ddxi, ddxh> implements dssk {
    public static final ddxi c;
    private static volatile dssr<ddxi> d;
    public int a;
    public boolean b;

    static {
        ddxi ddxiVar = new ddxi();
        c = ddxiVar;
        dsqw.cc(ddxi.class, ddxiVar);
    }

    private ddxi() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဇ\u0000", new Object[]{"a", "b"});
            }
            if (i2 == 3) {
                return new ddxi();
            }
            if (i2 == 4) {
                return new ddxh();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<ddxi> dssrVar = d;
            if (dssrVar == null) {
                synchronized (ddxi.class) {
                    dssrVar = d;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(c);
                        d = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
