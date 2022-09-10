package defpackage;
/* compiled from: PG */
/* renamed from: druy  reason: default package */
/* loaded from: classes6.dex */
public final class druy extends dsqw<druy, drux> implements dssk {
    public static final druy a;
    private static volatile dssr<druy> b;

    static {
        druy druyVar = new druy();
        a = druyVar;
        dsqw.cc(druy.class, druyVar);
    }

    private druy() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(a, "\u0001\u0000", null);
            }
            if (i2 == 3) {
                return new druy();
            }
            if (i2 == 4) {
                return new drux();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<druy> dssrVar = b;
            if (dssrVar == null) {
                synchronized (druy.class) {
                    dssrVar = b;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(a);
                        b = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
