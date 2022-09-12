package defpackage;
/* compiled from: PG */
/* renamed from: dtrs  reason: default package */
/* loaded from: classes6.dex */
public final class dtrs extends dsqw<dtrs, dtrr> implements dssk {
    public static final dtrs a;
    private static volatile dssr<dtrs> b;

    static {
        dtrs dtrsVar = new dtrs();
        a = dtrsVar;
        dsqw.cc(dtrs.class, dtrsVar);
    }

    private dtrs() {
        dssu<Object> dssuVar = dssu.b;
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(a, "\u0001\u0000", null);
            }
            if (i2 == 3) {
                return new dtrs();
            }
            if (i2 == 4) {
                return new dtrr();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dtrs> dssrVar = b;
            if (dssrVar == null) {
                synchronized (dtrs.class) {
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
