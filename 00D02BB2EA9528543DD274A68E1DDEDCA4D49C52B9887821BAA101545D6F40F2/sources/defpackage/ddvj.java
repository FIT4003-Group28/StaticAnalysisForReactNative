package defpackage;
/* compiled from: PG */
/* renamed from: ddvj  reason: default package */
/* loaded from: classes6.dex */
public final class ddvj extends dsqw<ddvj, ddvi> implements dssk {
    public static final ddvj f;
    private static volatile dssr<ddvj> g;
    public int a;
    public long b;
    public boolean c;
    public boolean d;
    public boolean e;

    static {
        ddvj ddvjVar = new ddvj();
        f = ddvjVar;
        dsqw.cc(ddvj.class, ddvjVar);
    }

    private ddvj() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004ဇ\u0003", new Object[]{"a", "b", "c", "d", "e"});
            }
            if (i2 == 3) {
                return new ddvj();
            }
            if (i2 == 4) {
                return new ddvi();
            }
            if (i2 == 5) {
                return f;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<ddvj> dssrVar = g;
            if (dssrVar == null) {
                synchronized (ddvj.class) {
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
