package defpackage;
/* compiled from: PG */
/* renamed from: dvwh  reason: default package */
/* loaded from: classes6.dex */
public final class dvwh extends dsqw<dvwh, dvwg> implements dssk {
    public static final dvwh e;
    private static volatile dssr<dvwh> g;
    public String a = "";
    public String b = "";
    public String c = "";
    public dnpq d;
    private int f;

    static {
        dvwh dvwhVar = new dvwh();
        e = dvwhVar;
        dsqw.cc(dvwh.class, dvwhVar);
    }

    private dvwh() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(e, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဉ\u0003", new Object[]{"f", "a", "b", "c", "d"});
            }
            if (i2 == 3) {
                return new dvwh();
            }
            if (i2 == 4) {
                return new dvwg();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dvwh> dssrVar = g;
            if (dssrVar == null) {
                synchronized (dvwh.class) {
                    dssrVar = g;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(e);
                        g = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
