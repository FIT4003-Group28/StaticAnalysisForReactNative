package defpackage;
/* compiled from: PG */
/* renamed from: dhfp  reason: default package */
/* loaded from: classes6.dex */
public final class dhfp extends dsqw<dhfp, dhfl> implements dssk {
    public static final dhfp d;
    private static volatile dssr<dhfp> e;
    public dsqg a;
    public dsrf b = dsqz.b;
    public dhfo c;

    static {
        dhfp dhfpVar = new dhfp();
        d = dhfpVar;
        dsqw.cc(dhfp.class, dhfpVar);
    }

    private dhfp() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0000\u0003\u0000\u0000\u0001\u0007\u0003\u0000\u0001\u0000\u0001\t\u0003,\u0007\t", new Object[]{"a", "b", "c"});
            }
            if (i2 == 3) {
                return new dhfp();
            }
            if (i2 == 4) {
                return new dhfl();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dhfp> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dhfp.class) {
                    dssrVar = e;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(d);
                        e = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
