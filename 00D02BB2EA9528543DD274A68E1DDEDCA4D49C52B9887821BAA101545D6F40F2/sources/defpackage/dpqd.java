package defpackage;
/* compiled from: PG */
/* renamed from: dpqd  reason: default package */
/* loaded from: classes6.dex */
public final class dpqd extends dsqw<dpqd, dpqc> implements dssk {
    public static final dpqd c;
    private static volatile dssr<dpqd> e;
    public String a = "";
    public int b;
    private int d;

    static {
        dpqd dpqdVar = new dpqd();
        c = dpqdVar;
        dsqw.cc(dpqd.class, dpqdVar);
    }

    private dpqd() {
        dssu<Object> dssuVar = dssu.b;
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0002\u0000\u0001\u0001\u0004\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0004ဌ\u0001", new Object[]{"d", "a", "b", dpqz.a});
            }
            if (i2 == 3) {
                return new dpqd();
            }
            if (i2 == 4) {
                return new dpqc();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dpqd> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dpqd.class) {
                    dssrVar = e;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(c);
                        e = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
