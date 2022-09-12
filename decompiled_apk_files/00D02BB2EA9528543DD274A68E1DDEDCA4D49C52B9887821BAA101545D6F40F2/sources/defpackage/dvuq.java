package defpackage;
/* compiled from: PG */
/* renamed from: dvuq  reason: default package */
/* loaded from: classes6.dex */
public final class dvuq extends dsqw<dvuq, dvup> implements dssk {
    public static final dvuq f;
    private static volatile dssr<dvuq> h;
    public int a;
    public dvyw b;
    public String d;
    public dndc e;
    private byte g = 2;
    public String c = "";

    static {
        dvuq dvuqVar = new dvuq();
        f = dvuqVar;
        dsqw.cc(dvuq.class, dvuqVar);
    }

    private dvuq() {
        dssu<Object> dssuVar = dssu.b;
        this.d = "";
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(f, "\u0001\u0004\u0000\u0001\u0001\n\u0004\u0000\u0000\u0001\u0001ᐉ\u0000\u0003ဈ\u0002\u0005ဈ\u0003\nဉ\u0007", new Object[]{"a", "b", "c", "d", "e"});
            }
            if (i2 == 3) {
                return new dvuq();
            }
            if (i2 == 4) {
                return new dvup();
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
            dssr<dvuq> dssrVar = h;
            if (dssrVar == null) {
                synchronized (dvuq.class) {
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
