package defpackage;
/* compiled from: PG */
/* renamed from: dxwy  reason: default package */
/* loaded from: classes6.dex */
public final class dxwy extends dsqw<dxwy, dxwx> implements dssk {
    public static final dxwy b;
    private static volatile dssr<dxwy> c;
    public dxvs a;

    static {
        dxwy dxwyVar = new dxwy();
        b = dxwyVar;
        dsqw.cc(dxwy.class, dxwyVar);
    }

    private dxwy() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\t", new Object[]{"a"});
            }
            if (i2 == 3) {
                return new dxwy();
            }
            if (i2 == 4) {
                return new dxwx();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dxwy> dssrVar = c;
            if (dssrVar == null) {
                synchronized (dxwy.class) {
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
