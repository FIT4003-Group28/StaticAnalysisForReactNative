package defpackage;
/* compiled from: PG */
/* renamed from: dtfj  reason: default package */
/* loaded from: classes6.dex */
public final class dtfj extends dsqw<dtfj, dtfi> implements dssk {
    public static final dtfj a;
    private static volatile dssr<dtfj> b;

    static {
        dtfj dtfjVar = new dtfj();
        a = dtfjVar;
        dsqw.cc(dtfj.class, dtfjVar);
    }

    private dtfj() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(a, "\u0001\u0000", null);
            }
            if (i2 == 3) {
                return new dtfj();
            }
            if (i2 == 4) {
                return new dtfi();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dtfj> dssrVar = b;
            if (dssrVar == null) {
                synchronized (dtfj.class) {
                    dssrVar = b;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(a);
                        b = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
