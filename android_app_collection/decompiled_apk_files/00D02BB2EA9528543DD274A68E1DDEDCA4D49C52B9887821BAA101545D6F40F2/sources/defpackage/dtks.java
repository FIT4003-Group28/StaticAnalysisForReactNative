package defpackage;
/* compiled from: PG */
/* renamed from: dtks  reason: default package */
/* loaded from: classes6.dex */
public final class dtks extends dsqw<dtks, dtkr> implements dssk {
    public static final dtks b;
    private static volatile dssr<dtks> d;
    public dplx a;
    private int c;

    static {
        dtks dtksVar = new dtks();
        b = dtksVar;
        dsqw.cc(dtks.class, dtksVar);
    }

    private dtks() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"c", "a"});
            }
            if (i2 == 3) {
                return new dtks();
            }
            if (i2 == 4) {
                return new dtkr();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dtks> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dtks.class) {
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
