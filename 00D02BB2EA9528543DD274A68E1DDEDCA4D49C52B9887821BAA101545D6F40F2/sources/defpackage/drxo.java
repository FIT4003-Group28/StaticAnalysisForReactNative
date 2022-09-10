package defpackage;
/* compiled from: PG */
/* renamed from: drxo  reason: default package */
/* loaded from: classes6.dex */
public final class drxo extends dsqw<drxo, drxn> implements dssk {
    public static final drxo a;
    private static volatile dssr<drxo> b;

    static {
        drxo drxoVar = new drxo();
        a = drxoVar;
        dsqw.cc(drxo.class, drxoVar);
    }

    private drxo() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(a, "\u0001\u0000", null);
            }
            if (i2 == 3) {
                return new drxo();
            }
            if (i2 == 4) {
                return new drxn();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<drxo> dssrVar = b;
            if (dssrVar == null) {
                synchronized (drxo.class) {
                    dssrVar = b;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(a);
                        b = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
