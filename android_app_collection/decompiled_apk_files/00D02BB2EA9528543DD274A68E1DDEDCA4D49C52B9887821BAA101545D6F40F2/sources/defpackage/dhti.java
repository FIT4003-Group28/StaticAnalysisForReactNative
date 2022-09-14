package defpackage;
/* compiled from: PG */
/* renamed from: dhti  reason: default package */
/* loaded from: classes.dex */
public final class dhti extends dsqw<dhti, dhth> implements dssk {
    public static final dhti f;
    private static volatile dssr<dhti> g;
    public int a;
    public int b = 0;
    public Object c;
    public int d;
    public int e;

    static {
        dhti dhtiVar = new dhti();
        f = dhtiVar;
        dsqw.cc(dhti.class, dhtiVar);
    }

    private dhti() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(f, "\u0001\u0004\u0001\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ြ\u0000\u0002ျ\u0000\u0003ဆ\u0002\u0004ဆ\u0003", new Object[]{"c", "b", "a", dhtk.class, "d", "e"});
            }
            if (i2 == 3) {
                return new dhti();
            }
            if (i2 == 4) {
                return new dhth();
            }
            if (i2 == 5) {
                return f;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dhti> dssrVar = g;
            if (dssrVar == null) {
                synchronized (dhti.class) {
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
