package defpackage;
/* compiled from: PG */
/* renamed from: tqr  reason: default package */
/* loaded from: classes7.dex */
public final class tqr extends dsqw<tqr, tqq> implements dssk {
    public static final tqr b;
    private static volatile dssr<tqr> c;
    public dsrj<tqp> a = dssu.b;

    static {
        tqr tqrVar = new tqr();
        b = tqrVar;
        dsqw.cc(tqr.class, tqrVar);
    }

    private tqr() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", tqp.class});
            }
            if (i2 == 3) {
                return new tqr();
            }
            if (i2 == 4) {
                return new tqq();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<tqr> dssrVar = c;
            if (dssrVar == null) {
                synchronized (tqr.class) {
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
