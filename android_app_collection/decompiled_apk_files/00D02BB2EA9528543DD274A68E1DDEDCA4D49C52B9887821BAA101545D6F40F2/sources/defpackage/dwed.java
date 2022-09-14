package defpackage;
/* compiled from: PG */
/* renamed from: dwed  reason: default package */
/* loaded from: classes.dex */
public final class dwed extends dsqw<dwed, dwec> implements dssk {
    public static final dwed b;
    private static volatile dssr<dwed> c;
    public dsrj<dwef> a = dssu.b;

    static {
        dwed dwedVar = new dwed();
        b = dwedVar;
        dsqw.cc(dwed.class, dwedVar);
    }

    private dwed() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", dwef.class});
            }
            if (i2 == 3) {
                return new dwed();
            }
            if (i2 == 4) {
                return new dwec();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dwed> dssrVar = c;
            if (dssrVar == null) {
                synchronized (dwed.class) {
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
