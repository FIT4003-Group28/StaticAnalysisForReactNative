package defpackage;
/* compiled from: PG */
/* renamed from: dvfw  reason: default package */
/* loaded from: classes6.dex */
public final class dvfw extends dsqw<dvfw, dvfv> implements dssk {
    public static final dvfw d;
    private static volatile dssr<dvfw> f;
    public int a;
    public dwaw b;
    public dwbc c;
    private byte e = 2;

    static {
        dvfw dvfwVar = new dvfw();
        d = dvfwVar;
        dsqw.cc(dvfw.class, dvfwVar);
    }

    private dvfw() {
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
                return new dvfw();
            }
            if (i2 == 4) {
                return new dvfv();
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
            dssr<dvfw> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dvfw.class) {
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
