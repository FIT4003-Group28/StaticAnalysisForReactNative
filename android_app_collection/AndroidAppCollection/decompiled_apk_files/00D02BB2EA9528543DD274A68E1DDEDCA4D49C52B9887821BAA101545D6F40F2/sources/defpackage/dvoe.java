package defpackage;
/* compiled from: PG */
/* renamed from: dvoe  reason: default package */
/* loaded from: classes6.dex */
public final class dvoe extends dsqw<dvoe, dvod> implements dssk {
    public static final dvoe b;
    private static volatile dssr<dvoe> d;
    public dvoc a;
    private int c;

    static {
        dvoe dvoeVar = new dvoe();
        b = dvoeVar;
        dsqw.cc(dvoe.class, dvoeVar);
    }

    private dvoe() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"c", "a"});
            }
            if (i2 == 3) {
                return new dvoe();
            }
            if (i2 == 4) {
                return new dvod();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dvoe> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dvoe.class) {
                    dssrVar = d;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(b);
                        d = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
