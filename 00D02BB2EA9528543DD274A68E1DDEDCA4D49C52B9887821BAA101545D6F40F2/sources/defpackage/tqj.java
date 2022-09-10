package defpackage;
/* compiled from: PG */
/* renamed from: tqj  reason: default package */
/* loaded from: classes7.dex */
public final class tqj extends dsqw<tqj, tqi> implements dssk {
    public static final tqj b;
    private static volatile dssr<tqj> c;
    public dsrj<tnx> a = dssu.b;

    static {
        tqj tqjVar = new tqj();
        b = tqjVar;
        dsqw.cc(tqj.class, tqjVar);
    }

    private tqj() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", tnx.class});
            }
            if (i2 == 3) {
                return new tqj();
            }
            if (i2 == 4) {
                return new tqi();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<tqj> dssrVar = c;
            if (dssrVar == null) {
                synchronized (tqj.class) {
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
