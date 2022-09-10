package defpackage;
/* compiled from: PG */
/* renamed from: dryp  reason: default package */
/* loaded from: classes6.dex */
public final class dryp extends dsqw<dryp, dryo> implements dssk {
    public static final dryp a;
    private static volatile dssr<dryp> b;

    static {
        dryp drypVar = new dryp();
        a = drypVar;
        dsqw.cc(dryp.class, drypVar);
    }

    private dryp() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(a, "\u0001\u0000", null);
            }
            if (i2 == 3) {
                return new dryp();
            }
            if (i2 == 4) {
                return new dryo();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dryp> dssrVar = b;
            if (dssrVar == null) {
                synchronized (dryp.class) {
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
