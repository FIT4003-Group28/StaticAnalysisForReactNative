package defpackage;
/* compiled from: PG */
/* renamed from: dpgj  reason: default package */
/* loaded from: classes6.dex */
public final class dpgj extends dsqw<dpgj, dpgi> implements dssk {
    public static final dpgj b;
    private static volatile dssr<dpgj> c;
    public dsrj<doxp> a = dssu.b;

    static {
        dpgj dpgjVar = new dpgj();
        b = dpgjVar;
        dsqw.cc(dpgj.class, dpgjVar);
    }

    private dpgj() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", doxp.class});
            }
            if (i2 == 3) {
                return new dpgj();
            }
            if (i2 == 4) {
                return new dpgi();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dpgj> dssrVar = c;
            if (dssrVar == null) {
                synchronized (dpgj.class) {
                    dssrVar = c;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(b);
                        c = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
