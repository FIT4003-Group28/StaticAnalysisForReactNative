package defpackage;
/* compiled from: PG */
/* renamed from: amyv  reason: default package */
/* loaded from: classes.dex */
public final class amyv extends dsqw<amyv, amyu> implements dssk {
    public static final amyv d;
    private static volatile dssr<amyv> e;
    public int a;
    public int b = 1;
    public String c = "";

    static {
        amyv amyvVar = new amyv();
        d = amyvVar;
        dsqw.cc(amyv.class, amyvVar);
    }

    private amyv() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဈ\u0001", new Object[]{"a", "b", amyy.a, "c"});
            }
            if (i2 == 3) {
                return new amyv();
            }
            if (i2 == 4) {
                return new amyu();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<amyv> dssrVar = e;
            if (dssrVar == null) {
                synchronized (amyv.class) {
                    dssrVar = e;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(d);
                        e = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
