package defpackage;
/* compiled from: PG */
/* renamed from: ddvp  reason: default package */
/* loaded from: classes6.dex */
public final class ddvp extends dsqw<ddvp, ddvo> implements dssk {
    public static final ddvp c;
    private static volatile dssr<ddvp> d;
    public int a;
    public ddnf b;

    static {
        ddvp ddvpVar = new ddvp();
        c = ddvpVar;
        dsqw.cc(ddvp.class, ddvpVar);
    }

    private ddvp() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"a", "b"});
            }
            if (i2 == 3) {
                return new ddvp();
            }
            if (i2 == 4) {
                return new ddvo();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<ddvp> dssrVar = d;
            if (dssrVar == null) {
                synchronized (ddvp.class) {
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
