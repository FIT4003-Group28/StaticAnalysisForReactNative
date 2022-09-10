package defpackage;
/* compiled from: PG */
/* renamed from: ddzo  reason: default package */
/* loaded from: classes6.dex */
public final class ddzo extends dsqw<ddzo, ddzm> implements dssk {
    public static final ddzo c;
    private static volatile dssr<ddzo> d;
    public int a;
    public int b;

    static {
        ddzo ddzoVar = new ddzo();
        c = ddzoVar;
        dsqw.cc(ddzo.class, ddzoVar);
    }

    private ddzo() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"a", "b", ddzn.a});
            }
            if (i2 == 3) {
                return new ddzo();
            }
            if (i2 == 4) {
                return new ddzm();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<ddzo> dssrVar = d;
            if (dssrVar == null) {
                synchronized (ddzo.class) {
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
