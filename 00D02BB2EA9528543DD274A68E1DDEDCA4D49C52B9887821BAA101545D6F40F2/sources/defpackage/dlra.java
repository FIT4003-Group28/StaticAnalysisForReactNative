package defpackage;
/* compiled from: PG */
/* renamed from: dlra  reason: default package */
/* loaded from: classes6.dex */
public final class dlra extends dsqw<dlra, dlqz> implements dssk {
    public static final dlra b;
    private static volatile dssr<dlra> d;
    public dspd a = dspd.b;
    private int c;

    static {
        dlra dlraVar = new dlra();
        b = dlraVar;
        dsqw.cc(dlra.class, dlraVar);
    }

    private dlra() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ည\u0000", new Object[]{"c", "a"});
            }
            if (i2 == 3) {
                return new dlra();
            }
            if (i2 == 4) {
                return new dlqz();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dlra> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dlra.class) {
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
