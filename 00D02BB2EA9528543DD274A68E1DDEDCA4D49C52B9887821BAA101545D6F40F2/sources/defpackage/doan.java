package defpackage;
/* compiled from: PG */
/* renamed from: doan  reason: default package */
/* loaded from: classes6.dex */
public final class doan extends dsqw<doan, doam> implements dssk {
    public static final doan a;
    private static volatile dssr<doan> b;

    static {
        doan doanVar = new doan();
        a = doanVar;
        dsqw.cc(doan.class, doanVar);
    }

    private doan() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(a, "\u0001\u0000", null);
            }
            if (i2 == 3) {
                return new doan();
            }
            if (i2 == 4) {
                return new doam();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<doan> dssrVar = b;
            if (dssrVar == null) {
                synchronized (doan.class) {
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
