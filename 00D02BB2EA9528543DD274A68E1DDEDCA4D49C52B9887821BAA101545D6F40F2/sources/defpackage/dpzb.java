package defpackage;
/* compiled from: PG */
/* renamed from: dpzb  reason: default package */
/* loaded from: classes6.dex */
public final class dpzb extends dsqw<dpzb, dpyw> implements dssk {
    public static final dpzb d;
    private static volatile dssr<dpzb> e;
    public int a;
    public int b;
    public int c;

    static {
        dpzb dpzbVar = new dpzb();
        d = dpzbVar;
        dsqw.cc(dpzb.class, dpzbVar);
    }

    private dpzb() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001", new Object[]{"a", "b", dpyz.a, "c", dpyy.c()});
            }
            if (i2 == 3) {
                return new dpzb();
            }
            if (i2 == 4) {
                return new dpyw();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dpzb> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dpzb.class) {
                    dssrVar = e;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(d);
                        e = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
