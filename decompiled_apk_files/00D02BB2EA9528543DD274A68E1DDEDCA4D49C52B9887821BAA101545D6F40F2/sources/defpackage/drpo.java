package defpackage;
/* compiled from: PG */
/* renamed from: drpo  reason: default package */
/* loaded from: classes6.dex */
public final class drpo extends dsqw<drpo, drpn> implements dssk {
    public static final drpo c;
    private static volatile dssr<drpo> e;
    public String a = "";
    public int b = 1;
    private int d;

    static {
        drpo drpoVar = new drpo();
        c = drpoVar;
        dsqw.cc(drpo.class, drpoVar);
    }

    private drpo() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002င\u0001", new Object[]{"d", "a", "b"});
            }
            if (i2 == 3) {
                return new drpo();
            }
            if (i2 == 4) {
                return new drpn();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<drpo> dssrVar = e;
            if (dssrVar == null) {
                synchronized (drpo.class) {
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
