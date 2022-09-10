package defpackage;
/* compiled from: PG */
/* renamed from: dvmo  reason: default package */
/* loaded from: classes6.dex */
public final class dvmo extends dsqw<dvmo, dvmn> implements dssk {
    public static final dsrg<Integer, drci> b = new dvmm();
    public static final dvmo c;
    private static volatile dssr<dvmo> d;
    public dsrf a = dsqz.b;

    static {
        dvmo dvmoVar = new dvmo();
        c = dvmoVar;
        dsqw.cc(dvmo.class, dvmoVar);
    }

    private dvmo() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001e", new Object[]{"a", drci.c()});
            }
            if (i2 == 3) {
                return new dvmo();
            }
            if (i2 == 4) {
                return new dvmn();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dvmo> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dvmo.class) {
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
