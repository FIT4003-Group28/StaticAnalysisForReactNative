package defpackage;
/* compiled from: PG */
/* renamed from: ddcy  reason: default package */
/* loaded from: classes5.dex */
public final class ddcy extends dsqw<ddcy, ddcx> implements dssk {
    public static final ddcy d;
    private static volatile dssr<ddcy> e;
    public int a;
    public int b;
    public String c = "";

    static {
        ddcy ddcyVar = new ddcy();
        d = ddcyVar;
        dsqw.cc(ddcy.class, ddcyVar);
    }

    private ddcy() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဈ\u0001", new Object[]{"a", "b", dfwn.c(), "c"});
            }
            if (i2 == 3) {
                return new ddcy();
            }
            if (i2 == 4) {
                return new ddcx();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<ddcy> dssrVar = e;
            if (dssrVar == null) {
                synchronized (ddcy.class) {
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
