package defpackage;
/* compiled from: PG */
/* renamed from: cvta  reason: default package */
/* loaded from: classes5.dex */
public final class cvta extends dsqw<cvta, cvsz> implements dssk {
    public static final cvta a;
    private static volatile dssr<cvta> b;

    static {
        cvta cvtaVar = new cvta();
        a = cvtaVar;
        dsqw.cc(cvta.class, cvtaVar);
    }

    private cvta() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(a, "\u0001\u0000", null);
            }
            if (i2 == 3) {
                return new cvta();
            }
            if (i2 == 4) {
                return new cvsz();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<cvta> dssrVar = b;
            if (dssrVar == null) {
                synchronized (cvta.class) {
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
