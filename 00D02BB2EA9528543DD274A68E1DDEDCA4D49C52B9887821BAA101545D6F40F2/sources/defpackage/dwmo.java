package defpackage;
/* compiled from: PG */
/* renamed from: dwmo  reason: default package */
/* loaded from: classes6.dex */
public final class dwmo extends dsqw<dwmo, dwmm> implements dssk {
    public static final dwmo c;
    private static volatile dssr<dwmo> d;
    public int a;
    public int b;

    static {
        dwmo dwmoVar = new dwmo();
        c = dwmoVar;
        dsqw.cc(dwmo.class, dwmoVar);
    }

    private dwmo() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"a", "b", dwmn.a});
            }
            if (i2 == 3) {
                return new dwmo();
            }
            if (i2 == 4) {
                return new dwmm();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dwmo> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dwmo.class) {
                    dssrVar = d;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(c);
                        d = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
