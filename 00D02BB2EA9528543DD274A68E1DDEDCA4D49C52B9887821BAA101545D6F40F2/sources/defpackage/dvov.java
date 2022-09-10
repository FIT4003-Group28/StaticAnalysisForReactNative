package defpackage;
/* compiled from: PG */
/* renamed from: dvov  reason: default package */
/* loaded from: classes.dex */
public final class dvov extends dsqw<dvov, dvos> implements dssk {
    public static final dvov e;
    private static volatile dssr<dvov> f;
    public int a;
    public int b;
    public dsrj<dspd> c = dssu.b;
    public dsrj<String> d = dssu.b;

    static {
        dvov dvovVar = new dvov();
        e = dvovVar;
        dsqw.cc(dvov.class, dvovVar);
    }

    private dvov() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0002\u0000\u0001ဌ\u0000\u0002\u001c\u0003\u001a", new Object[]{"a", "b", dvou.a(), "c", "d"});
            }
            if (i2 == 3) {
                return new dvov();
            }
            if (i2 == 4) {
                return new dvos();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dvov> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dvov.class) {
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
