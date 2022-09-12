package defpackage;
/* compiled from: PG */
/* renamed from: dlng  reason: default package */
/* loaded from: classes6.dex */
public final class dlng extends dsqw<dlng, dlnf> implements dssk {
    public static final dlng f;
    private static volatile dssr<dlng> g;
    public int a;
    public dspd b = dspd.b;
    public String c = "";
    public String d = "";
    public String e = "";

    static {
        dlng dlngVar = new dlng();
        f = dlngVar;
        dsqw.cc(dlng.class, dlngVar);
    }

    private dlng() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(f, "\u0001\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0000\u0000\u0001ည\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0005ဈ\u0003", new Object[]{"a", "b", "c", "d", "e"});
            }
            if (i2 == 3) {
                return new dlng();
            }
            if (i2 == 4) {
                return new dlnf();
            }
            if (i2 == 5) {
                return f;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dlng> dssrVar = g;
            if (dssrVar == null) {
                synchronized (dlng.class) {
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
