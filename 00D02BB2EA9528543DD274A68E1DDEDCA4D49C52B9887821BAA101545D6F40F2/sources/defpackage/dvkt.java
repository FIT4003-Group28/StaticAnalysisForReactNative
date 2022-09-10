package defpackage;
/* compiled from: PG */
/* renamed from: dvkt  reason: default package */
/* loaded from: classes6.dex */
public final class dvkt extends dsqw<dvkt, dvks> implements dssk {
    public static final dvkt a;
    private static volatile dssr<dvkt> c;
    private byte b = 2;

    static {
        dvkt dvktVar = new dvkt();
        a = dvktVar;
        dsqw.cc(dvkt.class, dvktVar);
    }

    private dvkt() {
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
                return new dvkt();
            }
            if (i2 == 4) {
                return new dvks();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                this.b = obj == null ? (byte) 0 : (byte) 1;
                return null;
            }
            dssr<dvkt> dssrVar = c;
            if (dssrVar == null) {
                synchronized (dvkt.class) {
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
