package defpackage;
/* compiled from: PG */
/* renamed from: dxsu  reason: default package */
/* loaded from: classes6.dex */
public final class dxsu extends dsqw<dxsu, dxst> implements dssk {
    public static final dxsu b;
    private static volatile dssr<dxsu> c;
    public dsrj<dxsw> a = dssu.b;

    static {
        dxsu dxsuVar = new dxsu();
        b = dxsuVar;
        dsqw.cc(dxsu.class, dxsuVar);
    }

    private dxsu() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", dxsw.class});
            }
            if (i2 == 3) {
                return new dxsu();
            }
            if (i2 == 4) {
                return new dxst();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dxsu> dssrVar = c;
            if (dssrVar == null) {
                synchronized (dxsu.class) {
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
