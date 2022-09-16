package defpackage;
/* compiled from: PG */
/* renamed from: dvli  reason: default package */
/* loaded from: classes.dex */
public final class dvli extends dsqw<dvli, dvlf> implements dssk {
    public static final dvli e;
    private static volatile dssr<dvli> f;
    public int a;
    public float b;
    public int c = 1;
    public boolean d;

    static {
        dvli dvliVar = new dvli();
        e = dvliVar;
        dsqw.cc(dvli.class, dvliVar);
    }

    private dvli() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ခ\u0000\u0002ဌ\u0001\u0003ဇ\u0002", new Object[]{"a", "b", "c", dvlg.a, "d"});
            }
            if (i2 == 3) {
                return new dvli();
            }
            if (i2 == 4) {
                return new dvlf();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dvli> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dvli.class) {
                    dssrVar = f;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(e);
                        f = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
