package defpackage;
/* compiled from: PG */
/* renamed from: dlna  reason: default package */
/* loaded from: classes6.dex */
public final class dlna extends dsqw<dlna, dlmx> implements dssk {
    public static final dlna e;
    private static volatile dssr<dlna> g;
    public dspd a = dspd.b;
    public String b = "";
    public String c = "";
    public int d;
    private int f;

    static {
        dlna dlnaVar = new dlna();
        e = dlnaVar;
        dsqw.cc(dlna.class, dlnaVar);
    }

    private dlna() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(e, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ည\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဌ\u0003", new Object[]{"f", "a", "b", "c", "d", dlmy.a});
            }
            if (i2 == 3) {
                return new dlna();
            }
            if (i2 == 4) {
                return new dlmx();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dlna> dssrVar = g;
            if (dssrVar == null) {
                synchronized (dlna.class) {
                    dssrVar = g;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(e);
                        g = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
