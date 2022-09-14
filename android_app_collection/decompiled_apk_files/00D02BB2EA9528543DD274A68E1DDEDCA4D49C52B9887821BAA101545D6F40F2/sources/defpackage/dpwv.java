package defpackage;
/* compiled from: PG */
/* renamed from: dpwv  reason: default package */
/* loaded from: classes.dex */
public final class dpwv extends dsqw<dpwv, dpwu> implements dssk {
    public static final dpwv d;
    private static volatile dssr<dpwv> e;
    public int a;
    public String b = "";
    public long c;

    static {
        dpwv dpwvVar = new dpwv();
        d = dpwvVar;
        dsqw.cc(dpwv.class, dpwvVar);
    }

    private dpwv() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002စ\u0001", new Object[]{"a", "b", "c"});
            }
            if (i2 == 3) {
                return new dpwv();
            }
            if (i2 == 4) {
                return new dpwu();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dpwv> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dpwv.class) {
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
