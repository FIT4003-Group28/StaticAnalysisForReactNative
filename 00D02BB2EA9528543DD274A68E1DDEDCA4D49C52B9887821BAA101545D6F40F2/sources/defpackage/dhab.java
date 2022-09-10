package defpackage;
/* compiled from: PG */
/* renamed from: dhab  reason: default package */
/* loaded from: classes6.dex */
public final class dhab extends dsqw<dhab, dhaa> implements dssk {
    public static final dhab c;
    private static volatile dssr<dhab> d;
    public dhah a;
    public dgzz b;

    static {
        dhab dhabVar = new dhab();
        c = dhabVar;
        dsqw.cc(dhab.class, dhabVar);
    }

    private dhab() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0000\u0002\u0000\u0000\u0001\u0003\u0002\u0000\u0000\u0000\u0001\t\u0003\t", new Object[]{"a", "b"});
            }
            if (i2 == 3) {
                return new dhab();
            }
            if (i2 == 4) {
                return new dhaa();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dhab> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dhab.class) {
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
