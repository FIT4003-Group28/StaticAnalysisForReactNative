package defpackage;
/* compiled from: PG */
/* renamed from: dpnc  reason: default package */
/* loaded from: classes6.dex */
public final class dpnc extends dsqw<dpnc, dpnb> implements dssk {
    public static final dpnc c;
    private static volatile dssr<dpnc> d;
    public int a;
    public int b;

    static {
        dpnc dpncVar = new dpnc();
        c = dpncVar;
        dsqw.cc(dpnc.class, dpncVar);
    }

    private dpnc() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"a", "b", dpnd.a});
            }
            if (i2 == 3) {
                return new dpnc();
            }
            if (i2 == 4) {
                return new dpnb();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dpnc> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dpnc.class) {
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
