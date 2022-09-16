package defpackage;
/* compiled from: PG */
/* renamed from: dtgw  reason: default package */
/* loaded from: classes6.dex */
public final class dtgw extends dsqw<dtgw, dtgv> implements dssk {
    public static final dtgw c;
    private static volatile dssr<dtgw> e;
    public int a;
    public dtgt b;
    private int d;

    static {
        dtgw dtgwVar = new dtgw();
        c = dtgwVar;
        dsqw.cc(dtgw.class, dtgwVar);
    }

    private dtgw() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဉ\u0001", new Object[]{"d", "a", dsyl.c(), "b"});
            }
            if (i2 == 3) {
                return new dtgw();
            }
            if (i2 == 4) {
                return new dtgv();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dtgw> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dtgw.class) {
                    dssrVar = e;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(c);
                        e = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
