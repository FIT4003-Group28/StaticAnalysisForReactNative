package defpackage;
/* compiled from: PG */
/* renamed from: dtpz  reason: default package */
/* loaded from: classes6.dex */
public final class dtpz extends dsqw<dtpz, dtpw> implements dssk {
    public static final dsrg<Integer, dtpy> f = new dtpv();
    public static final dtpz g;
    private static volatile dssr<dtpz> h;
    public int a;
    public int b;
    public int c;
    public dtjf d;
    public dsrf e = dsqz.b;

    static {
        dtpz dtpzVar = new dtpz();
        g = dtpzVar;
        dsqw.cc(dtpz.class, dtpzVar);
    }

    private dtpz() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(g, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001င\u0000\u0002င\u0001\u0003ဉ\u0002\u0004\u001e", new Object[]{"a", "b", "c", "d", "e", dtpy.c()});
            }
            if (i2 == 3) {
                return new dtpz();
            }
            if (i2 == 4) {
                return new dtpw();
            }
            if (i2 == 5) {
                return g;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dtpz> dssrVar = h;
            if (dssrVar == null) {
                synchronized (dtpz.class) {
                    dssrVar = h;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(g);
                        h = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
