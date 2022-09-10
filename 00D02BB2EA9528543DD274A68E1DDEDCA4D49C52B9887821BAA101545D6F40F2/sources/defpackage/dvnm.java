package defpackage;
/* compiled from: PG */
/* renamed from: dvnm  reason: default package */
/* loaded from: classes6.dex */
public final class dvnm extends dsqw<dvnm, dvnl> implements dssk {
    public static final dvnm a;
    private static volatile dssr<dvnm> b;

    static {
        dvnm dvnmVar = new dvnm();
        a = dvnmVar;
        dsqw.cc(dvnm.class, dvnmVar);
    }

    private dvnm() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(a, "\u0001\u0000", null);
            }
            if (i2 == 3) {
                return new dvnm();
            }
            if (i2 == 4) {
                return new dvnl();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dvnm> dssrVar = b;
            if (dssrVar == null) {
                synchronized (dvnm.class) {
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
