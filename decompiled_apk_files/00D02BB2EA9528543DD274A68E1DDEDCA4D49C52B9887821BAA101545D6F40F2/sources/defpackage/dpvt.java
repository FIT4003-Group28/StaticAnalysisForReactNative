package defpackage;
/* compiled from: PG */
/* renamed from: dpvt  reason: default package */
/* loaded from: classes6.dex */
public final class dpvt extends dsqw<dpvt, dpvs> implements dssk {
    public static final dpvt c;
    private static volatile dssr<dpvt> d;
    public int a;
    public String b = "";

    static {
        dpvt dpvtVar = new dpvt();
        c = dpvtVar;
        dsqw.cc(dpvt.class, dpvtVar);
    }

    private dpvt() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"a", "b"});
            }
            if (i2 == 3) {
                return new dpvt();
            }
            if (i2 == 4) {
                return new dpvs();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dpvt> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dpvt.class) {
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
