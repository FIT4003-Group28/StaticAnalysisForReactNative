package defpackage;
/* compiled from: PG */
/* renamed from: dxsm  reason: default package */
/* loaded from: classes6.dex */
public final class dxsm extends dsqw<dxsm, dxsl> implements dssk {
    public static final dxsm b;
    private static volatile dssr<dxsm> c;
    public dsrj<dxse> a = dssu.b;

    static {
        dxsm dxsmVar = new dxsm();
        b = dxsmVar;
        dsqw.cc(dxsm.class, dxsmVar);
    }

    private dxsm() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", dxse.class});
            }
            if (i2 == 3) {
                return new dxsm();
            }
            if (i2 == 4) {
                return new dxsl();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dxsm> dssrVar = c;
            if (dssrVar == null) {
                synchronized (dxsm.class) {
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
