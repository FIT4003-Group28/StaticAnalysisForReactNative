package defpackage;
/* compiled from: PG */
/* renamed from: dvbr  reason: default package */
/* loaded from: classes6.dex */
public final class dvbr extends dsqw<dvbr, dvbq> implements dssk {
    public static final dvbr c;
    private static volatile dssr<dvbr> e;
    public String a = "";
    public String b = "";
    private int d;

    static {
        dvbr dvbrVar = new dvbr();
        c = dvbrVar;
        dsqw.cc(dvbr.class, dvbrVar);
    }

    private dvbr() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"d", "a", "b"});
            }
            if (i2 == 3) {
                return new dvbr();
            }
            if (i2 == 4) {
                return new dvbq();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dvbr> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dvbr.class) {
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
