package defpackage;
/* compiled from: PG */
/* renamed from: dpaw  reason: default package */
/* loaded from: classes6.dex */
public final class dpaw extends dsqw<dpaw, dpav> implements dssk {
    public static final dpaw b;
    private static volatile dssr<dpaw> d;
    public String a;
    private int c;

    static {
        dpaw dpawVar = new dpaw();
        b = dpawVar;
        dsqw.cc(dpaw.class, dpawVar);
    }

    private dpaw() {
        dspd dspdVar = dspd.b;
        this.a = "";
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002ဈ\u0001", new Object[]{"c", "a"});
            }
            if (i2 == 3) {
                return new dpaw();
            }
            if (i2 == 4) {
                return new dpav();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dpaw> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dpaw.class) {
                    dssrVar = d;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(b);
                        d = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}