package defpackage;
/* compiled from: PG */
/* renamed from: axdo  reason: default package */
/* loaded from: classes.dex */
public final class axdo extends dsqw<axdo, axdn> implements dssk {
    public static final axdo e;
    private static volatile dssr<axdo> g;
    public int a;
    public long b;
    public dvhu c;
    public dviq d;
    private byte f = 2;

    static {
        axdo axdoVar = new axdo();
        e = axdoVar;
        dsqw.cc(axdo.class, axdoVar);
    }

    private axdo() {
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
                return new axdo();
            }
            if (i2 == 4) {
                return new axdn();
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
            dssr<axdo> dssrVar = g;
            if (dssrVar == null) {
                synchronized (axdo.class) {
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