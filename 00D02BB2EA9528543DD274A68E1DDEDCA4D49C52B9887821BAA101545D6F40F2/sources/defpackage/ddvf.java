package defpackage;
/* compiled from: PG */
/* renamed from: ddvf  reason: default package */
/* loaded from: classes6.dex */
public final class ddvf extends dsqw<ddvf, ddvd> implements dssk {
    public static final ddvf d;
    private static volatile dssr<ddvf> e;
    public int a;
    public int b;
    public int c;

    static {
        ddvf ddvfVar = new ddvf();
        d = ddvfVar;
        dsqw.cc(ddvf.class, ddvfVar);
    }

    private ddvf() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဆ\u0000\u0002ဌ\u0001", new Object[]{"a", "b", "c", ddve.a});
            }
            if (i2 == 3) {
                return new ddvf();
            }
            if (i2 == 4) {
                return new ddvd();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<ddvf> dssrVar = e;
            if (dssrVar == null) {
                synchronized (ddvf.class) {
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
