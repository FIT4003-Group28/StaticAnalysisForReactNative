package defpackage;
/* compiled from: PG */
/* renamed from: dvzt  reason: default package */
/* loaded from: classes6.dex */
public final class dvzt extends dsqw<dvzt, dvzs> implements dssk {
    public static final dvzt c;
    private static volatile dssr<dvzt> d;
    public int a;
    public dpsn b;

    static {
        dvzt dvztVar = new dvzt();
        c = dvztVar;
        dsqw.cc(dvzt.class, dvztVar);
    }

    private dvzt() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"a", "b"});
            }
            if (i2 == 3) {
                return new dvzt();
            }
            if (i2 == 4) {
                return new dvzs();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dvzt> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dvzt.class) {
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
