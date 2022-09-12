package defpackage;
/* compiled from: PG */
/* renamed from: dvfo  reason: default package */
/* loaded from: classes6.dex */
public final class dvfo extends dsqw<dvfo, dvfl> implements dssk {
    public static final dvfo c;
    private static volatile dssr<dvfo> e;
    public int a;
    public int b;
    private byte d = 2;

    static {
        dvfo dvfoVar = new dvfo();
        c = dvfoVar;
        dsqw.cc(dvfo.class, dvfoVar);
    }

    private dvfo() {
        dssu<Object> dssuVar = dssu.b;
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0004\u0004\u0001\u0000\u0000\u0000\u0004ဌ\u0002", new Object[]{"a", "b", dvfm.a});
            }
            if (i2 == 3) {
                return new dvfo();
            }
            if (i2 == 4) {
                return new dvfl();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.d = b;
                return null;
            }
            dssr<dvfo> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dvfo.class) {
                    dssrVar = e;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(c);
                        e = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.d);
    }
}
