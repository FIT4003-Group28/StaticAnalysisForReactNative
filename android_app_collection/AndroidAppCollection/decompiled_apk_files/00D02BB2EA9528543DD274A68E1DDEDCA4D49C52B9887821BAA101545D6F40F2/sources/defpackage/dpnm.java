package defpackage;
/* compiled from: PG */
/* renamed from: dpnm  reason: default package */
/* loaded from: classes6.dex */
public final class dpnm extends dsqw<dpnm, dpnl> implements dssk {
    public static final dpnm c;
    private static volatile dssr<dpnm> e;
    public String a = "";
    public float b;
    private int d;

    static {
        dpnm dpnmVar = new dpnm();
        c = dpnmVar;
        dsqw.cc(dpnm.class, dpnmVar);
    }

    private dpnm() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ခ\u0001", new Object[]{"d", "a", "b"});
            }
            if (i2 == 3) {
                return new dpnm();
            }
            if (i2 == 4) {
                return new dpnl();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dpnm> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dpnm.class) {
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
