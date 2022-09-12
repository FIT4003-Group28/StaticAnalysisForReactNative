package defpackage;
/* compiled from: PG */
/* renamed from: ddju  reason: default package */
/* loaded from: classes.dex */
public final class ddju extends dsqw<ddju, ddjt> implements dssk {
    public static final ddju d;
    private static volatile dssr<ddju> e;
    public int a;
    public String b = "";
    public String c = "";

    static {
        ddju ddjuVar = new ddju();
        d = ddjuVar;
        dsqw.cc(ddju.class, ddjuVar);
    }

    private ddju() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"a", "b", "c"});
            }
            if (i2 == 3) {
                return new ddju();
            }
            if (i2 == 4) {
                return new ddjt();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<ddju> dssrVar = e;
            if (dssrVar == null) {
                synchronized (ddju.class) {
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
