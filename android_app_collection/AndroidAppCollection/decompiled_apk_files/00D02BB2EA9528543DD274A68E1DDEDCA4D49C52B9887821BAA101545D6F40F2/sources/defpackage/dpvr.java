package defpackage;
/* compiled from: PG */
/* renamed from: dpvr  reason: default package */
/* loaded from: classes6.dex */
public final class dpvr extends dsqw<dpvr, dpvp> implements dssk {
    public static final dpvr c;
    private static volatile dssr<dpvr> d;
    public int a;
    public int b;

    static {
        dpvr dpvrVar = new dpvr();
        c = dpvrVar;
        dsqw.cc(dpvr.class, dpvrVar);
    }

    private dpvr() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"a", "b", dpvq.a});
            }
            if (i2 == 3) {
                return new dpvr();
            }
            if (i2 == 4) {
                return new dpvp();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dpvr> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dpvr.class) {
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
