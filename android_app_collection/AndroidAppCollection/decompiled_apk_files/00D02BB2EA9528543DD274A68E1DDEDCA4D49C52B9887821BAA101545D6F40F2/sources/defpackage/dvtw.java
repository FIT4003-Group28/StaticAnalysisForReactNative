package defpackage;
/* compiled from: PG */
/* renamed from: dvtw  reason: default package */
/* loaded from: classes.dex */
public final class dvtw extends dsqw<dvtw, dvtv> implements dssk {
    public static final dvtw a;
    private static volatile dssr<dvtw> b;

    static {
        dvtw dvtwVar = new dvtw();
        a = dvtwVar;
        dsqw.cc(dvtw.class, dvtwVar);
    }

    private dvtw() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(a, "\u0001\u0000", null);
            }
            if (i2 == 3) {
                return new dvtw();
            }
            if (i2 == 4) {
                return new dvtv();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dvtw> dssrVar = b;
            if (dssrVar == null) {
                synchronized (dvtw.class) {
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
