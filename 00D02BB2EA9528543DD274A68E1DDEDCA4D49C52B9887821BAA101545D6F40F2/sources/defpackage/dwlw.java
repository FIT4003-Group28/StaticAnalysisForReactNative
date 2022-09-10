package defpackage;
/* compiled from: PG */
/* renamed from: dwlw  reason: default package */
/* loaded from: classes6.dex */
public final class dwlw extends dsqw<dwlw, dwlv> implements dssk {
    public static final dwlw b;
    private static volatile dssr<dwlw> d;
    public dspd a = dspd.b;
    private int c;

    static {
        dwlw dwlwVar = new dwlw();
        b = dwlwVar;
        dsqw.cc(dwlw.class, dwlwVar);
    }

    private dwlw() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ည\u0000", new Object[]{"c", "a"});
            }
            if (i2 == 3) {
                return new dwlw();
            }
            if (i2 == 4) {
                return new dwlv();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dwlw> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dwlw.class) {
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
