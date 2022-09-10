package defpackage;
/* compiled from: PG */
/* renamed from: dvsu  reason: default package */
/* loaded from: classes.dex */
public final class dvsu extends dsqw<dvsu, dvst> implements dssk {
    public static final dvsu d;
    private static volatile dssr<dvsu> f;
    public String a = "";
    public String b = "https://geo0.ggpht.com/cbk";
    public String c = "https://support.google.com/legal/troubleshooter/1114905?rd=1#ts=1115658,1115689,2364966";
    private int e;

    static {
        dvsu dvsuVar = new dvsu();
        d = dvsuVar;
        dsqw.cc(dvsu.class, dvsuVar);
    }

    private dvsu() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0003\u0000\u0001\u0002\t\u0003\u0000\u0000\u0000\u0002ဈ\u0001\u0003ဈ\u0002\tဈ\b", new Object[]{"e", "a", "b", "c"});
            }
            if (i2 == 3) {
                return new dvsu();
            }
            if (i2 == 4) {
                return new dvst();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dvsu> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dvsu.class) {
                    dssrVar = f;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(d);
                        f = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
