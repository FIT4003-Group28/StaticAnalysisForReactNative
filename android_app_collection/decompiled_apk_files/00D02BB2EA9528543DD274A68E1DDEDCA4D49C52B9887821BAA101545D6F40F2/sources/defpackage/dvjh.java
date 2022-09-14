package defpackage;
/* compiled from: PG */
/* renamed from: dvjh  reason: default package */
/* loaded from: classes.dex */
public final class dvjh extends dsqw<dvjh, dvjg> implements dssk {
    public static final dvjh e;
    private static volatile dssr<dvjh> g;
    public int a;
    public dqpe b;
    public djyo c;
    public int d;
    private byte f = 2;

    static {
        dvjh dvjhVar = new dvjh();
        e = dvjhVar;
        dsqw.cc(dvjh.class, dvjhVar);
    }

    private dvjh() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0001\u0001ဉ\u0001\u0002ᐉ\u0002\u0003ဌ\u0003", new Object[]{"a", "b", "c", "d", drbs.a});
            }
            if (i2 == 3) {
                return new dvjh();
            }
            if (i2 == 4) {
                return new dvjg();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.f = b;
                return null;
            }
            dssr<dvjh> dssrVar = g;
            if (dssrVar == null) {
                synchronized (dvjh.class) {
                    dssrVar = g;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(e);
                        g = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.f);
    }
}
