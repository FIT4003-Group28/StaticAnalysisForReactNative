package defpackage;
/* compiled from: PG */
/* renamed from: dfpu  reason: default package */
/* loaded from: classes6.dex */
public final class dfpu extends dsqw<dfpu, dfpp> implements dssk {
    public static final dfpu c;
    private static volatile dssr<dfpu> d;
    public int a = 0;
    public Object b;

    static {
        dfpu dfpuVar = new dfpu();
        c = dfpuVar;
        dsqw.cc(dfpu.class, dfpuVar);
    }

    private dfpu() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဿ\u0000\u0002ဿ\u0000", new Object[]{"b", "a", dfpt.c(), dfpr.c()});
            }
            if (i2 == 3) {
                return new dfpu();
            }
            if (i2 == 4) {
                return new dfpp();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dfpu> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dfpu.class) {
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
