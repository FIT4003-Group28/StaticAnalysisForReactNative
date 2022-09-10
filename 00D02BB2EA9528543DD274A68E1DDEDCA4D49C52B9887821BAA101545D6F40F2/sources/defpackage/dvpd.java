package defpackage;
/* compiled from: PG */
/* renamed from: dvpd  reason: default package */
/* loaded from: classes6.dex */
public final class dvpd extends dsqw<dvpd, dvpc> implements dssk {
    public static final dvpd a;
    private static volatile dssr<dvpd> b;

    static {
        dvpd dvpdVar = new dvpd();
        a = dvpdVar;
        dsqw.cc(dvpd.class, dvpdVar);
    }

    private dvpd() {
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
                return new dvpd();
            }
            if (i2 == 4) {
                return new dvpc();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dvpd> dssrVar = b;
            if (dssrVar == null) {
                synchronized (dvpd.class) {
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
