package defpackage;
/* compiled from: PG */
/* renamed from: dpfw  reason: default package */
/* loaded from: classes6.dex */
public final class dpfw extends dsqw<dpfw, dpfv> implements dssk {
    public static final dpfw c;
    private static volatile dssr<dpfw> e;
    public String a = "";
    public float b;
    private int d;

    static {
        dpfw dpfwVar = new dpfw();
        c = dpfwVar;
        dsqw.cc(dpfw.class, dpfwVar);
    }

    private dpfw() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ခ\u0001", new Object[]{"d", "a", "b"});
            }
            if (i2 == 3) {
                return new dpfw();
            }
            if (i2 == 4) {
                return new dpfv();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dpfw> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dpfw.class) {
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
