package defpackage;
/* compiled from: PG */
/* renamed from: dhvy  reason: default package */
/* loaded from: classes6.dex */
public final class dhvy extends dsqw<dhvy, dhvx> implements dssk {
    public static final dhvy a;
    private static volatile dssr<dhvy> b;

    static {
        dhvy dhvyVar = new dhvy();
        a = dhvyVar;
        dsqw.cc(dhvy.class, dhvyVar);
    }

    private dhvy() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(a, "\u0001\u0000", null);
            }
            if (i2 == 3) {
                return new dhvy();
            }
            if (i2 == 4) {
                return new dhvx();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dhvy> dssrVar = b;
            if (dssrVar == null) {
                synchronized (dhvy.class) {
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
