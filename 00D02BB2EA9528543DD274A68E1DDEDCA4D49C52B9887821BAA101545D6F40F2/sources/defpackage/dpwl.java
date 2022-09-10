package defpackage;
/* compiled from: PG */
/* renamed from: dpwl  reason: default package */
/* loaded from: classes6.dex */
public final class dpwl extends dsqw<dpwl, dpwi> implements dssk {
    public static final dpwl d;
    private static volatile dssr<dpwl> f;
    public String a = "";
    public dsrj<dpwk> b = dssu.b;
    public boolean c;
    private int e;

    static {
        dpwl dpwlVar = new dpwl();
        d = dpwlVar;
        dsqw.cc(dpwl.class, dpwlVar);
    }

    private dpwl() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b\u0003ဇ\u0001", new Object[]{"e", "a", "b", dpwk.class, "c"});
            }
            if (i2 == 3) {
                return new dpwl();
            }
            if (i2 == 4) {
                return new dpwi();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dpwl> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dpwl.class) {
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
