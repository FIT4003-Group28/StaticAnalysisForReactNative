package defpackage;
/* compiled from: PG */
/* renamed from: ddpz  reason: default package */
/* loaded from: classes6.dex */
public final class ddpz extends dsqw<ddpz, ddpn> implements dssk {
    public static final ddpz f;
    private static volatile dssr<ddpz> g;
    public int a;
    public Object c;
    public long e;
    public int b = 0;
    public String d = "";

    static {
        ddpz ddpzVar = new ddpz();
        f = ddpzVar;
        dsqw.cc(ddpz.class, ddpzVar);
    }

    private ddpz() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(f, "\u0001\u0007\u0001\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဂ\u0001\u0003ြ\u0000\u0004ြ\u0000\u0005ြ\u0000\u0006ြ\u0000\u0007ြ\u0000", new Object[]{"c", "b", "a", "d", "e", ddpv.class, ddpp.class, ddpr.class, ddpt.class, ddpy.class});
            }
            if (i2 == 3) {
                return new ddpz();
            }
            if (i2 == 4) {
                return new ddpn();
            }
            if (i2 == 5) {
                return f;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<ddpz> dssrVar = g;
            if (dssrVar == null) {
                synchronized (ddpz.class) {
                    dssrVar = g;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(f);
                        g = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
