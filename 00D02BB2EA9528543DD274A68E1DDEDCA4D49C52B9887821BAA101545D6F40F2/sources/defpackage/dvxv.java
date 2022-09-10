package defpackage;
/* compiled from: PG */
/* renamed from: dvxv  reason: default package */
/* loaded from: classes6.dex */
public final class dvxv extends dsqw<dvxv, dvxu> implements dssk {
    public static final dvxv e;
    private static volatile dssr<dvxv> f;
    public int a;
    public boolean c;
    public dsrj<dhkd> b = dssu.b;
    public String d = "";

    static {
        dvxv dvxvVar = new dvxv();
        e = dvxvVar;
        dsqw.cc(dvxv.class, dvxvVar);
    }

    private dvxv() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u001b\u0002ဇ\u0000\u0003ဈ\u0001", new Object[]{"a", "b", dhkd.class, "c", "d"});
            }
            if (i2 == 3) {
                return new dvxv();
            }
            if (i2 == 4) {
                return new dvxu();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dvxv> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dvxv.class) {
                    dssrVar = f;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(e);
                        f = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
