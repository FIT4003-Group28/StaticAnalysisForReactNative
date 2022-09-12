package defpackage;
/* compiled from: PG */
/* renamed from: dqrx  reason: default package */
/* loaded from: classes6.dex */
public final class dqrx extends dsqw<dqrx, dqrw> implements dssk {
    public static final dqrx a;
    private static volatile dssr<dqrx> b;

    static {
        dqrx dqrxVar = new dqrx();
        a = dqrxVar;
        dsqw.cc(dqrx.class, dqrxVar);
    }

    private dqrx() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(a, "\u0001\u0000", null);
            }
            if (i2 == 3) {
                return new dqrx();
            }
            if (i2 == 4) {
                return new dqrw();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dqrx> dssrVar = b;
            if (dssrVar == null) {
                synchronized (dqrx.class) {
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
