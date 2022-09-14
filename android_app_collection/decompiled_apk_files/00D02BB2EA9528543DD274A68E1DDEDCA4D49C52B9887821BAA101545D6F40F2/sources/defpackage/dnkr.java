package defpackage;
/* compiled from: PG */
/* renamed from: dnkr  reason: default package */
/* loaded from: classes6.dex */
public final class dnkr extends dsqw<dnkr, dnkq> implements dssk {
    public static final dnkr c;
    private static volatile dssr<dnkr> d;
    public int a;
    public int b;

    static {
        dnkr dnkrVar = new dnkr();
        c = dnkrVar;
        dsqw.cc(dnkr.class, dnkrVar);
    }

    private dnkr() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001င\u0000", new Object[]{"a", "b"});
            }
            if (i2 == 3) {
                return new dnkr();
            }
            if (i2 == 4) {
                return new dnkq();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dnkr> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dnkr.class) {
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
