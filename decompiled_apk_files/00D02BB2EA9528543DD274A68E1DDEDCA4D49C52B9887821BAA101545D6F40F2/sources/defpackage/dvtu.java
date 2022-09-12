package defpackage;
/* compiled from: PG */
/* renamed from: dvtu  reason: default package */
/* loaded from: classes.dex */
public final class dvtu extends dsqw<dvtu, dvtt> implements dssk {
    public static final dvtu a;
    private static volatile dssr<dvtu> b;

    static {
        dvtu dvtuVar = new dvtu();
        a = dvtuVar;
        dsqw.cc(dvtu.class, dvtuVar);
    }

    private dvtu() {
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
                return new dvtu();
            }
            if (i2 == 4) {
                return new dvtt();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dvtu> dssrVar = b;
            if (dssrVar == null) {
                synchronized (dvtu.class) {
                    dssrVar = b;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(a);
                        b = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
