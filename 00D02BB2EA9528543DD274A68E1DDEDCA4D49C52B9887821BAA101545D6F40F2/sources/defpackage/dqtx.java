package defpackage;
/* compiled from: PG */
/* renamed from: dqtx  reason: default package */
/* loaded from: classes6.dex */
public final class dqtx extends dsqw<dqtx, dqtw> implements dssk {
    public static final dqtx b;
    private static volatile dssr<dqtx> d;
    public int a;
    private int c;

    static {
        dqtx dqtxVar = new dqtx();
        b = dqtxVar;
        dsqw.cc(dqtx.class, dqtxVar);
    }

    private dqtx() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001င\u0000", new Object[]{"c", "a"});
            }
            if (i2 == 3) {
                return new dqtx();
            }
            if (i2 == 4) {
                return new dqtw();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dqtx> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dqtx.class) {
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
