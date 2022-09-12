package defpackage;
/* compiled from: PG */
/* renamed from: dvhm  reason: default package */
/* loaded from: classes.dex */
public final class dvhm extends dsqw<dvhm, dvhl> implements dssk {
    public static final dvhm d;
    private static volatile dssr<dvhm> f;
    public String a = "";
    public String b = "";
    public dqpe c;
    private int e;

    static {
        dvhm dvhmVar = new dvhm();
        d = dvhmVar;
        dsqw.cc(dvhm.class, dvhmVar);
    }

    private dvhm() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0004ဉ\u0003", new Object[]{"e", "a", "b", "c"});
            }
            if (i2 == 3) {
                return new dvhm();
            }
            if (i2 == 4) {
                return new dvhl();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dvhm> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dvhm.class) {
                    dssrVar = f;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(d);
                        f = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
