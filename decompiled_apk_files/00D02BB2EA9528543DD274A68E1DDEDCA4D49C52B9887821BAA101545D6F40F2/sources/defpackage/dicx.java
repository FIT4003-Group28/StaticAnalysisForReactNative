package defpackage;
/* compiled from: PG */
/* renamed from: dicx  reason: default package */
/* loaded from: classes6.dex */
public final class dicx extends dsqw<dicx, dicw> implements dssk {
    public static final dicx c;
    private static volatile dssr<dicx> d;
    public int a;
    public String b = "";

    static {
        dicx dicxVar = new dicx();
        c = dicxVar;
        dsqw.cc(dicx.class, dicxVar);
    }

    private dicx() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"a", "b"});
            }
            if (i2 == 3) {
                return new dicx();
            }
            if (i2 == 4) {
                return new dicw();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dicx> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dicx.class) {
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
