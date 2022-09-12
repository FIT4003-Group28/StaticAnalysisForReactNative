package defpackage;
/* compiled from: PG */
/* renamed from: dxdi  reason: default package */
/* loaded from: classes6.dex */
public final class dxdi extends dsqw<dxdi, dxdf> implements dssk {
    public static final dxdi b;
    private static volatile dssr<dxdi> c;
    public dsrf a;

    static {
        dxdi dxdiVar = new dxdi();
        b = dxdiVar;
        dsqw.cc(dxdi.class, dxdiVar);
    }

    private dxdi() {
        dsqz dsqzVar = dsqz.b;
        this.a = dsqz.b;
        dssu<Object> dssuVar = dssu.b;
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0000", null);
            }
            if (i2 == 3) {
                return new dxdi();
            }
            if (i2 == 4) {
                return new dxdf();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dxdi> dssrVar = c;
            if (dssrVar == null) {
                synchronized (dxdi.class) {
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
