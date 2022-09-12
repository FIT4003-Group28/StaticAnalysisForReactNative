package defpackage;
/* compiled from: PG */
/* renamed from: dvwl  reason: default package */
/* loaded from: classes6.dex */
public final class dvwl extends dsqw<dvwl, dvwk> implements dssk {
    public static final dvwl d;
    private static volatile dssr<dvwl> f;
    public int a;
    public dvwc b;
    public dopk c;
    private byte e = 2;

    static {
        dvwl dvwlVar = new dvwl();
        d = dvwlVar;
        dsqw.cc(dvwl.class, dvwlVar);
    }

    private dvwl() {
        dssu<Object> dssuVar = dssu.b;
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0005\u0006\u0002\u0000\u0000\u0001\u0005ဉ\u0003\u0006ᐉ\u0004", new Object[]{"a", "b", "c"});
            }
            if (i2 == 3) {
                return new dvwl();
            }
            if (i2 == 4) {
                return new dvwk();
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
            dssr<dvwl> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dvwl.class) {
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
