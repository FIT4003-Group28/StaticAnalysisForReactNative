package defpackage;
/* compiled from: PG */
/* renamed from: ddpv  reason: default package */
/* loaded from: classes6.dex */
public final class ddpv extends dsqw<ddpv, ddpu> implements dssk {
    public static final ddpv a;
    private static volatile dssr<ddpv> b;

    static {
        ddpv ddpvVar = new ddpv();
        a = ddpvVar;
        dsqw.cc(ddpv.class, ddpvVar);
    }

    private ddpv() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(a, "\u0001\u0000", null);
            }
            if (i2 == 3) {
                return new ddpv();
            }
            if (i2 == 4) {
                return new ddpu();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<ddpv> dssrVar = b;
            if (dssrVar == null) {
                synchronized (ddpv.class) {
                    dssrVar = b;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(a);
                        b = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
