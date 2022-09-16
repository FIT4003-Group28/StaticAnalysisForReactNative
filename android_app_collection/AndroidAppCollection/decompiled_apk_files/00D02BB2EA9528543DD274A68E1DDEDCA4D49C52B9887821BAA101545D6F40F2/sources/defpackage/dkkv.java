package defpackage;
/* compiled from: PG */
/* renamed from: dkkv  reason: default package */
/* loaded from: classes6.dex */
public final class dkkv extends dsqw<dkkv, dkku> implements dssk {
    public static final dkkv a;
    private static volatile dssr<dkkv> b;

    static {
        dkkv dkkvVar = new dkkv();
        a = dkkvVar;
        dsqw.cc(dkkv.class, dkkvVar);
    }

    private dkkv() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(a, "\u0001\u0000", null);
            }
            if (i2 == 3) {
                return new dkkv();
            }
            if (i2 == 4) {
                return new dkku();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dkkv> dssrVar = b;
            if (dssrVar == null) {
                synchronized (dkkv.class) {
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
