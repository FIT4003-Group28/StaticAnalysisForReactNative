package defpackage;
/* compiled from: PG */
/* renamed from: ddle  reason: default package */
/* loaded from: classes5.dex */
public final class ddle extends dsqw<ddle, ddld> implements dssk {
    public static final ddle f;
    private static volatile dssr<ddle> g;
    public int a;
    public String b = "";
    public String c = "";
    public String d = "";
    public String e = "";

    static {
        ddle ddleVar = new ddle();
        f = ddleVar;
        dsqw.cc(ddle.class, ddleVar);
    }

    private ddle() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003", new Object[]{"a", "b", "c", "d", "e"});
            }
            if (i2 == 3) {
                return new ddle();
            }
            if (i2 == 4) {
                return new ddld();
            }
            if (i2 == 5) {
                return f;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<ddle> dssrVar = g;
            if (dssrVar == null) {
                synchronized (ddle.class) {
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
