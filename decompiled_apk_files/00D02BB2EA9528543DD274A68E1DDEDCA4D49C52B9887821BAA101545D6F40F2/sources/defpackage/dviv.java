package defpackage;
/* compiled from: PG */
/* renamed from: dviv  reason: default package */
/* loaded from: classes6.dex */
public final class dviv extends dsqw<dviv, dviu> implements dssk {
    public static final dviv b;
    private static volatile dssr<dviv> e;
    public dviw a;
    private int c;
    private byte d = 2;

    static {
        dviv dvivVar = new dviv();
        b = dvivVar;
        dsqw.cc(dviv.class, dvivVar);
    }

    private dviv() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b2 = 1;
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0001\u0002ᐉ\u0001", new Object[]{"c", "a"});
            }
            if (i2 == 3) {
                return new dviv();
            }
            if (i2 == 4) {
                return new dviu();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b2 = 0;
                }
                this.d = b2;
                return null;
            }
            dssr<dviv> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dviv.class) {
                    dssrVar = e;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(b);
                        e = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.d);
    }
}
