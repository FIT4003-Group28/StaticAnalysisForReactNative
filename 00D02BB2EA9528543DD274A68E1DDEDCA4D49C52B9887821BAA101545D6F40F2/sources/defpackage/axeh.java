package defpackage;
/* compiled from: PG */
/* renamed from: axeh  reason: default package */
/* loaded from: classes.dex */
public final class axeh extends dsqw<axeh, axeg> implements dssk {
    public static final axeh e;
    private static volatile dssr<axeh> g;
    public int a;
    public long b;
    public dvjd c;
    public dviq d;
    private byte f = 2;

    static {
        axeh axehVar = new axeh();
        e = axehVar;
        dsqw.cc(axeh.class, axehVar);
    }

    private axeh() {
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
                return new axeh();
            }
            if (i2 == 4) {
                return new axeg();
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
            dssr<axeh> dssrVar = g;
            if (dssrVar == null) {
                synchronized (axeh.class) {
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
