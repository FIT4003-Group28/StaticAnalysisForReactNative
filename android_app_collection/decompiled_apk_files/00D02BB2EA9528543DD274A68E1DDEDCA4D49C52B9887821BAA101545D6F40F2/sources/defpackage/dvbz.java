package defpackage;
/* compiled from: PG */
/* renamed from: dvbz  reason: default package */
/* loaded from: classes6.dex */
public final class dvbz extends dsqw<dvbz, dvby> implements dssk {
    public static final dvbz d;
    private static volatile dssr<dvbz> e;
    public int a;
    public String b = "";
    public String c = "";

    static {
        dvbz dvbzVar = new dvbz();
        d = dvbzVar;
        dsqw.cc(dvbz.class, dvbzVar);
    }

    private dvbz() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0003ဈ\u0002", new Object[]{"a", "b", "c"});
            }
            if (i2 == 3) {
                return new dvbz();
            }
            if (i2 == 4) {
                return new dvby();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dvbz> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dvbz.class) {
                    dssrVar = e;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(d);
                        e = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
