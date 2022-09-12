package defpackage;
/* compiled from: PG */
/* renamed from: drxi  reason: default package */
/* loaded from: classes6.dex */
public final class drxi extends dsqw<drxi, drxh> implements dssk {
    public static final drxi a;
    private static volatile dssr<drxi> b;

    static {
        drxi drxiVar = new drxi();
        a = drxiVar;
        dsqw.cc(drxi.class, drxiVar);
    }

    private drxi() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(a, "\u0001\u0000", null);
            }
            if (i2 == 3) {
                return new drxi();
            }
            if (i2 == 4) {
                return new drxh();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<drxi> dssrVar = b;
            if (dssrVar == null) {
                synchronized (drxi.class) {
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
