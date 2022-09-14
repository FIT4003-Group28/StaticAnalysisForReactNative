package defpackage;
/* compiled from: PG */
/* renamed from: dxmc  reason: default package */
/* loaded from: classes6.dex */
public final class dxmc extends dsqw<dxmc, dxmb> implements dssk {
    public static final dxmc b;
    private static volatile dssr<dxmc> c;
    public String a = "";

    static {
        dxmc dxmcVar = new dxmc();
        b = dxmcVar;
        dsqw.cc(dxmc.class, dxmcVar);
    }

    private dxmc() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"a"});
            }
            if (i2 == 3) {
                return new dxmc();
            }
            if (i2 == 4) {
                return new dxmb();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dxmc> dssrVar = c;
            if (dssrVar == null) {
                synchronized (dxmc.class) {
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
