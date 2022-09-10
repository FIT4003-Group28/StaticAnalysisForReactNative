package defpackage;
/* compiled from: PG */
/* renamed from: dvzr  reason: default package */
/* loaded from: classes6.dex */
public final class dvzr extends dsqs<dvzr, dvzq> implements dsqt {
    public static final dvzr a;
    private static volatile dssr<dvzr> c;
    private byte b = 2;

    static {
        dvzr dvzrVar = new dvzr();
        a = dvzrVar;
        dsqw.cc(dvzr.class, dvzrVar);
    }

    private dvzr() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(a, "\u0001\u0000", null);
            }
            if (i2 == 3) {
                return new dvzr();
            }
            if (i2 == 4) {
                return new dvzq();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                this.b = obj == null ? (byte) 0 : (byte) 1;
                return null;
            }
            dssr<dvzr> dssrVar = c;
            if (dssrVar == null) {
                synchronized (dvzr.class) {
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
