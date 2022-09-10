package defpackage;
/* compiled from: PG */
/* renamed from: djjx  reason: default package */
/* loaded from: classes6.dex */
public final class djjx extends dsqw<djjx, djjw> implements dssk {
    public static final djjx d;
    private static volatile dssr<djjx> e;
    public int a;
    public djjv b;
    public djjv c;

    static {
        djjx djjxVar = new djjx();
        d = djjxVar;
        dsqw.cc(djjx.class, djjxVar);
    }

    private djjx() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"a", "b", "c"});
            }
            if (i2 == 3) {
                return new djjx();
            }
            if (i2 == 4) {
                return new djjw();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<djjx> dssrVar = e;
            if (dssrVar == null) {
                synchronized (djjx.class) {
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
