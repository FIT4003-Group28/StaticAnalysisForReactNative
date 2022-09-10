package defpackage;
/* compiled from: PG */
/* renamed from: dvni  reason: default package */
/* loaded from: classes6.dex */
public final class dvni extends dsqw<dvni, dvnh> implements dssk {
    public static final dvni a;
    private static volatile dssr<dvni> c;
    private byte b = 2;

    static {
        dvni dvniVar = new dvni();
        a = dvniVar;
        dsqw.cc(dvni.class, dvniVar);
    }

    private dvni() {
        dssu<Object> dssuVar = dssu.b;
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(a, "\u0001\u0000", null);
            }
            if (i2 == 3) {
                return new dvni();
            }
            if (i2 == 4) {
                return new dvnh();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                this.b = obj == null ? (byte) 0 : (byte) 1;
                return null;
            }
            dssr<dvni> dssrVar = c;
            if (dssrVar == null) {
                synchronized (dvni.class) {
                    dssrVar = c;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(a);
                        c = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.b);
    }
}
