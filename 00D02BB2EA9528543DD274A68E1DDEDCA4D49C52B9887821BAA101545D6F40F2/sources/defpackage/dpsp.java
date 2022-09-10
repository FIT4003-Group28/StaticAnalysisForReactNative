package defpackage;
/* compiled from: PG */
/* renamed from: dpsp  reason: default package */
/* loaded from: classes6.dex */
public final class dpsp extends dsqw<dpsp, dpso> implements dssk {
    public static final dpsp b;
    private static volatile dssr<dpsp> d;
    public String a = "";
    private int c;

    static {
        dpsp dpspVar = new dpsp();
        b = dpspVar;
        dsqw.cc(dpsp.class, dpspVar);
    }

    private dpsp() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"c", "a"});
            }
            if (i2 == 3) {
                return new dpsp();
            }
            if (i2 == 4) {
                return new dpso();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dpsp> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dpsp.class) {
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
