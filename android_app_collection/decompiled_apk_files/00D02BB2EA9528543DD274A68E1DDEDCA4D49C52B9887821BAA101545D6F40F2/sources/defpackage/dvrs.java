package defpackage;
/* compiled from: PG */
/* renamed from: dvrs  reason: default package */
/* loaded from: classes6.dex */
public final class dvrs extends dsqw<dvrs, dvrp> implements dssk {
    public static final dvrs c;
    private static volatile dssr<dvrs> d;
    public int a;
    public dvrr b;

    static {
        dvrs dvrsVar = new dvrs();
        c = dvrsVar;
        dsqw.cc(dvrs.class, dvrsVar);
    }

    private dvrs() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"a", "b"});
            }
            if (i2 == 3) {
                return new dvrs();
            }
            if (i2 == 4) {
                return new dvrp();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dvrs> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dvrs.class) {
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
