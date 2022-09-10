package defpackage;
/* compiled from: PG */
/* renamed from: dviz  reason: default package */
/* loaded from: classes.dex */
public final class dviz extends dsqw<dviz, dviy> implements dssk {
    public static final dviz f;
    private static volatile dssr<dviz> h;
    public int a;
    public dqpe c;
    public djrs d;
    public int e;
    private byte g = 2;
    public String b = "";

    static {
        dviz dvizVar = new dviz();
        f = dvizVar;
        dsqw.cc(dviz.class, dvizVar);
    }

    private dviz() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0001\u0001ဉ\u0001\u0002ᐉ\u0002\u0003ဌ\u0003\u0004ဈ\u0000", new Object[]{"a", "c", "d", "e", drbs.a, "b"});
            }
            if (i2 == 3) {
                return new dviz();
            }
            if (i2 == 4) {
                return new dviy();
            }
            if (i2 == 5) {
                return f;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.g = b;
                return null;
            }
            dssr<dviz> dssrVar = h;
            if (dssrVar == null) {
                synchronized (dviz.class) {
                    dssrVar = h;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(f);
                        h = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.g);
    }
}
