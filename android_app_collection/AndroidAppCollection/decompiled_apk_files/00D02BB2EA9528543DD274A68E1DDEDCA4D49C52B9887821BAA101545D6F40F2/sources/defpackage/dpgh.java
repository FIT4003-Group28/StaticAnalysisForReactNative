package defpackage;
/* compiled from: PG */
/* renamed from: dpgh  reason: default package */
/* loaded from: classes6.dex */
public final class dpgh extends dsqw<dpgh, dpgg> implements dssk {
    public static final dpgh j;
    private static volatile dssr<dpgh> k;
    public int a;
    public dnpq d;
    public dnpq e;
    public dnpq g;
    public dqdk h;
    public boolean i;
    public String b = "";
    public String c = "";
    public String f = "";

    static {
        dpgh dpghVar = new dpgh();
        j = dpghVar;
        dsqw.cc(dpgh.class, dpghVar);
    }

    private dpgh() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(j, "\u0001\b\u0000\u0001\u0001\f\b\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0005ဈ\u0004\bဉ\u0002\tဉ\u0003\nဉ\u0005\u000bဉ\u0006\fဇ\u0007", new Object[]{"a", "b", "c", "f", "d", "e", "g", "h", "i"});
            }
            if (i2 == 3) {
                return new dpgh();
            }
            if (i2 == 4) {
                return new dpgg();
            }
            if (i2 == 5) {
                return j;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dpgh> dssrVar = k;
            if (dssrVar == null) {
                synchronized (dpgh.class) {
                    dssrVar = k;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(j);
                        k = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
