package defpackage;
/* compiled from: PG */
/* renamed from: drjd  reason: default package */
/* loaded from: classes6.dex */
public final class drjd extends dsqw<drjd, drjc> implements dssk {
    public static final drjd c;
    private static volatile dssr<drjd> e;
    public String a = "";
    public String b = "";
    private int d;

    static {
        drjd drjdVar = new drjd();
        c = drjdVar;
        dsqw.cc(drjd.class, drjdVar);
    }

    private drjd() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"d", "a", "b"});
            }
            if (i2 == 3) {
                return new drjd();
            }
            if (i2 == 4) {
                return new drjc();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<drjd> dssrVar = e;
            if (dssrVar == null) {
                synchronized (drjd.class) {
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
