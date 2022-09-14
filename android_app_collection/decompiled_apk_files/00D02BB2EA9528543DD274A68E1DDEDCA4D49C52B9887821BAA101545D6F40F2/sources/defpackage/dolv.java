package defpackage;
/* compiled from: PG */
/* renamed from: dolv  reason: default package */
/* loaded from: classes6.dex */
public final class dolv extends dsqw<dolv, dolu> implements dssk {
    public static final dolv a;
    private static volatile dssr<dolv> b;

    static {
        dolv dolvVar = new dolv();
        a = dolvVar;
        dsqw.cc(dolv.class, dolvVar);
    }

    private dolv() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(a, "\u0001\u0000", null);
            }
            if (i2 == 3) {
                return new dolv();
            }
            if (i2 == 4) {
                return new dolu();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dolv> dssrVar = b;
            if (dssrVar == null) {
                synchronized (dolv.class) {
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
