package defpackage;
/* compiled from: PG */
/* renamed from: dxnn  reason: default package */
/* loaded from: classes6.dex */
public final class dxnn extends dsqw<dxnn, dxnl> implements dssk {
    public static final dxnn b;
    private static volatile dssr<dxnn> c;
    public dssd<String, dsok> a = dssd.b;

    static {
        dxnn dxnnVar = new dxnn();
        b = dxnnVar;
        dsqw.cc(dxnn.class, dxnnVar);
    }

    private dxnn() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"a", dxnm.a});
            }
            if (i2 == 3) {
                return new dxnn();
            }
            if (i2 == 4) {
                return new dxnl();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dxnn> dssrVar = c;
            if (dssrVar == null) {
                synchronized (dxnn.class) {
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
