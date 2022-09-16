package defpackage;
/* compiled from: PG */
/* renamed from: djyf  reason: default package */
/* loaded from: classes6.dex */
public final class djyf extends dsqw<djyf, djyc> implements dssk {
    public static final djyf b;
    private static volatile dssr<djyf> d;
    public int a;
    private int c;

    static {
        djyf djyfVar = new djyf();
        b = djyfVar;
        dsqw.cc(djyf.class, djyfVar);
    }

    private djyf() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"c", "a", djyd.a});
            }
            if (i2 == 3) {
                return new djyf();
            }
            if (i2 == 4) {
                return new djyc();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<djyf> dssrVar = d;
            if (dssrVar == null) {
                synchronized (djyf.class) {
                    dssrVar = d;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(b);
                        d = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
