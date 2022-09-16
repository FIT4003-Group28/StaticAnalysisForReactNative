package defpackage;
/* compiled from: PG */
/* renamed from: druo  reason: default package */
/* loaded from: classes6.dex */
public final class druo extends dsqw<druo, drun> implements dssk {
    public static final druo a;
    private static volatile dssr<druo> b;

    static {
        druo druoVar = new druo();
        a = druoVar;
        dsqw.cc(druo.class, druoVar);
    }

    private druo() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(a, "\u0001\u0000", null);
            }
            if (i2 == 3) {
                return new druo();
            }
            if (i2 == 4) {
                return new drun();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<druo> dssrVar = b;
            if (dssrVar == null) {
                synchronized (druo.class) {
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
