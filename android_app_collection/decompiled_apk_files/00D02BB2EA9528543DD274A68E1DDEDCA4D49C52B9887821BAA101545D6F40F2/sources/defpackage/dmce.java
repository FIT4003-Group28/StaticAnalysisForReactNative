package defpackage;
/* compiled from: PG */
/* renamed from: dmce  reason: default package */
/* loaded from: classes6.dex */
public final class dmce extends dsqw<dmce, dmcd> implements dssk {
    public static final dmce d;
    private static volatile dssr<dmce> e;
    public int a;
    public drfu b;
    public String c = "";

    static {
        dmce dmceVar = new dmce();
        d = dmceVar;
        dsqw.cc(dmce.class, dmceVar);
    }

    private dmce() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဈ\u0001", new Object[]{"a", "b", "c"});
            }
            if (i2 == 3) {
                return new dmce();
            }
            if (i2 == 4) {
                return new dmcd();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dmce> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dmce.class) {
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
