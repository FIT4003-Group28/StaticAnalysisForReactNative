package defpackage;
/* compiled from: PG */
/* renamed from: dhmu  reason: default package */
/* loaded from: classes6.dex */
public final class dhmu extends dsqw<dhmu, dhmt> implements dssk {
    public static final dhmu c;
    private static volatile dssr<dhmu> d;
    public int a;
    public int b;

    static {
        dhmu dhmuVar = new dhmu();
        c = dhmuVar;
        dsqw.cc(dhmu.class, dhmuVar);
    }

    private dhmu() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"a", "b", dgdc.c()});
            }
            if (i2 == 3) {
                return new dhmu();
            }
            if (i2 == 4) {
                return new dhmt();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dhmu> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dhmu.class) {
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
