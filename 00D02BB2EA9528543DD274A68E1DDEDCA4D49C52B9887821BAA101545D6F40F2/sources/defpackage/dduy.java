package defpackage;
/* compiled from: PG */
/* renamed from: dduy  reason: default package */
/* loaded from: classes6.dex */
public final class dduy extends dsqw<dduy, ddux> implements dssk {
    public static final dduy c;
    private static volatile dssr<dduy> d;
    public int a;
    public boolean b;

    static {
        dduy dduyVar = new dduy();
        c = dduyVar;
        dsqw.cc(dduy.class, dduyVar);
    }

    private dduy() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဇ\u0000", new Object[]{"a", "b"});
            }
            if (i2 == 3) {
                return new dduy();
            }
            if (i2 == 4) {
                return new ddux();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dduy> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dduy.class) {
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
