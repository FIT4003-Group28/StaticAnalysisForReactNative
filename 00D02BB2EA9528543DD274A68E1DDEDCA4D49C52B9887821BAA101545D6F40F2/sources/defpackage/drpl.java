package defpackage;
/* compiled from: PG */
/* renamed from: drpl  reason: default package */
/* loaded from: classes6.dex */
public final class drpl extends dsqw<drpl, drpi> implements dssk {
    public static final drpl b;
    private static volatile dssr<drpl> d;
    public int a;
    private int c;

    static {
        drpl drplVar = new drpl();
        b = drplVar;
        dsqw.cc(drpl.class, drplVar);
    }

    private drpl() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"c", "a", drpj.a});
            }
            if (i2 == 3) {
                return new drpl();
            }
            if (i2 == 4) {
                return new drpi();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<drpl> dssrVar = d;
            if (dssrVar == null) {
                synchronized (drpl.class) {
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
