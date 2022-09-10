package defpackage;
/* compiled from: PG */
/* renamed from: dhhp  reason: default package */
/* loaded from: classes6.dex */
public final class dhhp extends dsqw<dhhp, dhho> implements dssk {
    public static final dhhp c;
    private static volatile dssr<dhhp> d;
    public int a;
    public String b = "";

    static {
        dhhp dhhpVar = new dhhp();
        c = dhhpVar;
        dsqw.cc(dhhp.class, dhhpVar);
    }

    private dhhp() {
        dssu<Object> dssuVar = dssu.b;
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"a", "b"});
            }
            if (i2 == 3) {
                return new dhhp();
            }
            if (i2 == 4) {
                return new dhho();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dhhp> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dhhp.class) {
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
