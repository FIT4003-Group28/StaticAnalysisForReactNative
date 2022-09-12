package defpackage;
/* compiled from: PG */
/* renamed from: ddwd  reason: default package */
/* loaded from: classes6.dex */
public final class ddwd extends dsqw<ddwd, ddwc> implements dssk {
    public static final ddwd c;
    private static volatile dssr<ddwd> d;
    public int a;
    public ddwr b;

    static {
        ddwd ddwdVar = new ddwd();
        c = ddwdVar;
        dsqw.cc(ddwd.class, ddwdVar);
    }

    private ddwd() {
        dssu<Object> dssuVar = dssu.b;
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"a", "b"});
            }
            if (i2 == 3) {
                return new ddwd();
            }
            if (i2 == 4) {
                return new ddwc();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<ddwd> dssrVar = d;
            if (dssrVar == null) {
                synchronized (ddwd.class) {
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
