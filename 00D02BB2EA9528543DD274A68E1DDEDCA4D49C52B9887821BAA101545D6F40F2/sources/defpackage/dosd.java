package defpackage;
/* compiled from: PG */
/* renamed from: dosd  reason: default package */
/* loaded from: classes6.dex */
public final class dosd extends dsqw<dosd, dosa> implements dssk {
    public static final dosd c;
    private static volatile dssr<dosd> d;
    public int a;
    public int b = 1;

    static {
        dosd dosdVar = new dosd();
        c = dosdVar;
        dsqw.cc(dosd.class, dosdVar);
    }

    private dosd() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"a", "b", dosc.c()});
            }
            if (i2 == 3) {
                return new dosd();
            }
            if (i2 == 4) {
                return new dosa();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dosd> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dosd.class) {
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
