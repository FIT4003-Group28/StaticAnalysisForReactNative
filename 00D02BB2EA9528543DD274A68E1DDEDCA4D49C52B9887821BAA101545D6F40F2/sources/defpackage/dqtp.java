package defpackage;
/* compiled from: PG */
/* renamed from: dqtp  reason: default package */
/* loaded from: classes6.dex */
public final class dqtp extends dsqw<dqtp, dqto> implements dssk {
    public static final dqtp f;
    private static volatile dssr<dqtp> g;
    public int a;
    public dnpq d;
    public String b = "";
    public String c = "";
    public String e = "";

    static {
        dqtp dqtpVar = new dqtp();
        f = dqtpVar;
        dsqw.cc(dqtp.class, dqtpVar);
    }

    private dqtp() {
        dssu<Object> dssuVar = dssu.b;
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဉ\u0002\u0004ဈ\u0003", new Object[]{"a", "b", "c", "d", "e"});
            }
            if (i2 == 3) {
                return new dqtp();
            }
            if (i2 == 4) {
                return new dqto();
            }
            if (i2 == 5) {
                return f;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dqtp> dssrVar = g;
            if (dssrVar == null) {
                synchronized (dqtp.class) {
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
