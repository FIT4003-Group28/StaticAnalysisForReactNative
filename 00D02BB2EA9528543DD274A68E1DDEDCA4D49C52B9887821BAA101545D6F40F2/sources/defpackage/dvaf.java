package defpackage;
/* compiled from: PG */
/* renamed from: dvaf  reason: default package */
/* loaded from: classes6.dex */
public final class dvaf extends dsqw<dvaf, dvae> implements dssk {
    public static final dvaf a;
    private static volatile dssr<dvaf> b;

    static {
        dvaf dvafVar = new dvaf();
        a = dvafVar;
        dsqw.cc(dvaf.class, dvafVar);
    }

    private dvaf() {
        dspd dspdVar = dspd.b;
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(a, "\u0001\u0000", null);
            }
            if (i2 == 3) {
                return new dvaf();
            }
            if (i2 == 4) {
                return new dvae();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dvaf> dssrVar = b;
            if (dssrVar == null) {
                synchronized (dvaf.class) {
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
