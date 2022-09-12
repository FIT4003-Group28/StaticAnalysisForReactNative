package defpackage;
/* compiled from: PG */
/* renamed from: dspv  reason: default package */
/* loaded from: classes6.dex */
public final class dspv extends dsqw<dspv, dspu> implements dssk {
    public static final dspv a;
    private static volatile dssr<dspv> b;

    static {
        dspv dspvVar = new dspv();
        a = dspvVar;
        dsqw.cc(dspv.class, dspvVar);
    }

    private dspv() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(a, "\u0000\u0000", null);
            }
            if (i2 == 3) {
                return new dspv();
            }
            if (i2 == 4) {
                return new dspu();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dspv> dssrVar = b;
            if (dssrVar == null) {
                synchronized (dspv.class) {
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
