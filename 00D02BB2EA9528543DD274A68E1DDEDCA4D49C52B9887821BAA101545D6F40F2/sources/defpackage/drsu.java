package defpackage;
/* compiled from: PG */
/* renamed from: drsu  reason: default package */
/* loaded from: classes.dex */
public final class drsu extends dsqw<drsu, drst> implements dssk {
    public static final drsu e;
    private static volatile dssr<drsu> g;
    public int a;
    public int b;
    public int c;
    public int d;
    private byte f = 2;

    static {
        drsu drsuVar = new drsu();
        e = drsuVar;
        dsqw.cc(drsu.class, drsuVar);
    }

    private drsu() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0003\u0001ᔄ\u0000\u0002ᔄ\u0001\u0003ᔄ\u0002", new Object[]{"a", "b", "c", "d"});
            }
            if (i2 == 3) {
                return new drsu();
            }
            if (i2 == 4) {
                return new drst();
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
            dssr<drsu> dssrVar = g;
            if (dssrVar == null) {
                synchronized (drsu.class) {
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
