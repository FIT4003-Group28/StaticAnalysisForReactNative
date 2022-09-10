package defpackage;
/* compiled from: PG */
/* renamed from: dvkb  reason: default package */
/* loaded from: classes.dex */
public final class dvkb extends dsqw<dvkb, dvjw> implements dssk {
    public static final dvkb b;
    private static volatile dssr<dvkb> d;
    public dvka a;
    private int c;

    static {
        dvkb dvkbVar = new dvkb();
        b = dvkbVar;
        dsqw.cc(dvkb.class, dvkbVar);
    }

    private dvkb() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"c", "a"});
            }
            if (i2 == 3) {
                return new dvkb();
            }
            if (i2 == 4) {
                return new dvjw();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dvkb> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dvkb.class) {
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
