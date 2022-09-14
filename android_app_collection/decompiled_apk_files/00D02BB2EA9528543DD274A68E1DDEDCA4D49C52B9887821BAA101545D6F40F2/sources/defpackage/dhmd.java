package defpackage;
/* compiled from: PG */
/* renamed from: dhmd  reason: default package */
/* loaded from: classes6.dex */
public final class dhmd extends dsqw<dhmd, dhmc> implements dssk {
    public static final dhmd c;
    private static volatile dssr<dhmd> d;
    public int a;
    public int b;

    static {
        dhmd dhmdVar = new dhmd();
        c = dhmdVar;
        dsqw.cc(dhmd.class, dhmdVar);
    }

    private dhmd() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"a", "b", dhmb.c()});
            }
            if (i2 == 3) {
                return new dhmd();
            }
            if (i2 == 4) {
                return new dhmc();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dhmd> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dhmd.class) {
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
