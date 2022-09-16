package defpackage;
/* compiled from: PG */
/* renamed from: dvbg  reason: default package */
/* loaded from: classes6.dex */
public final class dvbg extends dsqw<dvbg, dvbf> implements dssk {
    public static final dvbg a;
    private static volatile dssr<dvbg> b;

    static {
        dvbg dvbgVar = new dvbg();
        a = dvbgVar;
        dsqw.cc(dvbg.class, dvbgVar);
    }

    private dvbg() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(a, "\u0001\u0000", null);
            }
            if (i2 == 3) {
                return new dvbg();
            }
            if (i2 == 4) {
                return new dvbf();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dvbg> dssrVar = b;
            if (dssrVar == null) {
                synchronized (dvbg.class) {
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
