package defpackage;
/* compiled from: PG */
/* renamed from: dkpr  reason: default package */
/* loaded from: classes6.dex */
public final class dkpr extends dsqw<dkpr, dkpq> implements dssk {
    public static final dkpr b;
    private static volatile dssr<dkpr> d;
    public String a = "";
    private int c;

    static {
        dkpr dkprVar = new dkpr();
        b = dkprVar;
        dsqw.cc(dkpr.class, dkprVar);
    }

    private dkpr() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"c", "a"});
            }
            if (i2 == 3) {
                return new dkpr();
            }
            if (i2 == 4) {
                return new dkpq();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dkpr> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dkpr.class) {
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
