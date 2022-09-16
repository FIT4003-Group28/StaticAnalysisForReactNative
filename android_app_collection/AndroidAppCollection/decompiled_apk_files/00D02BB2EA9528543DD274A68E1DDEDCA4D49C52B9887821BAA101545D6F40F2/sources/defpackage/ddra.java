package defpackage;
/* compiled from: PG */
/* renamed from: ddra  reason: default package */
/* loaded from: classes6.dex */
public final class ddra extends dsqw<ddra, ddqz> implements dssk {
    public static final ddra c;
    private static volatile dssr<ddra> d;
    public int a;
    public int b;

    static {
        ddra ddraVar = new ddra();
        c = ddraVar;
        dsqw.cc(ddra.class, ddraVar);
    }

    private ddra() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001င\u0000", new Object[]{"a", "b"});
            }
            if (i2 == 3) {
                return new ddra();
            }
            if (i2 == 4) {
                return new ddqz();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<ddra> dssrVar = d;
            if (dssrVar == null) {
                synchronized (ddra.class) {
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
