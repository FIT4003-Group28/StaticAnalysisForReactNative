package defpackage;
/* compiled from: PG */
/* renamed from: akpu  reason: default package */
/* loaded from: classes2.dex */
public final class akpu extends dsqw<akpu, akpt> implements dssk {
    public static final akpu e;
    private static volatile dssr<akpu> g;
    public long b;
    private int f;
    public dspd a = dspd.b;
    public String c = "";
    public String d = "";

    static {
        akpu akpuVar = new akpu();
        e = akpuVar;
        dsqw.cc(akpu.class, akpuVar);
    }

    private akpu() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(e, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ည\u0000\u0002ဂ\u0001\u0003ဈ\u0002\u0004ဈ\u0003", new Object[]{"f", "a", "b", "c", "d"});
            }
            if (i2 == 3) {
                return new akpu();
            }
            if (i2 == 4) {
                return new akpt();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<akpu> dssrVar = g;
            if (dssrVar == null) {
                synchronized (akpu.class) {
                    dssrVar = g;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(e);
                        g = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
