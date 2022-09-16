package defpackage;
/* compiled from: PG */
/* renamed from: dkpy  reason: default package */
/* loaded from: classes.dex */
public final class dkpy extends dsqw<dkpy, dkpx> implements dssk {
    public static final dkpy b;
    private static volatile dssr<dkpy> d;
    public int a;
    private int c;

    static {
        dkpy dkpyVar = new dkpy();
        b = dkpyVar;
        dsqw.cc(dkpy.class, dkpyVar);
    }

    private dkpy() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"c", "a", dpyv.c()});
            }
            if (i2 == 3) {
                return new dkpy();
            }
            if (i2 == 4) {
                return new dkpx();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dkpy> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dkpy.class) {
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
