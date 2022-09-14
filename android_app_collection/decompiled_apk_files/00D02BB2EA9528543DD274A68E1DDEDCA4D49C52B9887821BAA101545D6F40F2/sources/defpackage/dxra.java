package defpackage;
/* compiled from: PG */
/* renamed from: dxra  reason: default package */
/* loaded from: classes6.dex */
public final class dxra extends dsqw<dxra, dxqz> implements dssk {
    public static final dxra b;
    private static volatile dssr<dxra> c;
    public dsrj<dxsa> a = dssu.b;

    static {
        dxra dxraVar = new dxra();
        b = dxraVar;
        dsqw.cc(dxra.class, dxraVar);
    }

    private dxra() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", dxsa.class});
            }
            if (i2 == 3) {
                return new dxra();
            }
            if (i2 == 4) {
                return new dxqz();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dxra> dssrVar = c;
            if (dssrVar == null) {
                synchronized (dxra.class) {
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
