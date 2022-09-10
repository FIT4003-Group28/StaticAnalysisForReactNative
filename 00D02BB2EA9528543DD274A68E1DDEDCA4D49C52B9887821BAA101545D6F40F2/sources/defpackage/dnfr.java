package defpackage;
/* compiled from: PG */
/* renamed from: dnfr  reason: default package */
/* loaded from: classes6.dex */
public final class dnfr extends dsqw<dnfr, dnfq> implements dssk {
    public static final dnfr c;
    private static volatile dssr<dnfr> e;
    public dnjl a;
    public String b = "";
    private int d;

    static {
        dnfr dnfrVar = new dnfr();
        c = dnfrVar;
        dsqw.cc(dnfr.class, dnfrVar);
    }

    private dnfr() {
        dssu<Object> dssuVar = dssu.b;
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဈ\u0001", new Object[]{"d", "a", "b"});
            }
            if (i2 == 3) {
                return new dnfr();
            }
            if (i2 == 4) {
                return new dnfq();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dnfr> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dnfr.class) {
                    dssrVar = e;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(c);
                        e = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
