package defpackage;
/* compiled from: PG */
/* renamed from: dfiu  reason: default package */
/* loaded from: classes6.dex */
public final class dfiu extends dsqw<dfiu, dfis> implements dssk {
    public static final dfiu c;
    private static volatile dssr<dfiu> d;
    public int a;
    public int b;

    static {
        dfiu dfiuVar = new dfiu();
        c = dfiuVar;
        dsqw.cc(dfiu.class, dfiuVar);
    }

    private dfiu() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"a", "b", dfit.a});
            }
            if (i2 == 3) {
                return new dfiu();
            }
            if (i2 == 4) {
                return new dfis();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dfiu> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dfiu.class) {
                    dssrVar = d;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(c);
                        d = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
