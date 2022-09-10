package defpackage;
/* compiled from: PG */
/* renamed from: drpv  reason: default package */
/* loaded from: classes6.dex */
public final class drpv extends dsqw<drpv, drpu> implements dssk {
    public static final drpv d;
    private static volatile dssr<drpv> e;
    public int a;
    public String b = "";
    public String c = "";

    static {
        drpv drpvVar = new drpv();
        d = drpvVar;
        dsqw.cc(drpv.class, drpvVar);
    }

    private drpv() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"a", "b", "c"});
            }
            if (i2 == 3) {
                return new drpv();
            }
            if (i2 == 4) {
                return new drpu();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<drpv> dssrVar = e;
            if (dssrVar == null) {
                synchronized (drpv.class) {
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
