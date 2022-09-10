package defpackage;
/* compiled from: PG */
/* renamed from: dtmv  reason: default package */
/* loaded from: classes6.dex */
public final class dtmv extends dsqw<dtmv, dtms> implements dssk {
    public static final dtmv b;
    private static volatile dssr<dtmv> d;
    public int a;
    private int c;

    static {
        dtmv dtmvVar = new dtmv();
        b = dtmvVar;
        dsqw.cc(dtmv.class, dtmvVar);
    }

    private dtmv() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"c", "a", dtmt.a});
            }
            if (i2 == 3) {
                return new dtmv();
            }
            if (i2 == 4) {
                return new dtms();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dtmv> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dtmv.class) {
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
