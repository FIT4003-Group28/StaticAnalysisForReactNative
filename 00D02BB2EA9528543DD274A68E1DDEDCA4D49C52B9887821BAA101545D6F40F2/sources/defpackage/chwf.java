package defpackage;
/* compiled from: PG */
/* renamed from: chwf  reason: default package */
/* loaded from: classes4.dex */
public final class chwf extends dsqw<chwf, chwe> implements dssk {
    public static final chwf c;
    private static volatile dssr<chwf> d;
    public int a;
    public dnjp b;

    static {
        chwf chwfVar = new chwf();
        c = chwfVar;
        dsqw.cc(chwf.class, chwfVar);
    }

    private chwf() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"a", "b"});
            }
            if (i2 == 3) {
                return new chwf();
            }
            if (i2 == 4) {
                return new chwe();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<chwf> dssrVar = d;
            if (dssrVar == null) {
                synchronized (chwf.class) {
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
