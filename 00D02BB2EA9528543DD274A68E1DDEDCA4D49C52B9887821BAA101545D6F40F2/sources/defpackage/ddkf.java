package defpackage;
/* compiled from: PG */
/* renamed from: ddkf  reason: default package */
/* loaded from: classes.dex */
public final class ddkf extends dsqw<ddkf, ddke> implements dssk {
    public static final ddkf d;
    private static volatile dssr<ddkf> e;
    public int a;
    public int b;
    public boolean c;

    static {
        ddkf ddkfVar = new ddkf();
        d = ddkfVar;
        dsqw.cc(ddkf.class, ddkfVar);
    }

    private ddkf() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဇ\u0001", new Object[]{"a", "b", aufo.c(), "c"});
            }
            if (i2 == 3) {
                return new ddkf();
            }
            if (i2 == 4) {
                return new ddke();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<ddkf> dssrVar = e;
            if (dssrVar == null) {
                synchronized (ddkf.class) {
                    dssrVar = e;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(d);
                        e = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
