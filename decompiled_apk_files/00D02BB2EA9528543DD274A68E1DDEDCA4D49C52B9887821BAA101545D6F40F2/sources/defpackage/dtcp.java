package defpackage;
/* compiled from: PG */
/* renamed from: dtcp  reason: default package */
/* loaded from: classes6.dex */
public final class dtcp extends dsqw<dtcp, dtco> implements dssk {
    public static final dtcp c;
    private static volatile dssr<dtcp> d;
    public int a;
    public dspd b = dspd.b;

    static {
        dtcp dtcpVar = new dtcp();
        c = dtcpVar;
        dsqw.cc(dtcp.class, dtcpVar);
    }

    private dtcp() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ည\u0000", new Object[]{"a", "b"});
            }
            if (i2 == 3) {
                return new dtcp();
            }
            if (i2 == 4) {
                return new dtco();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dtcp> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dtcp.class) {
                    dssrVar = d;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(c);
                        d = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
