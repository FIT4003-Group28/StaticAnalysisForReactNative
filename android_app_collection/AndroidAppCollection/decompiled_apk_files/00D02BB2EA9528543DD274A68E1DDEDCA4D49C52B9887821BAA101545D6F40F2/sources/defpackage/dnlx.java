package defpackage;
/* compiled from: PG */
/* renamed from: dnlx  reason: default package */
/* loaded from: classes6.dex */
public final class dnlx extends dsqw<dnlx, dnlu> implements dssk {
    public static final dnlx c;
    private static volatile dssr<dnlx> d;
    public int a;
    public int b;

    static {
        dnlx dnlxVar = new dnlx();
        c = dnlxVar;
        dsqw.cc(dnlx.class, dnlxVar);
    }

    private dnlx() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"a", "b", dnlv.a});
            }
            if (i2 == 3) {
                return new dnlx();
            }
            if (i2 == 4) {
                return new dnlu();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dnlx> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dnlx.class) {
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
