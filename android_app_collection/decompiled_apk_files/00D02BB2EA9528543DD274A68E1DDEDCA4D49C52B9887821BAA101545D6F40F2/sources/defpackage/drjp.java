package defpackage;
/* compiled from: PG */
/* renamed from: drjp  reason: default package */
/* loaded from: classes6.dex */
public final class drjp extends dsqw<drjp, drjo> implements dssk {
    public static final drjp b;
    private static volatile dssr<drjp> d;
    public String a = "";
    private int c;

    static {
        drjp drjpVar = new drjp();
        b = drjpVar;
        dsqw.cc(drjp.class, drjpVar);
    }

    private drjp() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"c", "a"});
            }
            if (i2 == 3) {
                return new drjp();
            }
            if (i2 == 4) {
                return new drjo();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<drjp> dssrVar = d;
            if (dssrVar == null) {
                synchronized (drjp.class) {
                    dssrVar = d;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(b);
                        d = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
