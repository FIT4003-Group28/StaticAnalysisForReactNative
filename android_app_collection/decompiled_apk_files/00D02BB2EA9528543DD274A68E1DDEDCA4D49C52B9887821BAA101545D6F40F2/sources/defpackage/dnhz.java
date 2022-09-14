package defpackage;
/* compiled from: PG */
/* renamed from: dnhz  reason: default package */
/* loaded from: classes6.dex */
public final class dnhz extends dsqw<dnhz, dnhy> implements dssk {
    public static final dnhz e;
    private static volatile dssr<dnhz> f;
    public int a;
    public dngs b;
    public dnib c;
    public long d;

    static {
        dnhz dnhzVar = new dnhz();
        e = dnhzVar;
        dsqw.cc(dnhz.class, dnhzVar);
    }

    private dnhz() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(e, "\u0001\u0003\u0000\u0001\u0001\u0005\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0005ဂ\u0002", new Object[]{"a", "b", "c", "d"});
            }
            if (i2 == 3) {
                return new dnhz();
            }
            if (i2 == 4) {
                return new dnhy();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dnhz> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dnhz.class) {
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
