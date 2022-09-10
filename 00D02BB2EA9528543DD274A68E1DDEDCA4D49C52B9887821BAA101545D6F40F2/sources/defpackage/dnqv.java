package defpackage;
/* compiled from: PG */
/* renamed from: dnqv  reason: default package */
/* loaded from: classes6.dex */
public final class dnqv extends dsqw<dnqv, dnqu> implements dssk {
    public static final dnqv f;
    private static volatile dssr<dnqv> g;
    public int a;
    public int b = 0;
    public Object c;
    public dnhz d;
    public dnqq e;

    static {
        dnqv dnqvVar = new dnqv();
        f = dnqvVar;
        dsqw.cc(dnqv.class, dnqvVar);
    }

    private dnqv() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(f, "\u0001\u0003\u0001\u0001\u0001\u0006\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ြ\u0000\u0006ဉ\u0003", new Object[]{"c", "b", "a", "d", dnzl.class, "e"});
            }
            if (i2 == 3) {
                return new dnqv();
            }
            if (i2 == 4) {
                return new dnqu();
            }
            if (i2 == 5) {
                return f;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dnqv> dssrVar = g;
            if (dssrVar == null) {
                synchronized (dnqv.class) {
                    dssrVar = g;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(f);
                        g = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
