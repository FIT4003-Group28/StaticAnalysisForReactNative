package defpackage;
/* compiled from: PG */
/* renamed from: dvav  reason: default package */
/* loaded from: classes6.dex */
public final class dvav extends dsqw<dvav, dvau> implements dssk {
    public static final dvav e;
    private static volatile dssr<dvav> g;
    public int a;
    public int c;
    public int d;
    private byte f = 2;
    public dsrj<dvay> b = dssu.b;

    static {
        dvav dvavVar = new dvav();
        e = dvavVar;
        dsqw.cc(dvav.class, dvavVar);
    }

    private dvav() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0001\u0001Л\u0002င\u0000\u0003ဌ\u0001", new Object[]{"a", "b", dvay.class, "c", "d", dqjl.c()});
            }
            if (i2 == 3) {
                return new dvav();
            }
            if (i2 == 4) {
                return new dvau();
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
            dssr<dvav> dssrVar = g;
            if (dssrVar == null) {
                synchronized (dvav.class) {
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
