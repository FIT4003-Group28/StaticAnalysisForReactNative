package defpackage;
/* compiled from: PG */
/* renamed from: ddms  reason: default package */
/* loaded from: classes6.dex */
public final class ddms extends dsqw<ddms, ddmr> implements dssk {
    public static final ddms e;
    private static volatile dssr<ddms> f;
    public int a;
    public String b = "";
    public String c = "";
    public String d = "";

    static {
        ddms ddmsVar = new ddms();
        e = ddmsVar;
        dsqw.cc(ddms.class, ddmsVar);
    }

    private ddms() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002", new Object[]{"a", "b", "c", "d"});
            }
            if (i2 == 3) {
                return new ddms();
            }
            if (i2 == 4) {
                return new ddmr();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<ddms> dssrVar = f;
            if (dssrVar == null) {
                synchronized (ddms.class) {
                    dssrVar = f;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(e);
                        f = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
