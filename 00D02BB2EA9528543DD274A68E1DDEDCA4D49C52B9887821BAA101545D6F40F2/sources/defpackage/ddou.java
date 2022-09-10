package defpackage;
/* compiled from: PG */
/* renamed from: ddou  reason: default package */
/* loaded from: classes.dex */
public final class ddou extends dsqw<ddou, ddop> implements dssk {
    public static final ddou b;
    private static volatile dssr<ddou> c;
    public dsrj<ddot> a = dssu.b;

    static {
        ddou ddouVar = new ddou();
        b = ddouVar;
        dsqw.cc(ddou.class, ddouVar);
    }

    private ddou() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", ddot.class});
            }
            if (i2 == 3) {
                return new ddou();
            }
            if (i2 == 4) {
                return new ddop();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<ddou> dssrVar = c;
            if (dssrVar == null) {
                synchronized (ddou.class) {
                    dssrVar = c;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(b);
                        c = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
