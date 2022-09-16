package defpackage;
/* compiled from: PG */
/* renamed from: dgzn  reason: default package */
/* loaded from: classes6.dex */
public final class dgzn extends dsqw<dgzn, dgzm> implements dssk {
    public static final dgzn c;
    private static volatile dssr<dgzn> d;
    public int a;
    public dgyx b;

    static {
        dgzn dgznVar = new dgzn();
        c = dgznVar;
        dsqw.cc(dgzn.class, dgznVar);
    }

    private dgzn() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0016\u0016\u0001\u0000\u0000\u0000\u0016ဉ\u000b", new Object[]{"a", "b"});
            }
            if (i2 == 3) {
                return new dgzn();
            }
            if (i2 == 4) {
                return new dgzm();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dgzn> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dgzn.class) {
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
