package defpackage;
/* compiled from: PG */
/* renamed from: dvjp  reason: default package */
/* loaded from: classes6.dex */
public final class dvjp extends dsqw<dvjp, dvjo> implements dssk {
    public static final dvjp c;
    private static volatile dssr<dvjp> f;
    public int a;
    private dnqh d;
    private byte e = 2;
    public String b = "";

    static {
        dvjp dvjpVar = new dvjp();
        c = dvjpVar;
        dsqw.cc(dvjp.class, dvjpVar);
    }

    private dvjp() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001ဈ\u0000\u0002ᐉ\u0001", new Object[]{"a", "b", "d"});
            }
            if (i2 == 3) {
                return new dvjp();
            }
            if (i2 == 4) {
                return new dvjo();
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
            dssr<dvjp> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dvjp.class) {
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
