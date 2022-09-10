package defpackage;
/* compiled from: PG */
/* renamed from: dnio  reason: default package */
/* loaded from: classes.dex */
public final class dnio extends dsqw<dnio, dnil> implements dssk {
    public static final dnio e;
    private static volatile dssr<dnio> f;
    public int a;
    public dgas b;
    public dgas c;
    public dnin d;

    static {
        dnio dnioVar = new dnio();
        e = dnioVar;
        dsqw.cc(dnio.class, dnioVar);
    }

    private dnio() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(e, "\u0001\u0003\u0000\u0001\u0003\u0007\u0003\u0000\u0000\u0000\u0003ဉ\u0003\u0006ဉ\u0004\u0007ဉ\u0006", new Object[]{"a", "b", "c", "d"});
            }
            if (i2 == 3) {
                return new dnio();
            }
            if (i2 == 4) {
                return new dnil();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dnio> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dnio.class) {
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
