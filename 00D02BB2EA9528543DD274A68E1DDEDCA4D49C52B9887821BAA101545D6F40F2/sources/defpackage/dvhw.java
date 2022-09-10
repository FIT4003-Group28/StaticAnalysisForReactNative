package defpackage;
/* compiled from: PG */
/* renamed from: dvhw  reason: default package */
/* loaded from: classes.dex */
public final class dvhw extends dsqw<dvhw, dvhv> implements dssk {
    public static final dvhw f;
    private static volatile dssr<dvhw> h;
    public int a;
    public dqpe c;
    public djrm d;
    public int e;
    private byte g = 2;
    public String b = "";

    static {
        dvhw dvhwVar = new dvhw();
        f = dvhwVar;
        dsqw.cc(dvhw.class, dvhwVar);
    }

    private dvhw() {
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
                return new dvhw();
            }
            if (i2 == 4) {
                return new dvhv();
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
            dssr<dvhw> dssrVar = h;
            if (dssrVar == null) {
                synchronized (dvhw.class) {
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
