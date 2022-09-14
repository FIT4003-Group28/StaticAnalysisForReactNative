package defpackage;
/* compiled from: PG */
/* renamed from: dhad  reason: default package */
/* loaded from: classes6.dex */
public final class dhad extends dsqw<dhad, dhac> implements dssk {
    public static final dhad c;
    private static volatile dssr<dhad> d;
    public dhaj a;
    public dgzz b;

    static {
        dhad dhadVar = new dhad();
        c = dhadVar;
        dsqw.cc(dhad.class, dhadVar);
    }

    private dhad() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\t", new Object[]{"a", "b"});
            }
            if (i2 == 3) {
                return new dhad();
            }
            if (i2 == 4) {
                return new dhac();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dhad> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dhad.class) {
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
