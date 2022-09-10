package defpackage;
/* compiled from: PG */
/* renamed from: dhyf  reason: default package */
/* loaded from: classes6.dex */
public final class dhyf extends dsqw<dhyf, dhye> implements dssk {
    public static final dhyf c;
    private static volatile dssr<dhyf> d;
    public int a = 0;
    public Object b;

    static {
        dhyf dhyfVar = new dhyf();
        c = dhyfVar;
        dsqw.cc(dhyf.class, dhyfVar);
    }

    private dhyf() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001ြ\u0000", new Object[]{"b", "a", diiw.class});
            }
            if (i2 == 3) {
                return new dhyf();
            }
            if (i2 == 4) {
                return new dhye();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dhyf> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dhyf.class) {
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
