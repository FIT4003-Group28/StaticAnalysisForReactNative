package defpackage;
/* compiled from: PG */
/* renamed from: dxmy  reason: default package */
/* loaded from: classes6.dex */
public final class dxmy extends dsqw<dxmy, dxmx> implements dssk {
    public static final dxmy b;
    private static volatile dssr<dxmy> c;
    public dsrj<dxnc> a = dssu.b;

    static {
        dxmy dxmyVar = new dxmy();
        b = dxmyVar;
        dsqw.cc(dxmy.class, dxmyVar);
    }

    private dxmy() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", dxnc.class});
            }
            if (i2 == 3) {
                return new dxmy();
            }
            if (i2 == 4) {
                return new dxmx();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dxmy> dssrVar = c;
            if (dssrVar == null) {
                synchronized (dxmy.class) {
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
