package defpackage;
/* compiled from: PG */
/* renamed from: dvfk  reason: default package */
/* loaded from: classes6.dex */
public final class dvfk extends dsqw<dvfk, dvfj> implements dssk {
    public static final dvfk a;
    private static volatile dssr<dvfk> c;
    private byte b = 2;

    static {
        dvfk dvfkVar = new dvfk();
        a = dvfkVar;
        dsqw.cc(dvfk.class, dvfkVar);
    }

    private dvfk() {
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
                return new dvfk();
            }
            if (i2 == 4) {
                return new dvfj();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                this.b = obj == null ? (byte) 0 : (byte) 1;
                return null;
            }
            dssr<dvfk> dssrVar = c;
            if (dssrVar == null) {
                synchronized (dvfk.class) {
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
