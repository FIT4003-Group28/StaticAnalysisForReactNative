package defpackage;
/* compiled from: PG */
/* renamed from: dimw  reason: default package */
/* loaded from: classes6.dex */
public final class dimw extends dsqw<dimw, dimv> implements dssk {
    public static final dimw a;
    private static volatile dssr<dimw> e;
    private int b;
    private dnqh c;
    private byte d = 2;

    static {
        dimw dimwVar = new dimw();
        a = dimwVar;
        dsqw.cc(dimw.class, dimwVar);
    }

    private dimw() {
        dspd dspdVar = dspd.b;
        dssu<Object> dssuVar = dssu.b;
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(a, "\u0001\u0001\u0000\u0001\u0005\u0005\u0001\u0000\u0000\u0001\u0005ᐉ\u0003", new Object[]{"b", "c"});
            }
            if (i2 == 3) {
                return new dimw();
            }
            if (i2 == 4) {
                return new dimv();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.d = b;
                return null;
            }
            dssr<dimw> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dimw.class) {
                    dssrVar = e;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(a);
                        e = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.d);
    }
}
