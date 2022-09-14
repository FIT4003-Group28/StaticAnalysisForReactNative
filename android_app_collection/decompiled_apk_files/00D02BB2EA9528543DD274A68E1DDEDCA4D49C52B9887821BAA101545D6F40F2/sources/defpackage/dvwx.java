package defpackage;
/* compiled from: PG */
/* renamed from: dvwx  reason: default package */
/* loaded from: classes.dex */
public final class dvwx extends dsqw<dvwx, dvws> implements dssk {
    public static final dvwx b;
    private static volatile dssr<dvwx> d;
    private byte c = 2;
    public dsrj<dvww> a = dssu.b;

    static {
        dvwx dvwxVar = new dvwx();
        b = dvwxVar;
        dsqw.cc(dvwx.class, dvwxVar);
    }

    private dvwx() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b2 = 1;
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001Л", new Object[]{"a", dvww.class});
            }
            if (i2 == 3) {
                return new dvwx();
            }
            if (i2 == 4) {
                return new dvws();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b2 = 0;
                }
                this.c = b2;
                return null;
            }
            dssr<dvwx> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dvwx.class) {
                    dssrVar = d;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(b);
                        d = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.c);
    }
}
