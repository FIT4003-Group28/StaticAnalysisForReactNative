package defpackage;
/* compiled from: PG */
/* renamed from: dvxx  reason: default package */
/* loaded from: classes.dex */
public final class dvxx extends dsqw<dvxx, dvxw> implements dssk {
    public static final dvxx d;
    private static volatile dssr<dvxx> e;
    public int a;
    public String b = "";
    public String c = "";

    static {
        dvxx dvxxVar = new dvxx();
        d = dvxxVar;
        dsqw.cc(dvxx.class, dvxxVar);
    }

    private dvxx() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"a", "b", "c"});
            }
            if (i2 == 3) {
                return new dvxx();
            }
            if (i2 == 4) {
                return new dvxw();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dvxx> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dvxx.class) {
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
