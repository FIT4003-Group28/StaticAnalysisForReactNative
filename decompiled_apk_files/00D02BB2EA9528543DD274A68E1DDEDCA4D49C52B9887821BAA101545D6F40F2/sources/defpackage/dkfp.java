package defpackage;
/* compiled from: PG */
/* renamed from: dkfp  reason: default package */
/* loaded from: classes6.dex */
public final class dkfp extends dsqw<dkfp, dkfo> implements dssk {
    public static final dkfp a;
    private static volatile dssr<dkfp> b;

    static {
        dkfp dkfpVar = new dkfp();
        a = dkfpVar;
        dsqw.cc(dkfp.class, dkfpVar);
    }

    private dkfp() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(a, "\u0001\u0000", null);
            }
            if (i2 == 3) {
                return new dkfp();
            }
            if (i2 == 4) {
                return new dkfo();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dkfp> dssrVar = b;
            if (dssrVar == null) {
                synchronized (dkfp.class) {
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
