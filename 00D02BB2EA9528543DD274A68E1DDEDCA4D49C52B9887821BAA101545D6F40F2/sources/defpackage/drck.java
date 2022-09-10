package defpackage;
/* compiled from: PG */
/* renamed from: drck  reason: default package */
/* loaded from: classes6.dex */
public final class drck extends dsqw<drck, drcj> implements dssk {
    public static final drck b;
    private static volatile dssr<drck> d;
    public boolean a;
    private int c;

    static {
        drck drckVar = new drck();
        b = drckVar;
        dsqw.cc(drck.class, drckVar);
    }

    private drck() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဇ\u0000", new Object[]{"c", "a"});
            }
            if (i2 == 3) {
                return new drck();
            }
            if (i2 == 4) {
                return new drcj();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<drck> dssrVar = d;
            if (dssrVar == null) {
                synchronized (drck.class) {
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
