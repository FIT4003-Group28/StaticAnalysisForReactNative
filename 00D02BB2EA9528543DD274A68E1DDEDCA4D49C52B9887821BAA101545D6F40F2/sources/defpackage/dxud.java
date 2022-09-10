package defpackage;
/* compiled from: PG */
/* renamed from: dxud  reason: default package */
/* loaded from: classes6.dex */
public final class dxud extends dsqw<dxud, dxuc> implements dssk {
    public static final dxud b;
    private static volatile dssr<dxud> c;
    public dxwi a;

    static {
        dxud dxudVar = new dxud();
        b = dxudVar;
        dsqw.cc(dxud.class, dxudVar);
    }

    private dxud() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\t", new Object[]{"a"});
            }
            if (i2 == 3) {
                return new dxud();
            }
            if (i2 == 4) {
                return new dxuc();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dxud> dssrVar = c;
            if (dssrVar == null) {
                synchronized (dxud.class) {
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
