package defpackage;
/* compiled from: PG */
/* renamed from: drme  reason: default package */
/* loaded from: classes6.dex */
public final class drme extends dsqw<drme, drmd> implements dssk {
    public static final drme c;
    private static volatile dssr<drme> e;
    public String a = "_theme";
    public String b = "dark";
    private int d;

    static {
        drme drmeVar = new drme();
        c = drmeVar;
        dsqw.cc(drme.class, drmeVar);
    }

    private drme() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"d", "a", "b"});
            }
            if (i2 == 3) {
                return new drme();
            }
            if (i2 == 4) {
                return new drmd();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<drme> dssrVar = e;
            if (dssrVar == null) {
                synchronized (drme.class) {
                    dssrVar = e;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(c);
                        e = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
