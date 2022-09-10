package defpackage;
/* compiled from: PG */
/* renamed from: dvkp  reason: default package */
/* loaded from: classes.dex */
public final class dvkp extends dsqw<dvkp, dvkg> implements dssk {
    public static final dvkp e;
    private static volatile dssr<dvkp> f;
    public int a;
    public dvko b;
    public dvko c;
    public dvkk d;

    static {
        dvkp dvkpVar = new dvkp();
        e = dvkpVar;
        dsqw.cc(dvkp.class, dvkpVar);
    }

    private dvkp() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new Object[]{"a", "b", "c", "d"});
            }
            if (i2 == 3) {
                return new dvkp();
            }
            if (i2 == 4) {
                return new dvkg();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dvkp> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dvkp.class) {
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
