package defpackage;
/* compiled from: PG */
/* renamed from: dhzy  reason: default package */
/* loaded from: classes6.dex */
public final class dhzy extends dsqw<dhzy, dhzx> implements dssk {
    public static final dhzy a;
    private static volatile dssr<dhzy> b;

    static {
        dhzy dhzyVar = new dhzy();
        a = dhzyVar;
        dsqw.cc(dhzy.class, dhzyVar);
    }

    private dhzy() {
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
                return new dhzy();
            }
            if (i2 == 4) {
                return new dhzx();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dhzy> dssrVar = b;
            if (dssrVar == null) {
                synchronized (dhzy.class) {
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
