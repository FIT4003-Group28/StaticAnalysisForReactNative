package defpackage;
/* compiled from: PG */
/* renamed from: ddxo  reason: default package */
/* loaded from: classes6.dex */
public final class ddxo extends dsqw<ddxo, ddxl> implements dssk {
    public static final ddxo b;
    private static volatile dssr<ddxo> c;
    public dsrj<ddxn> a = dssu.b;

    static {
        ddxo ddxoVar = new ddxo();
        b = ddxoVar;
        dsqw.cc(ddxo.class, ddxoVar);
    }

    private ddxo() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", ddxn.class});
            }
            if (i2 == 3) {
                return new ddxo();
            }
            if (i2 == 4) {
                return new ddxl();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<ddxo> dssrVar = c;
            if (dssrVar == null) {
                synchronized (ddxo.class) {
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
