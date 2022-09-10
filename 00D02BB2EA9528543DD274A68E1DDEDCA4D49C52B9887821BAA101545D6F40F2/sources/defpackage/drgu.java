package defpackage;
/* compiled from: PG */
/* renamed from: drgu  reason: default package */
/* loaded from: classes6.dex */
public final class drgu extends dsqw<drgu, drgt> implements dssk {
    public static final drgu b;
    private static volatile dssr<drgu> d;
    public boolean a;
    private int c;

    static {
        drgu drguVar = new drgu();
        b = drguVar;
        dsqw.cc(drgu.class, drguVar);
    }

    private drgu() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဇ\u0000", new Object[]{"c", "a"});
            }
            if (i2 == 3) {
                return new drgu();
            }
            if (i2 == 4) {
                return new drgt();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<drgu> dssrVar = d;
            if (dssrVar == null) {
                synchronized (drgu.class) {
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
