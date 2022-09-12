package defpackage;
/* compiled from: PG */
/* renamed from: dvky  reason: default package */
/* loaded from: classes.dex */
public final class dvky extends dsqw<dvky, dvkx> implements dssk {
    public static final dvky b;
    private static volatile dssr<dvky> d;
    public boolean a;
    private int c;

    static {
        dvky dvkyVar = new dvky();
        b = dvkyVar;
        dsqw.cc(dvky.class, dvkyVar);
    }

    private dvky() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဇ\u0000", new Object[]{"c", "a"});
            }
            if (i2 == 3) {
                return new dvky();
            }
            if (i2 == 4) {
                return new dvkx();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dvky> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dvky.class) {
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
