package defpackage;
/* compiled from: PG */
/* renamed from: dvus  reason: default package */
/* loaded from: classes6.dex */
public final class dvus extends dsqw<dvus, dvur> implements dssk {
    public static final dvus c;
    private static volatile dssr<dvus> f;
    public dvva a;
    public dvuw b;
    private int d;
    private byte e = 2;

    static {
        dvus dvusVar = new dvus();
        c = dvusVar;
        dsqw.cc(dvus.class, dvusVar);
    }

    private dvus() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(c, "\u0001\u0002\u0000\u0001\u0002\u0005\u0002\u0000\u0000\u0002\u0002ᐉ\u0001\u0005ᐉ\u0002", new Object[]{"d", "a", "b"});
            }
            if (i2 == 3) {
                return new dvus();
            }
            if (i2 == 4) {
                return new dvur();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.e = b;
                return null;
            }
            dssr<dvus> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dvus.class) {
                    dssrVar = f;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(c);
                        f = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.e);
    }
}
