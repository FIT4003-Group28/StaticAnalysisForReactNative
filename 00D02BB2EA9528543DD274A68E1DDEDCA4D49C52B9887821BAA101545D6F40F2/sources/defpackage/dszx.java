package defpackage;
/* compiled from: PG */
/* renamed from: dszx  reason: default package */
/* loaded from: classes6.dex */
public final class dszx extends dsqw<dszx, dszv> implements dssk {
    public static final dszx a;
    private static volatile dssr<dszx> f;
    private int b;
    private dtac c;
    private dssd<String, dtae> d = dssd.b;
    private byte e = 2;

    static {
        dszx dszxVar = new dszx();
        a = dszxVar;
        dsqw.cc(dszx.class, dszxVar);
    }

    private dszx() {
        dssu<Object> dssuVar = dssu.b;
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(a, "\u0001\u0002\u0000\u0001\u0003\n\u0002\u0001\u0000\u0002\u0003в\nᐉ\u0003", new Object[]{"b", "d", dszw.a, "c"});
            }
            if (i2 == 3) {
                return new dszx();
            }
            if (i2 == 4) {
                return new dszv();
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
            dssr<dszx> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dszx.class) {
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
