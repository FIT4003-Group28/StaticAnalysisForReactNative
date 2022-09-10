package defpackage;
/* compiled from: PG */
/* renamed from: dpwk  reason: default package */
/* loaded from: classes6.dex */
public final class dpwk extends dsqw<dpwk, dpwj> implements dssk {
    public static final dpwk d;
    private static volatile dssr<dpwk> f;
    public int a;
    public int b;
    public dpsn c;
    private int e;

    static {
        dpwk dpwkVar = new dpwk();
        d = dpwkVar;
        dsqw.cc(dpwk.class, dpwkVar);
    }

    private dpwk() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003ဉ\u0002", new Object[]{"e", "a", "b", "c"});
            }
            if (i2 == 3) {
                return new dpwk();
            }
            if (i2 == 4) {
                return new dpwj();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dpwk> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dpwk.class) {
                    dssrVar = f;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(d);
                        f = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
