package defpackage;
/* compiled from: PG */
/* renamed from: dwak  reason: default package */
/* loaded from: classes6.dex */
public final class dwak extends dsqw<dwak, dwah> implements dssk {
    public static final dwak b;
    private static volatile dssr<dwak> d;
    public int a;
    private int c;

    static {
        dwak dwakVar = new dwak();
        b = dwakVar;
        dsqw.cc(dwak.class, dwakVar);
    }

    private dwak() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"c", "a", dwai.a});
            }
            if (i2 == 3) {
                return new dwak();
            }
            if (i2 == 4) {
                return new dwah();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dwak> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dwak.class) {
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
