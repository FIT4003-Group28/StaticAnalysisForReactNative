package defpackage;
/* compiled from: PG */
/* renamed from: axdg  reason: default package */
/* loaded from: classes.dex */
public final class axdg extends dsqw<axdg, axdf> implements dssk {
    public static final axdg e;
    private static volatile dssr<axdg> g;
    public int a;
    public long b;
    public dvhq c;
    public dviq d;
    private byte f = 2;

    static {
        axdg axdgVar = new axdg();
        e = axdgVar;
        dsqw.cc(axdg.class, axdgVar);
    }

    private axdg() {
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
                return new axdg();
            }
            if (i2 == 4) {
                return new axdf();
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
            dssr<axdg> dssrVar = g;
            if (dssrVar == null) {
                synchronized (axdg.class) {
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
