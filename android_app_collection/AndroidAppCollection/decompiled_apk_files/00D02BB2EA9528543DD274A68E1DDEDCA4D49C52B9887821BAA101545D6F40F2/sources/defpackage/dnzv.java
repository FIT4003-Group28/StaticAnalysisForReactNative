package defpackage;
/* compiled from: PG */
/* renamed from: dnzv  reason: default package */
/* loaded from: classes6.dex */
public final class dnzv extends dsqw<dnzv, dnzu> implements dssk {
    public static final dnzv b;
    private static volatile dssr<dnzv> d;
    public String a = "";
    private int c;

    static {
        dnzv dnzvVar = new dnzv();
        b = dnzvVar;
        dsqw.cc(dnzv.class, dnzvVar);
    }

    private dnzv() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"c", "a"});
            }
            if (i2 == 3) {
                return new dnzv();
            }
            if (i2 == 4) {
                return new dnzu();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dnzv> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dnzv.class) {
                    dssrVar = d;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(b);
                        d = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
