package defpackage;
/* compiled from: PG */
/* renamed from: ddip  reason: default package */
/* loaded from: classes.dex */
public final class ddip extends dsqw<ddip, ddio> implements dssk {
    public static final ddip c;
    private static volatile dssr<ddip> d;
    public int a;
    public int b;

    static {
        ddip ddipVar = new ddip();
        c = ddipVar;
        dsqw.cc(ddip.class, ddipVar);
    }

    private ddip() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"a", "b", dqvj.d()});
            }
            if (i2 == 3) {
                return new ddip();
            }
            if (i2 == 4) {
                return new ddio();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<ddip> dssrVar = d;
            if (dssrVar == null) {
                synchronized (ddip.class) {
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
