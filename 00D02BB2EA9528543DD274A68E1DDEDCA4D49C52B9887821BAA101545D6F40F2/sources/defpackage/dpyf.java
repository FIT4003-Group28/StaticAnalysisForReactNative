package defpackage;
/* compiled from: PG */
/* renamed from: dpyf  reason: default package */
/* loaded from: classes6.dex */
public final class dpyf extends dsqw<dpyf, dpye> implements dssk {
    public static final dsrg<Integer, dpol> c = new dpyd();
    public static final dpyf f;
    private static volatile dssr<dpyf> g;
    public int a;
    public dsrf b = dsqz.b;
    public dsrf d = dsqz.b;
    public dptk e;

    static {
        dpyf dpyfVar = new dpyf();
        f = dpyfVar;
        dsqw.cc(dpyf.class, dpyfVar);
    }

    private dpyf() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(f, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0002\u0000\u0001\u001e\u0002\u0016\u0003ဉ\u0000", new Object[]{"a", "b", dpol.c(), "d", "e"});
            }
            if (i2 == 3) {
                return new dpyf();
            }
            if (i2 == 4) {
                return new dpye();
            }
            if (i2 == 5) {
                return f;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dpyf> dssrVar = g;
            if (dssrVar == null) {
                synchronized (dpyf.class) {
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

    public final void b() {
        dsrf dsrfVar = this.d;
        if (!dsrfVar.a()) {
            this.d = dsqw.cg(dsrfVar);
        }
    }
}
