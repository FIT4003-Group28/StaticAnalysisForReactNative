package defpackage;
/* compiled from: PG */
/* renamed from: dtba  reason: default package */
/* loaded from: classes6.dex */
public final class dtba extends dsqw<dtba, dtaz> implements dssk {
    public static final dtba c;
    private static volatile dssr<dtba> d;
    public int a;
    public dtay b;

    static {
        dtba dtbaVar = new dtba();
        c = dtbaVar;
        dsqw.cc(dtba.class, dtbaVar);
    }

    private dtba() {
        dssu<Object> dssuVar = dssu.b;
    }

    public static dtaz c() {
        return c.bZ();
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"a", "b"});
            }
            if (i2 == 3) {
                return new dtba();
            }
            if (i2 == 4) {
                return new dtaz();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dtba> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dtba.class) {
                    dssrVar = d;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(c);
                        d = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
