package defpackage;
/* compiled from: PG */
/* renamed from: dvgk  reason: default package */
/* loaded from: classes6.dex */
public final class dvgk extends dsqw<dvgk, dvgj> implements dssk {
    public static final dvgk d;
    private static volatile dssr<dvgk> f;
    public int a;
    public dwir b;
    public dwiv c;
    private byte e = 2;

    static {
        dvgk dvgkVar = new dvgk();
        d = dvgkVar;
        dsqw.cc(dvgk.class, dvgkVar);
    }

    private dvgk() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0002\u0001ᐉ\u0000\u0002ᐉ\u0001", new Object[]{"a", "b", "c"});
            }
            if (i2 == 3) {
                return new dvgk();
            }
            if (i2 == 4) {
                return new dvgj();
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
            dssr<dvgk> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dvgk.class) {
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
