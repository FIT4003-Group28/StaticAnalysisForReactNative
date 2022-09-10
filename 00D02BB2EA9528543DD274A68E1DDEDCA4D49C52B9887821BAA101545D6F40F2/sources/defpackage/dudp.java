package defpackage;
/* compiled from: PG */
/* renamed from: dudp  reason: default package */
/* loaded from: classes6.dex */
public final class dudp extends dsqw<dudp, dudo> implements dssk {
    public static final dudp b;
    private static volatile dssr<dudp> d;
    public boolean a;
    private int c;

    static {
        dudp dudpVar = new dudp();
        b = dudpVar;
        dsqw.cc(dudp.class, dudpVar);
    }

    private dudp() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဇ\u0000", new Object[]{"c", "a"});
            }
            if (i2 == 3) {
                return new dudp();
            }
            if (i2 == 4) {
                return new dudo();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dudp> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dudp.class) {
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
