package defpackage;
/* compiled from: PG */
/* renamed from: dpuu  reason: default package */
/* loaded from: classes6.dex */
public final class dpuu extends dsqw<dpuu, dput> implements dssk {
    public static final dpuu b;
    private static volatile dssr<dpuu> d;
    public String a = "";
    private int c;

    static {
        dpuu dpuuVar = new dpuu();
        b = dpuuVar;
        dsqw.cc(dpuu.class, dpuuVar);
    }

    private dpuu() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"c", "a"});
            }
            if (i2 == 3) {
                return new dpuu();
            }
            if (i2 == 4) {
                return new dput();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dpuu> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dpuu.class) {
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
