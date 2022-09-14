package defpackage;
/* compiled from: PG */
/* renamed from: dvgy  reason: default package */
/* loaded from: classes6.dex */
public final class dvgy extends dsqw<dvgy, dvgx> implements dssk {
    public static final dvgy b;
    private static volatile dssr<dvgy> d;
    private byte c = 2;
    public dsrj<dvhk> a = dssu.b;

    static {
        dvgy dvgyVar = new dvgy();
        b = dvgyVar;
        dsqw.cc(dvgy.class, dvgyVar);
    }

    private dvgy() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b2 = 1;
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0000\u0004\u0004\u0001\u0000\u0001\u0001\u0004Л", new Object[]{"a", dvhk.class});
            }
            if (i2 == 3) {
                return new dvgy();
            }
            if (i2 == 4) {
                return new dvgx();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b2 = 0;
                }
                this.c = b2;
                return null;
            }
            dssr<dvgy> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dvgy.class) {
                    dssrVar = d;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(b);
                        d = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.c);
    }
}
