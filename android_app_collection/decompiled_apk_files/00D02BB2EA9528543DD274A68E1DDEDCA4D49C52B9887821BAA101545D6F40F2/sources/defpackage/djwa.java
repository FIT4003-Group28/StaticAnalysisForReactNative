package defpackage;
/* compiled from: PG */
/* renamed from: djwa  reason: default package */
/* loaded from: classes6.dex */
public final class djwa extends dsqw<djwa, djvx> implements dssk {
    public static final djwa d;
    private static volatile dssr<djwa> e;
    public int a;
    public int b;
    public djvt c;

    static {
        djwa djwaVar = new djwa();
        d = djwaVar;
        dsqw.cc(djwa.class, djwaVar);
    }

    private djwa() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0003ဉ\u0002", new Object[]{"a", "b", djvy.a, "c"});
            }
            if (i2 == 3) {
                return new djwa();
            }
            if (i2 == 4) {
                return new djvx();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<djwa> dssrVar = e;
            if (dssrVar == null) {
                synchronized (djwa.class) {
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
