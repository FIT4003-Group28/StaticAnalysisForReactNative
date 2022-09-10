package defpackage;
/* compiled from: PG */
/* renamed from: dptp  reason: default package */
/* loaded from: classes6.dex */
public final class dptp extends dsqw<dptp, dpto> implements dssk {
    public static final dptp c;
    private static volatile dssr<dptp> e;
    public String a = "";
    public String b = "";
    private int d;

    static {
        dptp dptpVar = new dptp();
        c = dptpVar;
        dsqw.cc(dptp.class, dptpVar);
    }

    private dptp() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0002\u0000\u0001\u0002\u0003\u0002\u0000\u0000\u0000\u0002ဈ\u0001\u0003ဈ\u0002", new Object[]{"d", "a", "b"});
            }
            if (i2 == 3) {
                return new dptp();
            }
            if (i2 == 4) {
                return new dpto();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dptp> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dptp.class) {
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
