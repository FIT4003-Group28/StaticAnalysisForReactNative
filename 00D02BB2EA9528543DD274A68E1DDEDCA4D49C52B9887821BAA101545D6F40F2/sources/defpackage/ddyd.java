package defpackage;
/* compiled from: PG */
/* renamed from: ddyd  reason: default package */
/* loaded from: classes.dex */
public final class ddyd extends dsqw<ddyd, ddyc> implements dssk {
    public static final ddyd c;
    private static volatile dssr<ddyd> d;
    public int a;
    public int b;

    static {
        ddyd ddydVar = new ddyd();
        c = ddydVar;
        dsqw.cc(ddyd.class, ddydVar);
    }

    private ddyd() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001င\u0000", new Object[]{"a", "b"});
            }
            if (i2 == 3) {
                return new ddyd();
            }
            if (i2 == 4) {
                return new ddyc();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<ddyd> dssrVar = d;
            if (dssrVar == null) {
                synchronized (ddyd.class) {
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
