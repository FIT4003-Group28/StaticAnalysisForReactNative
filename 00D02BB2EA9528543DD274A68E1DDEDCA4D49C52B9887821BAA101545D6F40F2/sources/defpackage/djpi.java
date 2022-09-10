package defpackage;
/* compiled from: PG */
/* renamed from: djpi  reason: default package */
/* loaded from: classes6.dex */
public final class djpi extends dsqw<djpi, djpf> implements dssk {
    public static final djpi e;
    private static volatile dssr<djpi> f;
    public int a;
    public drhj b;
    public drhx c;
    public djph d;

    static {
        djpi djpiVar = new djpi();
        e = djpiVar;
        dsqw.cc(djpi.class, djpiVar);
    }

    private djpi() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(e, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0003ဉ\u0001\u0004ဉ\u0002", new Object[]{"a", "b", "c", "d"});
            }
            if (i2 == 3) {
                return new djpi();
            }
            if (i2 == 4) {
                return new djpf();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<djpi> dssrVar = f;
            if (dssrVar == null) {
                synchronized (djpi.class) {
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
