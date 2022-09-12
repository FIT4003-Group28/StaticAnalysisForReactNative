package defpackage;
/* compiled from: PG */
/* renamed from: ddcc  reason: default package */
/* loaded from: classes5.dex */
public final class ddcc extends dsqw<ddcc, ddcb> implements dssk {
    public static final ddcc e;
    private static volatile dssr<ddcc> f;
    public int a;
    public long b;
    public boolean c;
    public boolean d;

    static {
        ddcc ddccVar = new ddcc();
        e = ddccVar;
        dsqw.cc(ddcc.class, ddccVar);
    }

    private ddcc() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဇ\u0001\u0003ဇ\u0002", new Object[]{"a", "b", "c", "d"});
            }
            if (i2 == 3) {
                return new ddcc();
            }
            if (i2 == 4) {
                return new ddcb();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<ddcc> dssrVar = f;
            if (dssrVar == null) {
                synchronized (ddcc.class) {
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
