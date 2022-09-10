package defpackage;
/* compiled from: PG */
/* renamed from: dxrq  reason: default package */
/* loaded from: classes6.dex */
public final class dxrq extends dsqw<dxrq, dxrp> implements dssk {
    public static final dxrq b;
    private static volatile dssr<dxrq> c;
    public dsrj<dxry> a = dssu.b;

    static {
        dxrq dxrqVar = new dxrq();
        b = dxrqVar;
        dsqw.cc(dxrq.class, dxrqVar);
    }

    private dxrq() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", dxry.class});
            }
            if (i2 == 3) {
                return new dxrq();
            }
            if (i2 == 4) {
                return new dxrp();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dxrq> dssrVar = c;
            if (dssrVar == null) {
                synchronized (dxrq.class) {
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
