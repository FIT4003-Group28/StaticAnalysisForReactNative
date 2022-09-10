package defpackage;
/* compiled from: PG */
/* renamed from: ddmy  reason: default package */
/* loaded from: classes.dex */
public final class ddmy extends dsqw<ddmy, ddmx> implements dssk {
    public static final ddmy e;
    private static volatile dssr<ddmy> g;
    public int a;
    public ddxz b;
    public ddxz c;
    public ddxx d;
    private byte f = 2;

    static {
        ddmy ddmyVar = new ddmy();
        e = ddmyVar;
        dsqw.cc(ddmy.class, ddmyVar);
    }

    private ddmy() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0003\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0002", new Object[]{"a", "b", "c", "d"});
            }
            if (i2 == 3) {
                return new ddmy();
            }
            if (i2 == 4) {
                return new ddmx();
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
            dssr<ddmy> dssrVar = g;
            if (dssrVar == null) {
                synchronized (ddmy.class) {
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
