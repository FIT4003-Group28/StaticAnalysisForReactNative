package defpackage;
/* compiled from: PG */
/* renamed from: dlpx  reason: default package */
/* loaded from: classes6.dex */
public final class dlpx extends dsqw<dlpx, dlpw> implements dssk {
    public static final dlpx b;
    private static volatile dssr<dlpx> d;
    public String a = "";
    private int c;

    static {
        dlpx dlpxVar = new dlpx();
        b = dlpxVar;
        dsqw.cc(dlpx.class, dlpxVar);
    }

    private dlpx() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"c", "a"});
            }
            if (i2 == 3) {
                return new dlpx();
            }
            if (i2 == 4) {
                return new dlpw();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dlpx> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dlpx.class) {
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
