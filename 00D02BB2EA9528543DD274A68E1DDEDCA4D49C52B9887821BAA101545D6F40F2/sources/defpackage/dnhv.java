package defpackage;
/* compiled from: PG */
/* renamed from: dnhv  reason: default package */
/* loaded from: classes6.dex */
public final class dnhv extends dsqw<dnhv, dnhu> implements dssk {
    public static final dnhv c;
    private static volatile dssr<dnhv> d;
    public int a = 0;
    public Object b;

    static {
        dnhv dnhvVar = new dnhv();
        c = dnhvVar;
        dsqw.cc(dnhv.class, dnhvVar);
    }

    private dnhv() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001့\u0000\u0002ျ\u0000", new Object[]{"b", "a"});
            }
            if (i2 == 3) {
                return new dnhv();
            }
            if (i2 == 4) {
                return new dnhu();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dnhv> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dnhv.class) {
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
