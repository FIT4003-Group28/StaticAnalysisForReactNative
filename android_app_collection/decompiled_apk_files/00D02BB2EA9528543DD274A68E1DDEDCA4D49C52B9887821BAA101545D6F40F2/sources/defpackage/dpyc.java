package defpackage;
/* compiled from: PG */
/* renamed from: dpyc  reason: default package */
/* loaded from: classes6.dex */
public final class dpyc extends dsqw<dpyc, dpyb> implements dssk {
    public static final dpyc d;
    private static volatile dssr<dpyc> f;
    public String a = "";
    public long b;
    public int c;
    private int e;

    static {
        dpyc dpycVar = new dpyc();
        d = dpycVar;
        dsqw.cc(dpyc.class, dpycVar);
    }

    private dpyc() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဂ\u0001\u0003င\u0002", new Object[]{"e", "a", "b", "c"});
            }
            if (i2 == 3) {
                return new dpyc();
            }
            if (i2 == 4) {
                return new dpyb();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dpyc> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dpyc.class) {
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
