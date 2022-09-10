package defpackage;
/* compiled from: PG */
/* renamed from: dvfe  reason: default package */
/* loaded from: classes6.dex */
public final class dvfe extends dsqw<dvfe, dvfd> implements dssk {
    public static final dvfe d;
    private static volatile dssr<dvfe> f;
    public int a;
    public boolean b;
    public boolean c;
    private byte e = 2;

    static {
        dvfe dvfeVar = new dvfe();
        d = dvfeVar;
        dsqw.cc(dvfe.class, dvfeVar);
    }

    private dvfe() {
        dssu<Object> dssuVar = dssu.b;
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0002\u0003\u0002\u0000\u0000\u0000\u0002ဇ\u0000\u0003ဇ\u0001", new Object[]{"a", "b", "c"});
            }
            if (i2 == 3) {
                return new dvfe();
            }
            if (i2 == 4) {
                return new dvfd();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.e = b;
                return null;
            }
            dssr<dvfe> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dvfe.class) {
                    dssrVar = f;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(d);
                        f = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.e);
    }
}
