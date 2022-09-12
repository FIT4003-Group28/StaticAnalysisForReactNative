package defpackage;
/* compiled from: PG */
/* renamed from: dfvi  reason: default package */
/* loaded from: classes6.dex */
public final class dfvi extends dsqw<dfvi, dfvh> implements dssk {
    public static final dfvi a;
    private static volatile dssr<dfvi> b;

    static {
        dfvi dfviVar = new dfvi();
        a = dfviVar;
        dsqw.cc(dfvi.class, dfviVar);
    }

    private dfvi() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(a, "\u0001\u0000", null);
            }
            if (i2 == 3) {
                return new dfvi();
            }
            if (i2 == 4) {
                return new dfvh();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dfvi> dssrVar = b;
            if (dssrVar == null) {
                synchronized (dfvi.class) {
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
