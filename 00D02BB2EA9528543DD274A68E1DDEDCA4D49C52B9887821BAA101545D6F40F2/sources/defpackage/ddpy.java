package defpackage;
/* compiled from: PG */
/* renamed from: ddpy  reason: default package */
/* loaded from: classes6.dex */
public final class ddpy extends dsqw<ddpy, ddpw> implements dssk {
    public static final ddpy c;
    private static volatile dssr<ddpy> d;
    public int a;
    public int b;

    static {
        ddpy ddpyVar = new ddpy();
        c = ddpyVar;
        dsqw.cc(ddpy.class, ddpyVar);
    }

    private ddpy() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"a", "b", ddpx.a});
            }
            if (i2 == 3) {
                return new ddpy();
            }
            if (i2 == 4) {
                return new ddpw();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<ddpy> dssrVar = d;
            if (dssrVar == null) {
                synchronized (ddpy.class) {
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
