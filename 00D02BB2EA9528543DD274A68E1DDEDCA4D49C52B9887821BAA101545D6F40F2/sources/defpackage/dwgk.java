package defpackage;
/* compiled from: PG */
/* renamed from: dwgk  reason: default package */
/* loaded from: classes6.dex */
public final class dwgk extends dsqw<dwgk, dwgj> implements dssk {
    public static final dwgk b;
    private static volatile dssr<dwgk> d;
    public dspd a = dspd.b;
    private int c;

    static {
        dwgk dwgkVar = new dwgk();
        b = dwgkVar;
        dsqw.cc(dwgk.class, dwgkVar);
    }

    private dwgk() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ည\u0000", new Object[]{"c", "a"});
            }
            if (i2 == 3) {
                return new dwgk();
            }
            if (i2 == 4) {
                return new dwgj();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dwgk> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dwgk.class) {
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
