package defpackage;
/* compiled from: PG */
/* renamed from: dtlf  reason: default package */
/* loaded from: classes6.dex */
public final class dtlf extends dsqw<dtlf, dtlc> implements dssk {
    public static final dtlf f;
    private static volatile dssr<dtlf> g;
    public int a;
    public int b;
    public dtlb c;
    public boolean d;
    public boolean e;

    static {
        dtlf dtlfVar = new dtlf();
        f = dtlfVar;
        dsqw.cc(dtlf.class, dtlfVar);
    }

    private dtlf() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဉ\u0001\u0003ဇ\u0002\u0004ဇ\u0003", new Object[]{"a", "b", dtle.c(), "c", "d", "e"});
            }
            if (i2 == 3) {
                return new dtlf();
            }
            if (i2 == 4) {
                return new dtlc();
            }
            if (i2 == 5) {
                return f;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dtlf> dssrVar = g;
            if (dssrVar == null) {
                synchronized (dtlf.class) {
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
