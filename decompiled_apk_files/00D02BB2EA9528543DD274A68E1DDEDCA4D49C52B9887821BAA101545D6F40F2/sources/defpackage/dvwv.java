package defpackage;
/* compiled from: PG */
/* renamed from: dvwv  reason: default package */
/* loaded from: classes6.dex */
public final class dvwv extends dsqw<dvwv, dvwu> implements dssk {
    public static final dvwv d;
    private static volatile dssr<dvwv> f;
    public int a;
    public dvyw c;
    private byte e = 2;
    public String b = "";

    static {
        dvwv dvwvVar = new dvwv();
        d = dvwvVar;
        dsqw.cc(dvwv.class, dvwvVar);
    }

    private dvwv() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001ဈ\u0000\u0002ᐉ\u0001", new Object[]{"a", "b", "c"});
            }
            if (i2 == 3) {
                return new dvwv();
            }
            if (i2 == 4) {
                return new dvwu();
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
            dssr<dvwv> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dvwv.class) {
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
