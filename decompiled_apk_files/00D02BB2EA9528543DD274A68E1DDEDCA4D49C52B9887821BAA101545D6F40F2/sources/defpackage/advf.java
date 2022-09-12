package defpackage;
/* compiled from: PG */
/* renamed from: advf  reason: default package */
/* loaded from: classes2.dex */
public final class advf extends dsqw<advf, adve> implements dssk {
    public static final advf b;
    private static volatile dssr<advf> d;
    private byte c = 2;
    public dsrj<dlcv> a = dssu.b;

    static {
        advf advfVar = new advf();
        b = advfVar;
        dsqw.cc(advf.class, advfVar);
    }

    private advf() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b2 = 1;
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001Л", new Object[]{"a", dlcv.class});
            }
            if (i2 == 3) {
                return new advf();
            }
            if (i2 == 4) {
                return new adve();
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
            dssr<advf> dssrVar = d;
            if (dssrVar == null) {
                synchronized (advf.class) {
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
