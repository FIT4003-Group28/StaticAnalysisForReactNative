package defpackage;
/* compiled from: PG */
/* renamed from: cyjf  reason: default package */
/* loaded from: classes5.dex */
public final class cyjf extends dsqw<cyjf, cyiy> implements dssk {
    public static final cyjf c;
    private static volatile dssr<cyjf> d;
    public int a = 0;
    public Object b;

    static {
        cyjf cyjfVar = new cyjf();
        c = cyjfVar;
        dsqw.cc(cyjf.class, cyjfVar);
    }

    private cyjf() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0000\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000", new Object[]{"b", "a", cyja.class, cyje.class});
            }
            if (i2 == 3) {
                return new cyjf();
            }
            if (i2 == 4) {
                return new cyiy();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<cyjf> dssrVar = d;
            if (dssrVar == null) {
                synchronized (cyjf.class) {
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
