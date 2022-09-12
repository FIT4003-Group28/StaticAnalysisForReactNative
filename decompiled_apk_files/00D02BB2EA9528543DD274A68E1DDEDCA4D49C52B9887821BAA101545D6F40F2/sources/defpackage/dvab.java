package defpackage;
/* compiled from: PG */
/* renamed from: dvab  reason: default package */
/* loaded from: classes6.dex */
public final class dvab extends dsqw<dvab, duzy> implements dssk {
    public static final dvab b;
    private static volatile dssr<dvab> c;
    public dsrj<dvaa> a = dssu.b;

    static {
        dvab dvabVar = new dvab();
        b = dvabVar;
        dsqw.cc(dvab.class, dvabVar);
    }

    private dvab() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", dvaa.class});
            }
            if (i2 == 3) {
                return new dvab();
            }
            if (i2 == 4) {
                return new duzy();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dvab> dssrVar = c;
            if (dssrVar == null) {
                synchronized (dvab.class) {
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
