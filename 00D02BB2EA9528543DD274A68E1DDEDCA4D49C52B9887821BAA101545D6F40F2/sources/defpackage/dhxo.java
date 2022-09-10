package defpackage;
/* compiled from: PG */
/* renamed from: dhxo  reason: default package */
/* loaded from: classes6.dex */
public final class dhxo extends dsqw<dhxo, dhxn> implements dssk {
    public static final dhxo a;
    private static volatile dssr<dhxo> b;

    static {
        dhxo dhxoVar = new dhxo();
        a = dhxoVar;
        dsqw.cc(dhxo.class, dhxoVar);
    }

    private dhxo() {
        dssu<Object> dssuVar = dssu.b;
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(a, "\u0001\u0000", null);
            }
            if (i2 == 3) {
                return new dhxo();
            }
            if (i2 == 4) {
                return new dhxn();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dhxo> dssrVar = b;
            if (dssrVar == null) {
                synchronized (dhxo.class) {
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
