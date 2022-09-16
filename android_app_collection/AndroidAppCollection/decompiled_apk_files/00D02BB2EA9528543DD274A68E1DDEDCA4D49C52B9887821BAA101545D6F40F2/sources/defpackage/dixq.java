package defpackage;
/* compiled from: PG */
/* renamed from: dixq  reason: default package */
/* loaded from: classes6.dex */
public final class dixq extends dsqw<dixq, dixp> implements dssk {
    public static final dixq e;
    private static volatile dssr<dixq> f;
    public int a;
    public int b;
    public int c;
    public int d;

    static {
        dixq dixqVar = new dixq();
        e = dixqVar;
        dsqw.cc(dixq.class, dixqVar);
    }

    private dixq() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003ဏ\u0002", new Object[]{"a", "b", "c", "d"});
            }
            if (i2 == 3) {
                return new dixq();
            }
            if (i2 == 4) {
                return new dixp();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dixq> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dixq.class) {
                    dssrVar = f;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(e);
                        f = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
