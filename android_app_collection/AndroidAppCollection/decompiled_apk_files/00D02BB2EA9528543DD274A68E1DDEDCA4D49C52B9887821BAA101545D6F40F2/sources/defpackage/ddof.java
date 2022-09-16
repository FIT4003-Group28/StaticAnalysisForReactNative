package defpackage;
/* compiled from: PG */
/* renamed from: ddof  reason: default package */
/* loaded from: classes6.dex */
public final class ddof extends dsqw<ddof, ddoe> implements dssk {
    public static final ddof e;
    private static volatile dssr<ddof> f;
    public int a;
    public boolean b;
    public boolean c;
    public boolean d;

    static {
        ddof ddofVar = new ddof();
        e = ddofVar;
        dsqw.cc(ddof.class, ddofVar);
    }

    private ddof() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဇ\u0002", new Object[]{"a", "b", "c", "d"});
            }
            if (i2 == 3) {
                return new ddof();
            }
            if (i2 == 4) {
                return new ddoe();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<ddof> dssrVar = f;
            if (dssrVar == null) {
                synchronized (ddof.class) {
                    dssrVar = f;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(e);
                        f = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
