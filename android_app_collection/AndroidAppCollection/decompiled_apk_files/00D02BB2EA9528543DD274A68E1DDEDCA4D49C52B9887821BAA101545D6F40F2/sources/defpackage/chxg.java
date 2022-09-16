package defpackage;
/* compiled from: PG */
/* renamed from: chxg  reason: default package */
/* loaded from: classes4.dex */
public final class chxg extends dsqw<chxg, chwx> implements dssk {
    public static final chxg e;
    private static volatile dssr<chxg> f;
    public int a;
    public dwfl b;
    public int c;
    public chxf d;

    static {
        chxg chxgVar = new chxg();
        e = chxgVar;
        dsqw.cc(chxg.class, chxgVar);
    }

    private chxg() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(e, "\u0001\u0003\u0000\u0001\u0001\u0005\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဌ\u0001\u0005ဉ\u0003", new Object[]{"a", "b", "c", dgfb.c(), "d"});
            }
            if (i2 == 3) {
                return new chxg();
            }
            if (i2 == 4) {
                return new chwx();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<chxg> dssrVar = f;
            if (dssrVar == null) {
                synchronized (chxg.class) {
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
