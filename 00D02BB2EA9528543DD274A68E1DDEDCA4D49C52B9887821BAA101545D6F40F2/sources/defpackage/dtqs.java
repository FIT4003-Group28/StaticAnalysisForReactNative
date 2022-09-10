package defpackage;
/* compiled from: PG */
/* renamed from: dtqs  reason: default package */
/* loaded from: classes6.dex */
public final class dtqs extends dsqw<dtqs, dtqr> implements dssk {
    public static final dtqs a;
    private static volatile dssr<dtqs> b;

    static {
        dtqs dtqsVar = new dtqs();
        a = dtqsVar;
        dsqw.cc(dtqs.class, dtqsVar);
    }

    private dtqs() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(a, "\u0001\u0000", null);
            }
            if (i2 == 3) {
                return new dtqs();
            }
            if (i2 == 4) {
                return new dtqr();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dtqs> dssrVar = b;
            if (dssrVar == null) {
                synchronized (dtqs.class) {
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
