package defpackage;
/* compiled from: PG */
/* renamed from: cymg  reason: default package */
/* loaded from: classes5.dex */
public final class cymg extends dsqw<cymg, cyma> implements dssk {
    public static final cymg d;
    private static volatile dssr<cymg> e;
    public int a = 0;
    public Object b;
    public int c;

    static {
        cymg cymgVar = new cymg();
        d = cymgVar;
        dsqw.cc(cymg.class, cymgVar);
    }

    private cymg() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0000\u0004\u0001\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\f\u0002<\u0000\u0003<\u0000\u0004<\u0000", new Object[]{"b", "a", "c", cylo.class, cyke.class, cyme.class});
            }
            if (i2 == 3) {
                return new cymg();
            }
            if (i2 == 4) {
                return new cyma();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<cymg> dssrVar = e;
            if (dssrVar == null) {
                synchronized (cymg.class) {
                    dssrVar = e;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(d);
                        e = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
