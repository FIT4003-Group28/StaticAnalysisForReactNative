package defpackage;
/* compiled from: PG */
/* renamed from: vwg  reason: default package */
/* loaded from: classes7.dex */
public final class vwg extends dsqw<vwg, vwb> implements dssk {
    public static final vwg d;
    private static volatile dssr<vwg> e;
    public int a;
    public int b;
    public int c;

    static {
        vwg vwgVar = new vwg();
        d = vwgVar;
        dsqw.cc(vwg.class, vwgVar);
    }

    private vwg() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001", new Object[]{"a", "b", vwe.a, "c", vwc.a});
            }
            if (i2 == 3) {
                return new vwg();
            }
            if (i2 == 4) {
                return new vwb();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<vwg> dssrVar = e;
            if (dssrVar == null) {
                synchronized (vwg.class) {
                    dssrVar = e;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(d);
                        e = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
