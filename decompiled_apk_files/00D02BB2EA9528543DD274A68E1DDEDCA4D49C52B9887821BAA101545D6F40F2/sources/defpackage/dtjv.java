package defpackage;
/* compiled from: PG */
/* renamed from: dtjv  reason: default package */
/* loaded from: classes6.dex */
public final class dtjv extends dsqw<dtjv, dtju> implements dssk {
    public static final dtjv d;
    private static volatile dssr<dtjv> f;
    public int a;
    public int b;
    public dwao c;
    private byte e = 2;

    static {
        dtjv dtjvVar = new dtjv();
        d = dtjvVar;
        dsqw.cc(dtjv.class, dtjvVar);
    }

    private dtjv() {
        dssu<Object> dssuVar = dssu.b;
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0006\u0007\u0002\u0000\u0000\u0000\u0006ဉ\u0002\u0007ဌ\u0000", new Object[]{"a", "c", "b", dqvj.d()});
            }
            if (i2 == 3) {
                return new dtjv();
            }
            if (i2 == 4) {
                return new dtju();
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
            dssr<dtjv> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dtjv.class) {
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
