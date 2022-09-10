package defpackage;
/* compiled from: PG */
/* renamed from: bmcp  reason: default package */
/* loaded from: classes3.dex */
public final class bmcp extends dsqw<bmcp, bmco> implements dssk {
    public static final bmcp b;
    private static volatile dssr<bmcp> c;
    public dsrj<dnfd> a = dssu.b;

    static {
        bmcp bmcpVar = new bmcp();
        b = bmcpVar;
        dsqw.cc(bmcp.class, bmcpVar);
    }

    private bmcp() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", dnfd.class});
            }
            if (i2 == 3) {
                return new bmcp();
            }
            if (i2 == 4) {
                return new bmco();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<bmcp> dssrVar = c;
            if (dssrVar == null) {
                synchronized (bmcp.class) {
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
