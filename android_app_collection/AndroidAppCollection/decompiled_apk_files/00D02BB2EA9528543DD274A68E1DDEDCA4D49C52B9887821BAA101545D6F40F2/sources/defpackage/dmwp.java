package defpackage;
/* compiled from: PG */
/* renamed from: dmwp  reason: default package */
/* loaded from: classes6.dex */
public final class dmwp extends dsqw<dmwp, dmwo> implements dssk {
    public static final dmwp b;
    private static volatile dssr<dmwp> d;
    public boolean a;
    private int c;

    static {
        dmwp dmwpVar = new dmwp();
        b = dmwpVar;
        dsqw.cc(dmwp.class, dmwpVar);
    }

    private dmwp() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဇ\u0000", new Object[]{"c", "a"});
            }
            if (i2 == 3) {
                return new dmwp();
            }
            if (i2 == 4) {
                return new dmwo();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dmwp> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dmwp.class) {
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
