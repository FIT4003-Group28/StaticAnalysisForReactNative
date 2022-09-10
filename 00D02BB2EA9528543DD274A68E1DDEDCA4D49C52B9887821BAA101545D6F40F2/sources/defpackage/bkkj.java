package defpackage;
/* compiled from: PG */
/* renamed from: bkkj  reason: default package */
/* loaded from: classes3.dex */
public final class bkkj extends dsqw<bkkj, bkki> implements dssk {
    public static final bkkj b;
    private static volatile dssr<bkkj> c;
    public dsrj<bkkh> a = dssu.b;

    static {
        bkkj bkkjVar = new bkkj();
        b = bkkjVar;
        dsqw.cc(bkkj.class, bkkjVar);
    }

    private bkkj() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", bkkh.class});
            }
            if (i2 == 3) {
                return new bkkj();
            }
            if (i2 == 4) {
                return new bkki();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<bkkj> dssrVar = c;
            if (dssrVar == null) {
                synchronized (bkkj.class) {
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
