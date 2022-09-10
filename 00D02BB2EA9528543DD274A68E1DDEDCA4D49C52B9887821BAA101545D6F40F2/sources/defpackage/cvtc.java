package defpackage;
/* compiled from: PG */
/* renamed from: cvtc  reason: default package */
/* loaded from: classes5.dex */
public final class cvtc extends dsqw<cvtc, cvtb> implements dssk {
    public static final cvtc b;
    private static volatile dssr<cvtc> c;
    public dsrj<dsok> a = dssu.b;

    static {
        cvtc cvtcVar = new cvtc();
        b = cvtcVar;
        dsqw.cc(cvtc.class, cvtcVar);
    }

    private cvtc() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", dsok.class});
            }
            if (i2 == 3) {
                return new cvtc();
            }
            if (i2 == 4) {
                return new cvtb();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<cvtc> dssrVar = c;
            if (dssrVar == null) {
                synchronized (cvtc.class) {
                    dssrVar = c;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(b);
                        c = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
