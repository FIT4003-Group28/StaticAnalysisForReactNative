package defpackage;
/* compiled from: PG */
/* renamed from: dmee  reason: default package */
/* loaded from: classes6.dex */
public final class dmee extends dsqw<dmee, dmec> implements dssk {
    public static final dmee d;
    public static final dsqv<dmfu, dmee> e;
    private static volatile dssr<dmee> f;
    public int a;
    public int b;
    public String c = "";

    static {
        dmee dmeeVar = new dmee();
        d = dmeeVar;
        dsqw.cc(dmee.class, dmeeVar);
        e = dsqw.newSingularGeneratedExtension(dmfu.e, dmeeVar, dmeeVar, null, 1003, dsur.MESSAGE, dmee.class);
    }

    private dmee() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဈ\u0001", new Object[]{"a", "b", dmed.a, "c"});
            }
            if (i2 == 3) {
                return new dmee();
            }
            if (i2 == 4) {
                return new dmec();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dmee> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dmee.class) {
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
