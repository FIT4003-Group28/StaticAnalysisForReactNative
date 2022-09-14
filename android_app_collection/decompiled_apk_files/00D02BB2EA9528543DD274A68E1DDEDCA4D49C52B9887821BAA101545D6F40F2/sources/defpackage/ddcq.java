package defpackage;
/* compiled from: PG */
/* renamed from: ddcq  reason: default package */
/* loaded from: classes.dex */
public final class ddcq extends dsqw<ddcq, ddcp> implements dssk {
    public static final ddcq d;
    private static volatile dssr<ddcq> e;
    public int a;
    public int b;
    public int c;

    static {
        ddcq ddcqVar = new ddcq();
        d = ddcqVar;
        dsqw.cc(ddcq.class, ddcqVar);
    }

    private ddcq() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001", new Object[]{"a", "b", dprv.a, "c", dprt.a});
            }
            if (i2 == 3) {
                return new ddcq();
            }
            if (i2 == 4) {
                return new ddcp();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<ddcq> dssrVar = e;
            if (dssrVar == null) {
                synchronized (ddcq.class) {
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
