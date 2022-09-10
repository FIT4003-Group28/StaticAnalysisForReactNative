package defpackage;
/* compiled from: PG */
/* renamed from: dwpv  reason: default package */
/* loaded from: classes6.dex */
public final class dwpv extends dsqw<dwpv, dwpu> implements dssk {
    public static final dwpv b;
    private static volatile dssr<dwpv> d;
    public dspd a = dspd.b;
    private int c;

    static {
        dwpv dwpvVar = new dwpv();
        b = dwpvVar;
        dsqw.cc(dwpv.class, dwpvVar);
    }

    private dwpv() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ည\u0000", new Object[]{"c", "a"});
            }
            if (i2 == 3) {
                return new dwpv();
            }
            if (i2 == 4) {
                return new dwpu();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dwpv> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dwpv.class) {
                    dssrVar = d;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(b);
                        d = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
