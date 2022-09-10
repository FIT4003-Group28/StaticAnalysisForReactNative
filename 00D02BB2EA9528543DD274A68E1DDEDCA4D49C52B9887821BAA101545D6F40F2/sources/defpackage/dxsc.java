package defpackage;
/* compiled from: PG */
/* renamed from: dxsc  reason: default package */
/* loaded from: classes6.dex */
public final class dxsc extends dsqw<dxsc, dxsb> implements dssk {
    public static final dxsc a;
    private static volatile dssr<dxsc> b;

    static {
        dxsc dxscVar = new dxsc();
        a = dxscVar;
        dsqw.cc(dxsc.class, dxscVar);
    }

    private dxsc() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(a, "\u0000\u0000", null);
            }
            if (i2 == 3) {
                return new dxsc();
            }
            if (i2 == 4) {
                return new dxsb();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dxsc> dssrVar = b;
            if (dssrVar == null) {
                synchronized (dxsc.class) {
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
