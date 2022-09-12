package defpackage;
/* compiled from: PG */
/* renamed from: dvyv  reason: default package */
/* loaded from: classes.dex */
public final class dvyv extends dsqw<dvyv, dvyu> implements dssk {
    public static final dvyv b;
    private static volatile dssr<dvyv> c;
    public dsrj<dvyr> a = dssu.b;

    static {
        dvyv dvyvVar = new dvyv();
        b = dvyvVar;
        dsqw.cc(dvyv.class, dvyvVar);
    }

    private dvyv() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", dvyr.class});
            }
            if (i2 == 3) {
                return new dvyv();
            }
            if (i2 == 4) {
                return new dvyu();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dvyv> dssrVar = c;
            if (dssrVar == null) {
                synchronized (dvyv.class) {
                    dssrVar = c;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(b);
                        c = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
