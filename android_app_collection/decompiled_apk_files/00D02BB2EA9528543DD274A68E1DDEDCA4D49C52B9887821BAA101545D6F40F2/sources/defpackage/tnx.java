package defpackage;
/* compiled from: PG */
/* renamed from: tnx  reason: default package */
/* loaded from: classes7.dex */
public final class tnx extends dsqw<tnx, tnw> implements dssk {
    public static final tnx c;
    private static volatile dssr<tnx> d;
    public int a = 0;
    public Object b;

    static {
        tnx tnxVar = new tnx();
        c = tnxVar;
        dsqw.cc(tnx.class, tnxVar);
    }

    private tnx() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဿ\u0000\u0002ဿ\u0000", new Object[]{"b", "a", dqvh.c(), drsm.c()});
            }
            if (i2 == 3) {
                return new tnx();
            }
            if (i2 == 4) {
                return new tnw();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<tnx> dssrVar = d;
            if (dssrVar == null) {
                synchronized (tnx.class) {
                    dssrVar = d;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(c);
                        d = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
