package defpackage;
/* compiled from: PG */
/* renamed from: axev  reason: default package */
/* loaded from: classes.dex */
public final class axev extends dsqw<axev, axeu> implements dssk {
    public static final axev e;
    private static volatile dssr<axev> f;
    public int a;
    public long b;
    public long c;
    public long d;

    static {
        axev axevVar = new axev();
        e = axevVar;
        dsqw.cc(axev.class, axevVar);
    }

    private axev() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003ဂ\u0002", new Object[]{"a", "b", "c", "d"});
            }
            if (i2 == 3) {
                return new axev();
            }
            if (i2 == 4) {
                return new axeu();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<axev> dssrVar = f;
            if (dssrVar == null) {
                synchronized (axev.class) {
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
