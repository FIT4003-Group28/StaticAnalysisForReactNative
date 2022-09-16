package defpackage;
/* compiled from: PG */
/* renamed from: dwmi  reason: default package */
/* loaded from: classes6.dex */
public final class dwmi extends dsqw<dwmi, dwmh> implements dssk {
    public static final dwmi a;
    private static volatile dssr<dwmi> b;

    static {
        dwmi dwmiVar = new dwmi();
        a = dwmiVar;
        dsqw.cc(dwmi.class, dwmiVar);
    }

    private dwmi() {
        dssu<Object> dssuVar = dssu.b;
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(a, "\u0001\u0000", null);
            }
            if (i2 == 3) {
                return new dwmi();
            }
            if (i2 == 4) {
                return new dwmh();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dwmi> dssrVar = b;
            if (dssrVar == null) {
                synchronized (dwmi.class) {
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
