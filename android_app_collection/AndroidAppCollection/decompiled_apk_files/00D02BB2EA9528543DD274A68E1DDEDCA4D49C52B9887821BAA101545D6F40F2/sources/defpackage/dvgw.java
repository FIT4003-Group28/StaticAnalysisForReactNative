package defpackage;
/* compiled from: PG */
/* renamed from: dvgw  reason: default package */
/* loaded from: classes.dex */
public final class dvgw extends dsqw<dvgw, dvgv> implements dssk {
    public static final dvgw d;
    private static volatile dssr<dvgw> g;
    public dqpe a;
    public int c;
    private int e;
    private byte f = 2;
    public dsrj<dvgy> b = dssu.b;

    static {
        dvgw dvgwVar = new dvgw();
        d = dvgwVar;
        dsqw.cc(dvgw.class, dvgwVar);
    }

    private dvgw() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(d, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0001\u0001ဉ\u0001\u0002Л\u0003ဌ\u0003", new Object[]{"e", "a", "b", dvgy.class, "c", drbs.a});
            }
            if (i2 == 3) {
                return new dvgw();
            }
            if (i2 == 4) {
                return new dvgv();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.f = b;
                return null;
            }
            dssr<dvgw> dssrVar = g;
            if (dssrVar == null) {
                synchronized (dvgw.class) {
                    dssrVar = g;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(d);
                        g = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.f);
    }
}
