package defpackage;
/* compiled from: PG */
/* renamed from: djqp  reason: default package */
/* loaded from: classes6.dex */
public final class djqp extends dsqw<djqp, djqo> implements dssk {
    public static final djqp c;
    private static volatile dssr<djqp> d;
    public int a;
    public dquf b;

    static {
        djqp djqpVar = new djqp();
        c = djqpVar;
        dsqw.cc(djqp.class, djqpVar);
    }

    private djqp() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"a", "b"});
            }
            if (i2 == 3) {
                return new djqp();
            }
            if (i2 == 4) {
                return new djqo();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<djqp> dssrVar = d;
            if (dssrVar == null) {
                synchronized (djqp.class) {
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
