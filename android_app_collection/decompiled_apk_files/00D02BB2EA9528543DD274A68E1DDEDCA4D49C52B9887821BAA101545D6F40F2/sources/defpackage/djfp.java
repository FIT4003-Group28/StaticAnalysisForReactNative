package defpackage;
/* compiled from: PG */
/* renamed from: djfp  reason: default package */
/* loaded from: classes6.dex */
public final class djfp extends dsqw<djfp, djfo> implements dssk {
    public static final djfp f;
    private static volatile dssr<djfp> g;
    public int a;
    public String b = "";
    public String c = "";
    public String d = "";
    public dqei e;

    static {
        djfp djfpVar = new djfp();
        f = djfpVar;
        dsqw.cc(djfp.class, djfpVar);
    }

    private djfp() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဉ\u0003\u0004ဈ\u0002", new Object[]{"a", "b", "c", "e", "d"});
            }
            if (i2 == 3) {
                return new djfp();
            }
            if (i2 == 4) {
                return new djfo();
            }
            if (i2 == 5) {
                return f;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<djfp> dssrVar = g;
            if (dssrVar == null) {
                synchronized (djfp.class) {
                    dssrVar = g;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(f);
                        g = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
