package defpackage;
/* compiled from: PG */
/* renamed from: dnrb  reason: default package */
/* loaded from: classes6.dex */
public final class dnrb extends dsqw<dnrb, dnra> implements dssk {
    public static final dnrb a;
    private static volatile dssr<dnrb> b;

    static {
        dnrb dnrbVar = new dnrb();
        a = dnrbVar;
        dsqw.cc(dnrb.class, dnrbVar);
    }

    private dnrb() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(a, "\u0001\u0000", null);
            }
            if (i2 == 3) {
                return new dnrb();
            }
            if (i2 == 4) {
                return new dnra();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dnrb> dssrVar = b;
            if (dssrVar == null) {
                synchronized (dnrb.class) {
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
