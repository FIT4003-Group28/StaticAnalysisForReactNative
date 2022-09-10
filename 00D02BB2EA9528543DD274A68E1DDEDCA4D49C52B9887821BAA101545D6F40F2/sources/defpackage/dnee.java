package defpackage;
/* compiled from: PG */
/* renamed from: dnee  reason: default package */
/* loaded from: classes6.dex */
public final class dnee extends dsqw<dnee, dned> implements dssk {
    public static final dnee e;
    private static volatile dssr<dnee> f;
    public int a;
    public int b = 0;
    public Object c;
    public int d;

    static {
        dnee dneeVar = new dnee();
        e = dneeVar;
        dsqw.cc(dnee.class, dneeVar);
    }

    private dnee() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(e, "\u0001\u0004\u0001\u0001\u0002\u0005\u0004\u0000\u0000\u0000\u0002ြ\u0000\u0003ြ\u0000\u0004ြ\u0000\u0005ဌ\u0003", new Object[]{"c", "b", "a", dntc.class, dnjs.class, dnke.class, "d", dnec.a});
            }
            if (i2 == 3) {
                return new dnee();
            }
            if (i2 == 4) {
                return new dned();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dnee> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dnee.class) {
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
