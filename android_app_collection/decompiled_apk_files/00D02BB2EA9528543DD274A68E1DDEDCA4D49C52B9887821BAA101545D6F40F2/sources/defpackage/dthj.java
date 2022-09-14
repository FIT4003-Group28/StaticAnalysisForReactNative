package defpackage;
/* compiled from: PG */
/* renamed from: dthj  reason: default package */
/* loaded from: classes6.dex */
public final class dthj extends dsqw<dthj, dthi> implements dssk {
    public static final dthj b;
    private static volatile dssr<dthj> c;
    public dsri a = dsrx.b;

    static {
        dthj dthjVar = new dthj();
        b = dthjVar;
        dsqw.cc(dthj.class, dthjVar);
    }

    private dthj() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0014", new Object[]{"a"});
            }
            if (i2 == 3) {
                return new dthj();
            }
            if (i2 == 4) {
                return new dthi();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dthj> dssrVar = c;
            if (dssrVar == null) {
                synchronized (dthj.class) {
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
