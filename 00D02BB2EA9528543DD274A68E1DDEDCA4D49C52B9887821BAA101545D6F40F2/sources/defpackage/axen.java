package defpackage;
/* compiled from: PG */
/* renamed from: axen  reason: default package */
/* loaded from: classes.dex */
public final class axen extends dsqw<axen, axem> implements dssk {
    public static final axen e;
    private static volatile dssr<axen> g;
    public int a;
    public long b;
    public dvjf c;
    public dviq d;
    private byte f = 2;

    static {
        axen axenVar = new axen();
        e = axenVar;
        dsqw.cc(axen.class, axenVar);
    }

    private axen() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0002\u0001ဂ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0002", new Object[]{"a", "b", "c", "d"});
            }
            if (i2 == 3) {
                return new axen();
            }
            if (i2 == 4) {
                return new axem();
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
            dssr<axen> dssrVar = g;
            if (dssrVar == null) {
                synchronized (axen.class) {
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
