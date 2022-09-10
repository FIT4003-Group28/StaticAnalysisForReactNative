package defpackage;
/* compiled from: PG */
/* renamed from: dtmn  reason: default package */
/* loaded from: classes6.dex */
public final class dtmn extends dsqw<dtmn, dtmm> implements dssk {
    public static final dtmn b;
    private static volatile dssr<dtmn> d;
    public int a;
    private int c;

    static {
        dtmn dtmnVar = new dtmn();
        b = dtmnVar;
        dsqw.cc(dtmn.class, dtmnVar);
    }

    private dtmn() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"c", "a", dtml.c()});
            }
            if (i2 == 3) {
                return new dtmn();
            }
            if (i2 == 4) {
                return new dtmm();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dtmn> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dtmn.class) {
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
