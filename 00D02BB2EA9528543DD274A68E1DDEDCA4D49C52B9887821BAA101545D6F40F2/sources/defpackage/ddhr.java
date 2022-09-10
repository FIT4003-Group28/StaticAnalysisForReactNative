package defpackage;
/* compiled from: PG */
/* renamed from: ddhr  reason: default package */
/* loaded from: classes.dex */
public final class ddhr extends dsqw<ddhr, ddhq> implements dssk {
    public static final ddhr c;
    private static volatile dssr<ddhr> d;
    public int a;
    public int b;

    static {
        ddhr ddhrVar = new ddhr();
        c = ddhrVar;
        dsqw.cc(ddhr.class, ddhrVar);
    }

    private ddhr() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001င\u0000", new Object[]{"a", "b"});
            }
            if (i2 == 3) {
                return new ddhr();
            }
            if (i2 == 4) {
                return new ddhq();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<ddhr> dssrVar = d;
            if (dssrVar == null) {
                synchronized (ddhr.class) {
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
