package defpackage;
/* compiled from: PG */
/* renamed from: eawx  reason: default package */
/* loaded from: classes6.dex */
public final class eawx extends dsqw<eawx, eaww> implements dssk {
    public static final eawx f;
    private static volatile dssr<eawx> g;
    public int a;
    public int b;
    public int c;
    public long d;
    public long e;

    static {
        eawx eawxVar = new eawx();
        f = eawxVar;
        dsqw.cc(eawx.class, eawxVar);
    }

    private eawx() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(f, "\u0001\u0004\u0000\u0001\u0001\u0006\u0004\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001\u0003ဂ\u0002\u0006ဂ\u0005", new Object[]{"a", "b", eaxk.a, "c", eaxl.a, "d", "e"});
            }
            if (i2 == 3) {
                return new eawx();
            }
            if (i2 == 4) {
                return new eaww();
            }
            if (i2 == 5) {
                return f;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<eawx> dssrVar = g;
            if (dssrVar == null) {
                synchronized (eawx.class) {
                    dssrVar = g;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(f);
                        g = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
