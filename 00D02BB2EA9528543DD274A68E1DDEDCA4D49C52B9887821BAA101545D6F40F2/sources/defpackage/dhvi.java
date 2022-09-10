package defpackage;
/* compiled from: PG */
/* renamed from: dhvi  reason: default package */
/* loaded from: classes6.dex */
public final class dhvi extends dsqw<dhvi, dhvh> implements dssk {
    public static final dhvi a;
    private static volatile dssr<dhvi> b;

    static {
        dhvi dhviVar = new dhvi();
        a = dhviVar;
        dsqw.cc(dhvi.class, dhviVar);
    }

    private dhvi() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(a, "\u0001\u0000", null);
            }
            if (i2 == 3) {
                return new dhvi();
            }
            if (i2 == 4) {
                return new dhvh();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dhvi> dssrVar = b;
            if (dssrVar == null) {
                synchronized (dhvi.class) {
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
