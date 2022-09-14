package defpackage;
/* compiled from: PG */
/* renamed from: djbf  reason: default package */
/* loaded from: classes6.dex */
public final class djbf extends dsqw<djbf, djbc> implements dssk {
    public static final djbf c;
    private static volatile dssr<djbf> e;
    public djai a;
    public int b;
    private int d;

    static {
        djbf djbfVar = new djbf();
        c = djbfVar;
        dsqw.cc(djbf.class, djbfVar);
    }

    private djbf() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0002\u0000\u0001\u0002\u0003\u0002\u0000\u0000\u0000\u0002ဉ\u0000\u0003ဌ\u0001", new Object[]{"d", "a", "b", djbd.a});
            }
            if (i2 == 3) {
                return new djbf();
            }
            if (i2 == 4) {
                return new djbc();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<djbf> dssrVar = e;
            if (dssrVar == null) {
                synchronized (djbf.class) {
                    dssrVar = e;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(c);
                        e = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
