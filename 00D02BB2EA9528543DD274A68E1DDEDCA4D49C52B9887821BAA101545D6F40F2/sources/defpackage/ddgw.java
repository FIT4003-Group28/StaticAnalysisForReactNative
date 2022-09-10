package defpackage;
/* compiled from: PG */
/* renamed from: ddgw  reason: default package */
/* loaded from: classes5.dex */
public final class ddgw extends dsqw<ddgw, ddgu> implements dssk {
    public static final ddgw c;
    private static volatile dssr<ddgw> d;
    public int a;
    public int b;

    static {
        ddgw ddgwVar = new ddgw();
        c = ddgwVar;
        dsqw.cc(ddgw.class, ddgwVar);
    }

    private ddgw() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"a", "b", ddgv.a});
            }
            if (i2 == 3) {
                return new ddgw();
            }
            if (i2 == 4) {
                return new ddgu();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<ddgw> dssrVar = d;
            if (dssrVar == null) {
                synchronized (ddgw.class) {
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
