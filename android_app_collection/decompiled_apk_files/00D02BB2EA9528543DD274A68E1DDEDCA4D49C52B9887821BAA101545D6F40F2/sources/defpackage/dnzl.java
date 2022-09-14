package defpackage;
/* compiled from: PG */
/* renamed from: dnzl  reason: default package */
/* loaded from: classes6.dex */
public final class dnzl extends dsqw<dnzl, dnzk> implements dssk {
    public static final dnzl c;
    private static volatile dssr<dnzl> d;
    public int a;
    public dniu b;

    static {
        dnzl dnzlVar = new dnzl();
        c = dnzlVar;
        dsqw.cc(dnzl.class, dnzlVar);
    }

    private dnzl() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"a", "b"});
            }
            if (i2 == 3) {
                return new dnzl();
            }
            if (i2 == 4) {
                return new dnzk();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dnzl> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dnzl.class) {
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
