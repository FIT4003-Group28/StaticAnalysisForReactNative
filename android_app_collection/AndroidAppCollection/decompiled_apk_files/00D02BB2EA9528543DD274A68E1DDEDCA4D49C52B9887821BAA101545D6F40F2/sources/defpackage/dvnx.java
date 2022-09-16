package defpackage;
/* compiled from: PG */
/* renamed from: dvnx  reason: default package */
/* loaded from: classes6.dex */
public final class dvnx extends dsqw<dvnx, dvnw> implements dssk {
    public static final dvnx a;
    private static volatile dssr<dvnx> c;
    private byte b = 2;

    static {
        dvnx dvnxVar = new dvnx();
        a = dvnxVar;
        dsqw.cc(dvnx.class, dvnxVar);
    }

    private dvnx() {
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
                return new dvnx();
            }
            if (i2 == 4) {
                return new dvnw();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                this.b = obj == null ? (byte) 0 : (byte) 1;
                return null;
            }
            dssr<dvnx> dssrVar = c;
            if (dssrVar == null) {
                synchronized (dvnx.class) {
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
