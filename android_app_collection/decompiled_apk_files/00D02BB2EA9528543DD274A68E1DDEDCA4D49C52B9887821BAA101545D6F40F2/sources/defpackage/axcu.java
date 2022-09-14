package defpackage;
/* compiled from: PG */
/* renamed from: axcu  reason: default package */
/* loaded from: classes.dex */
public final class axcu extends dsqw<axcu, axct> implements dssk {
    public static final axcu e;
    private static volatile dssr<axcu> g;
    public int a;
    public long b;
    public dvha c;
    public dviq d;
    private byte f = 2;

    static {
        axcu axcuVar = new axcu();
        e = axcuVar;
        dsqw.cc(axcu.class, axcuVar);
    }

    private axcu() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0001\u0001ဂ\u0000\u0002ဉ\u0001\u0003ᐉ\u0002", new Object[]{"a", "b", "c", "d"});
            }
            if (i2 == 3) {
                return new axcu();
            }
            if (i2 == 4) {
                return new axct();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.f = b;
                return null;
            }
            dssr<axcu> dssrVar = g;
            if (dssrVar == null) {
                synchronized (axcu.class) {
                    dssrVar = g;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(e);
                        g = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.f);
    }
}
