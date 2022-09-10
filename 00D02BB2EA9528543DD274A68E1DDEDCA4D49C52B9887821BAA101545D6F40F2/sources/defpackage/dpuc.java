package defpackage;
/* compiled from: PG */
/* renamed from: dpuc  reason: default package */
/* loaded from: classes6.dex */
public final class dpuc extends dsqw<dpuc, dpub> implements dssk {
    public static final dpuc c;
    private static volatile dssr<dpuc> d;
    public int a;
    public long b;

    static {
        dpuc dpucVar = new dpuc();
        c = dpucVar;
        dsqw.cc(dpuc.class, dpucVar);
    }

    private dpuc() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဂ\u0000", new Object[]{"a", "b"});
            }
            if (i2 == 3) {
                return new dpuc();
            }
            if (i2 == 4) {
                return new dpub();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dpuc> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dpuc.class) {
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
