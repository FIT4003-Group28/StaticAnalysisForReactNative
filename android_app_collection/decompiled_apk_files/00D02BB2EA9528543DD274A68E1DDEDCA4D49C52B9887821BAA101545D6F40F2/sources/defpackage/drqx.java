package defpackage;
/* compiled from: PG */
/* renamed from: drqx  reason: default package */
/* loaded from: classes6.dex */
public final class drqx extends dsqw<drqx, drqw> implements dssk {
    public static final drqx b;
    private static volatile dssr<drqx> d;
    public String a = "";
    private int c;

    static {
        drqx drqxVar = new drqx();
        b = drqxVar;
        dsqw.cc(drqx.class, drqxVar);
    }

    private drqx() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"c", "a"});
            }
            if (i2 == 3) {
                return new drqx();
            }
            if (i2 == 4) {
                return new drqw();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<drqx> dssrVar = d;
            if (dssrVar == null) {
                synchronized (drqx.class) {
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
