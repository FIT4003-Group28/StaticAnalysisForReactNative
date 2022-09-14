package defpackage;
/* compiled from: PG */
/* renamed from: dntu  reason: default package */
/* loaded from: classes6.dex */
public final class dntu extends dsqw<dntu, dntt> implements dssk {
    public static final dntu e;
    private static volatile dssr<dntu> f;
    public int a;
    public int b;
    public drbv c;
    public String d = "";

    static {
        dntu dntuVar = new dntu();
        e = dntuVar;
        dsqw.cc(dntu.class, dntuVar);
    }

    private dntu() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဉ\u0001\u0003ဈ\u0002", new Object[]{"a", "b", dqvj.d(), "c", "d"});
            }
            if (i2 == 3) {
                return new dntu();
            }
            if (i2 == 4) {
                return new dntt();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dntu> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dntu.class) {
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
