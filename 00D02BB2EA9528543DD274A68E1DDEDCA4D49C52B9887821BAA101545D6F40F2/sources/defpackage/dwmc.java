package defpackage;
/* compiled from: PG */
/* renamed from: dwmc  reason: default package */
/* loaded from: classes6.dex */
public final class dwmc extends dsqw<dwmc, dwmb> implements dssk {
    public static final dwmc a;
    private static volatile dssr<dwmc> b;

    static {
        dwmc dwmcVar = new dwmc();
        a = dwmcVar;
        dsqw.cc(dwmc.class, dwmcVar);
    }

    private dwmc() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(a, "\u0001\u0000", null);
            }
            if (i2 == 3) {
                return new dwmc();
            }
            if (i2 == 4) {
                return new dwmb();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dwmc> dssrVar = b;
            if (dssrVar == null) {
                synchronized (dwmc.class) {
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