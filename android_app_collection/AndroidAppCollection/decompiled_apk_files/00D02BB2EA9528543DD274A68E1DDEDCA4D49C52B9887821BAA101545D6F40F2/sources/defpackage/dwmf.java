package defpackage;
/* compiled from: PG */
/* renamed from: dwmf  reason: default package */
/* loaded from: classes6.dex */
public final class dwmf extends dsqw<dwmf, dwme> implements dssk {
    public static final dwmf d;
    private static volatile dssr<dwmf> f;
    public dwfl a;
    public int b;
    public dpno c;
    private int e;

    static {
        dwmf dwmfVar = new dwmf();
        d = dwmfVar;
        dsqw.cc(dwmf.class, dwmfVar);
    }

    private dwmf() {
        dssu<Object> dssuVar = dssu.b;
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0003\u0000\u0001\u0001\u0005\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဌ\u0001\u0005ဉ\u0003", new Object[]{"e", "a", "b", dgfb.c(), "c"});
            }
            if (i2 == 3) {
                return new dwmf();
            }
            if (i2 == 4) {
                return new dwme();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dwmf> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dwmf.class) {
                    dssrVar = f;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(d);
                        f = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
