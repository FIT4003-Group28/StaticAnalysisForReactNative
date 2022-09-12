package defpackage;
/* compiled from: PG */
/* renamed from: dvtg  reason: default package */
/* loaded from: classes6.dex */
public final class dvtg extends dsqw<dvtg, dvtf> implements dssk {
    public static final dvtg a;
    private static volatile dssr<dvtg> b;

    static {
        dvtg dvtgVar = new dvtg();
        a = dvtgVar;
        dsqw.cc(dvtg.class, dvtgVar);
    }

    private dvtg() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(a, "\u0001\u0000", null);
            }
            if (i2 == 3) {
                return new dvtg();
            }
            if (i2 == 4) {
                return new dvtf();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dvtg> dssrVar = b;
            if (dssrVar == null) {
                synchronized (dvtg.class) {
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
