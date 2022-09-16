package defpackage;
/* compiled from: PG */
/* renamed from: ckzq  reason: default package */
/* loaded from: classes5.dex */
public final class ckzq extends dsqw<ckzq, ckzh> implements dssk {
    public static final ckzq e;
    private static volatile dssr<ckzq> g;
    public int a;
    public ckzp b;
    public ckzn c;
    public int d = -1;
    private int f;

    static {
        ckzq ckzqVar = new ckzq();
        e = ckzqVar;
        dsqw.cc(ckzq.class, ckzqVar);
    }

    private ckzq() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(e, "\u0001\u0004\u0000\u0001\u0001\u0007\u0004\u0000\u0000\u0000\u0001င\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0007ဌ\u0005", new Object[]{"f", "a", "b", "c", "d", csfj.a});
            }
            if (i2 == 3) {
                return new ckzq();
            }
            if (i2 == 4) {
                return new ckzh();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<ckzq> dssrVar = g;
            if (dssrVar == null) {
                synchronized (ckzq.class) {
                    dssrVar = g;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(e);
                        g = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
