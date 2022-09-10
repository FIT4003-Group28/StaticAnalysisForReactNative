package defpackage;
/* compiled from: PG */
/* renamed from: dxlh  reason: default package */
/* loaded from: classes6.dex */
public final class dxlh extends dsqw<dxlh, dxlg> implements dssk {
    public static final dxlh b;
    private static volatile dssr<dxlh> c;
    public dsrj<dxnc> a = dssu.b;

    static {
        dxlh dxlhVar = new dxlh();
        b = dxlhVar;
        dsqw.cc(dxlh.class, dxlhVar);
    }

    private dxlh() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", dxnc.class});
            }
            if (i2 == 3) {
                return new dxlh();
            }
            if (i2 == 4) {
                return new dxlg();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dxlh> dssrVar = c;
            if (dssrVar == null) {
                synchronized (dxlh.class) {
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
