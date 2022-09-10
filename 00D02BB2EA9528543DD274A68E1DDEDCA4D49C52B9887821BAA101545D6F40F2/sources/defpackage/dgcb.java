package defpackage;
/* compiled from: PG */
/* renamed from: dgcb  reason: default package */
/* loaded from: classes6.dex */
public final class dgcb extends dsqw<dgcb, dgca> implements dssk {
    public static final dgcb b;
    private static volatile dssr<dgcb> d;
    public String a = "";
    private int c;

    static {
        dgcb dgcbVar = new dgcb();
        b = dgcbVar;
        dsqw.cc(dgcb.class, dgcbVar);
    }

    private dgcb() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"c", "a"});
            }
            if (i2 == 3) {
                return new dgcb();
            }
            if (i2 == 4) {
                return new dgca();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dgcb> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dgcb.class) {
                    dssrVar = d;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(b);
                        d = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
