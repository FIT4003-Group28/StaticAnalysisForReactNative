package defpackage;
/* compiled from: PG */
/* renamed from: dxld  reason: default package */
/* loaded from: classes6.dex */
public final class dxld extends dsqw<dxld, dxlb> implements dssk {
    public static final dxld a;
    private static volatile dssr<dxld> c;
    private dssd<String, String> b = dssd.b;

    static {
        dxld dxldVar = new dxld();
        a = dxldVar;
        dsqw.cc(dxld.class, dxldVar);
    }

    private dxld() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(a, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"b", dxlc.a});
            }
            if (i2 == 3) {
                return new dxld();
            }
            if (i2 == 4) {
                return new dxlb();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dxld> dssrVar = c;
            if (dssrVar == null) {
                synchronized (dxld.class) {
                    dssrVar = c;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(a);
                        c = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
