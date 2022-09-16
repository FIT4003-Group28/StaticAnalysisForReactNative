package defpackage;
/* compiled from: PG */
/* renamed from: dkbm  reason: default package */
/* loaded from: classes6.dex */
public final class dkbm extends dsqw<dkbm, dkbl> implements dssk {
    public static final dkbm a;
    private static volatile dssr<dkbm> b;

    static {
        dkbm dkbmVar = new dkbm();
        a = dkbmVar;
        dsqw.cc(dkbm.class, dkbmVar);
    }

    private dkbm() {
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
                return new dkbm();
            }
            if (i2 == 4) {
                return new dkbl();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dkbm> dssrVar = b;
            if (dssrVar == null) {
                synchronized (dkbm.class) {
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
