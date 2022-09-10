package defpackage;
/* compiled from: PG */
/* renamed from: dvgc  reason: default package */
/* loaded from: classes6.dex */
public final class dvgc extends dsqw<dvgc, dvgb> implements dssk {
    public static final dvgc e;
    private static volatile dssr<dvgc> g;
    public int a;
    public dlug b;
    public dvfc c;
    public dloe d;
    private byte f = 2;

    static {
        dvgc dvgcVar = new dvgc();
        e = dvgcVar;
        dsqw.cc(dvgc.class, dvgcVar);
    }

    private dvgc() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(e, "\u0001\u0003\u0000\u0001\u0001\u0005\u0003\u0000\u0000\u0002\u0001ᐉ\u0000\u0002ᐉ\u0001\u0005ဉ\u0002", new Object[]{"a", "b", "c", "d"});
            }
            if (i2 == 3) {
                return new dvgc();
            }
            if (i2 == 4) {
                return new dvgb();
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
            dssr<dvgc> dssrVar = g;
            if (dssrVar == null) {
                synchronized (dvgc.class) {
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
