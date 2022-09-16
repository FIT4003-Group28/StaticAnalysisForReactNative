package defpackage;
/* compiled from: PG */
/* renamed from: dvdb  reason: default package */
/* loaded from: classes.dex */
public final class dvdb extends dsqw<dvdb, dvda> implements dssk {
    public static final dvdb e;
    private static volatile dssr<dvdb> h;
    public int a;
    public int b;
    public int c;
    private int f;
    private byte g = 2;
    public dsrf d = dsqz.b;

    static {
        dvdb dvdbVar = new dvdb();
        e = dvdbVar;
        dsqw.cc(dvdb.class, dvdbVar);
    }

    private dvdb() {
        dssu<Object> dssuVar = dssu.b;
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(e, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0003\u0001\u0016\u0002ᔄ\u0000\u0003ᔄ\u0001\u0004ᔄ\u0002", new Object[]{"f", "d", "a", "b", "c"});
            }
            if (i2 == 3) {
                return new dvdb();
            }
            if (i2 == 4) {
                return new dvda();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.g = b;
                return null;
            }
            dssr<dvdb> dssrVar = h;
            if (dssrVar == null) {
                synchronized (dvdb.class) {
                    dssrVar = h;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(e);
                        h = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.g);
    }
}
