package defpackage;
/* compiled from: PG */
/* renamed from: dvcp  reason: default package */
/* loaded from: classes6.dex */
public final class dvcp extends dsqw<dvcp, dvco> implements dssk {
    public static final dvcp c;
    private static volatile dssr<dvcp> d;
    public int a;
    public int b;

    static {
        dvcp dvcpVar = new dvcp();
        c = dvcpVar;
        dsqw.cc(dvcp.class, dvcpVar);
    }

    private dvcp() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001င\u0000", new Object[]{"a", "b"});
            }
            if (i2 == 3) {
                return new dvcp();
            }
            if (i2 == 4) {
                return new dvco();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dvcp> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dvcp.class) {
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
