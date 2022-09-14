package defpackage;
/* compiled from: PG */
/* renamed from: dnqz  reason: default package */
/* loaded from: classes6.dex */
public final class dnqz extends dsqw<dnqz, dnqy> implements dssk {
    public static final dnqz e;
    private static volatile dssr<dnqz> f;
    public int a;
    public dnsc b;
    public dnsc c;
    public dnqm d;

    static {
        dnqz dnqzVar = new dnqz();
        e = dnqzVar;
        dsqw.cc(dnqz.class, dnqzVar);
    }

    private dnqz() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new Object[]{"a", "b", "c", "d"});
            }
            if (i2 == 3) {
                return new dnqz();
            }
            if (i2 == 4) {
                return new dnqy();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dnqz> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dnqz.class) {
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
