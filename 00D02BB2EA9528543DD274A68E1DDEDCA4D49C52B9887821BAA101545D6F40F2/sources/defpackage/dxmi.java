package defpackage;
/* compiled from: PG */
/* renamed from: dxmi  reason: default package */
/* loaded from: classes6.dex */
public final class dxmi extends dsqw<dxmi, dxmh> implements dssk {
    public static final dxmi a;
    private static volatile dssr<dxmi> b;

    static {
        dxmi dxmiVar = new dxmi();
        a = dxmiVar;
        dsqw.cc(dxmi.class, dxmiVar);
    }

    private dxmi() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(a, "\u0000\u0000", null);
            }
            if (i2 == 3) {
                return new dxmi();
            }
            if (i2 == 4) {
                return new dxmh();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dxmi> dssrVar = b;
            if (dssrVar == null) {
                synchronized (dxmi.class) {
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
