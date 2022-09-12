package defpackage;
/* compiled from: PG */
/* renamed from: dxvg  reason: default package */
/* loaded from: classes6.dex */
public final class dxvg extends dsqw<dxvg, dxvf> implements dssk {
    public static final dxvg b;
    private static volatile dssr<dxvg> c;
    public dxwi a;

    static {
        dxvg dxvgVar = new dxvg();
        b = dxvgVar;
        dsqw.cc(dxvg.class, dxvgVar);
    }

    private dxvg() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\t", new Object[]{"a"});
            }
            if (i2 == 3) {
                return new dxvg();
            }
            if (i2 == 4) {
                return new dxvf();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dxvg> dssrVar = c;
            if (dssrVar == null) {
                synchronized (dxvg.class) {
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
