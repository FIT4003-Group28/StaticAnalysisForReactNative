package defpackage;
/* compiled from: PG */
/* renamed from: cpzr  reason: default package */
/* loaded from: classes5.dex */
public final class cpzr extends dsqw<cpzr, cpzq> implements dssk {
    public static final cpzr b;
    private static volatile dssr<cpzr> c;
    public dsrj<cpzp> a = dssu.b;

    static {
        cpzr cpzrVar = new cpzr();
        b = cpzrVar;
        dsqw.cc(cpzr.class, cpzrVar);
    }

    private cpzr() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", cpzp.class});
            }
            if (i2 == 3) {
                return new cpzr();
            }
            if (i2 == 4) {
                return new cpzq();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<cpzr> dssrVar = c;
            if (dssrVar == null) {
                synchronized (cpzr.class) {
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
