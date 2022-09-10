package defpackage;
/* compiled from: PG */
/* renamed from: dpze  reason: default package */
/* loaded from: classes6.dex */
public final class dpze extends dsqw<dpze, dpzd> implements dssk {
    public static final dpze b;
    private static volatile dssr<dpze> d;
    public String a = "";
    private int c;

    static {
        dpze dpzeVar = new dpze();
        b = dpzeVar;
        dsqw.cc(dpze.class, dpzeVar);
    }

    private dpze() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"c", "a"});
            }
            if (i2 == 3) {
                return new dpze();
            }
            if (i2 == 4) {
                return new dpzd();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dpze> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dpze.class) {
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
