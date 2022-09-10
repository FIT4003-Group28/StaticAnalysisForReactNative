package defpackage;
/* compiled from: PG */
/* renamed from: dvbp  reason: default package */
/* loaded from: classes6.dex */
public final class dvbp extends dsqw<dvbp, dvbk> implements dssk {
    public static final dvbp c;
    private static volatile dssr<dvbp> e;
    public int a;
    public dsrj<dvbm> b = dssu.b;
    private int d;

    static {
        dvbp dvbpVar = new dvbp();
        c = dvbpVar;
        dsqw.cc(dvbp.class, dvbpVar);
    }

    private dvbp() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဌ\u0000\u0002\u001b", new Object[]{"d", "a", dvbn.a, "b", dvbm.class});
            }
            if (i2 == 3) {
                return new dvbp();
            }
            if (i2 == 4) {
                return new dvbk();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dvbp> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dvbp.class) {
                    dssrVar = e;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(c);
                        e = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
