package defpackage;
/* compiled from: PG */
/* renamed from: dfih  reason: default package */
/* loaded from: classes6.dex */
public final class dfih extends dsqw<dfih, dfig> implements dssk {
    public static final dfih f;
    private static volatile dssr<dfih> g;
    public int a;
    public float b = 30.0f;
    public float c = 50.0f;
    public float d = 5000.0f;
    public float e = 10000.0f;

    static {
        dfih dfihVar = new dfih();
        f = dfihVar;
        dsqw.cc(dfih.class, dfihVar);
    }

    private dfih() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ခ\u0000\u0002ခ\u0001\u0003ခ\u0002\u0004ခ\u0003", new Object[]{"a", "b", "c", "d", "e"});
            }
            if (i2 == 3) {
                return new dfih();
            }
            if (i2 == 4) {
                return new dfig();
            }
            if (i2 == 5) {
                return f;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dfih> dssrVar = g;
            if (dssrVar == null) {
                synchronized (dfih.class) {
                    dssrVar = g;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(f);
                        g = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
