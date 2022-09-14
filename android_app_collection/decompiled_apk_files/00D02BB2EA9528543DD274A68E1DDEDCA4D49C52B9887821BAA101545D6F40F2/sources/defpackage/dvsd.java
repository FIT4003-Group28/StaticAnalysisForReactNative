package defpackage;
/* compiled from: PG */
/* renamed from: dvsd  reason: default package */
/* loaded from: classes6.dex */
public final class dvsd extends dsqw<dvsd, dvsc> implements dssk {
    public static final dvsd a;
    private static volatile dssr<dvsd> f;
    private int b;
    private dgrh c;
    private dulu d;
    private byte e = 2;

    static {
        dvsd dvsdVar = new dvsd();
        a = dvsdVar;
        dsqw.cc(dvsd.class, dvsdVar);
    }

    private dvsd() {
        dspd dspdVar = dspd.b;
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(a, "\u0001\u0002\u0000\u0001\u0003\u000e\u0002\u0000\u0000\u0002\u0003ᐉ\u0002\u000eᐉ\u0010", new Object[]{"b", "c", "d"});
            }
            if (i2 == 3) {
                return new dvsd();
            }
            if (i2 == 4) {
                return new dvsc();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.e = b;
                return null;
            }
            dssr<dvsd> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dvsd.class) {
                    dssrVar = f;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(a);
                        f = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.e);
    }
}
