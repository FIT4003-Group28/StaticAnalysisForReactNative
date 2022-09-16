package defpackage;
/* compiled from: PG */
/* renamed from: tqp  reason: default package */
/* loaded from: classes7.dex */
public final class tqp extends dsqw<tqp, tqo> implements dssk {
    public static final tqp c;
    private static volatile dssr<tqp> d;
    public int a;
    public int b;

    static {
        tqp tqpVar = new tqp();
        c = tqpVar;
        dsqw.cc(tqp.class, tqpVar);
    }

    private tqp() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"a", "b", tob.c()});
            }
            if (i2 == 3) {
                return new tqp();
            }
            if (i2 == 4) {
                return new tqo();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<tqp> dssrVar = d;
            if (dssrVar == null) {
                synchronized (tqp.class) {
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
