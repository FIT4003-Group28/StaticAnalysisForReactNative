package defpackage;
/* compiled from: PG */
/* renamed from: dpgf  reason: default package */
/* loaded from: classes6.dex */
public final class dpgf extends dsqw<dpgf, dpga> implements dssk {
    public static final dpgf c;
    private static volatile dssr<dpgf> e;
    public int a;
    public dsrj<dpgc> b = dssu.b;
    private int d;

    static {
        dpgf dpgfVar = new dpgf();
        c = dpgfVar;
        dsqw.cc(dpgf.class, dpgfVar);
    }

    private dpgf() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဌ\u0000\u0002\u001b", new Object[]{"d", "a", dpge.c(), "b", dpgc.class});
            }
            if (i2 == 3) {
                return new dpgf();
            }
            if (i2 == 4) {
                return new dpga();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dpgf> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dpgf.class) {
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
