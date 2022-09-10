package defpackage;
/* compiled from: PG */
/* renamed from: dpnk  reason: default package */
/* loaded from: classes6.dex */
public final class dpnk extends dsqw<dpnk, dpnj> implements dssk {
    public static final dpnk b;
    private static volatile dssr<dpnk> d;
    public String a = "";
    private int c;

    static {
        dpnk dpnkVar = new dpnk();
        b = dpnkVar;
        dsqw.cc(dpnk.class, dpnkVar);
    }

    private dpnk() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"c", "a"});
            }
            if (i2 == 3) {
                return new dpnk();
            }
            if (i2 == 4) {
                return new dpnj();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dpnk> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dpnk.class) {
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
