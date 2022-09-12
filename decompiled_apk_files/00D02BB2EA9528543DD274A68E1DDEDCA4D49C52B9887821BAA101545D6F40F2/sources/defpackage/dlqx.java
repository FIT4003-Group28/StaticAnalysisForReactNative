package defpackage;
/* compiled from: PG */
/* renamed from: dlqx  reason: default package */
/* loaded from: classes6.dex */
public final class dlqx extends dsqw<dlqx, dlqv> implements dssk {
    public static final dlqx d;
    private static volatile dssr<dlqx> e;
    public int a;
    public int b;
    public int c;

    static {
        dlqx dlqxVar = new dlqx();
        d = dlqxVar;
        dsqw.cc(dlqx.class, dlqxVar);
    }

    private dlqx() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002င\u0001", new Object[]{"a", "b", dlqw.a, "c"});
            }
            if (i2 == 3) {
                return new dlqx();
            }
            if (i2 == 4) {
                return new dlqv();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dlqx> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dlqx.class) {
                    dssrVar = e;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(d);
                        e = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
