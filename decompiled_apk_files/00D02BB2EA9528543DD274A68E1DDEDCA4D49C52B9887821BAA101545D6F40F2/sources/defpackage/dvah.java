package defpackage;
/* compiled from: PG */
/* renamed from: dvah  reason: default package */
/* loaded from: classes6.dex */
public final class dvah extends dsqw<dvah, dvag> implements dssk {
    public static final dvah c;
    private static volatile dssr<dvah> d;
    public int a;
    public djuz b;

    static {
        dvah dvahVar = new dvah();
        c = dvahVar;
        dsqw.cc(dvah.class, dvahVar);
    }

    private dvah() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"a", "b"});
            }
            if (i2 == 3) {
                return new dvah();
            }
            if (i2 == 4) {
                return new dvag();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dvah> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dvah.class) {
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
