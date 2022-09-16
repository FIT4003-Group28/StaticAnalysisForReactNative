package defpackage;
/* compiled from: PG */
/* renamed from: dvjz  reason: default package */
/* loaded from: classes.dex */
public final class dvjz extends dsqw<dvjz, dvjy> implements dssk {
    public static final dvjz c;
    private static volatile dssr<dvjz> e;
    public int a;
    public boolean b;
    private int d;

    static {
        dvjz dvjzVar = new dvjz();
        c = dvjzVar;
        dsqw.cc(dvjz.class, dvjzVar);
    }

    private dvjz() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002ဇ\u0001", new Object[]{"d", "a", "b"});
            }
            if (i2 == 3) {
                return new dvjz();
            }
            if (i2 == 4) {
                return new dvjy();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dvjz> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dvjz.class) {
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
