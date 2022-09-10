package defpackage;
/* compiled from: PG */
/* renamed from: dmcz  reason: default package */
/* loaded from: classes6.dex */
public final class dmcz extends dsqw<dmcz, dmcy> implements dssk {
    public static final dmcz e;
    public static final dsqv<dmch, dmcz> f;
    private static volatile dssr<dmcz> g;
    public int a;
    public int c;
    public String b = "";
    public String d = "";

    static {
        dmcz dmczVar = new dmcz();
        e = dmczVar;
        dsqw.cc(dmcz.class, dmczVar);
        f = dsqw.newSingularGeneratedExtension(dmch.d, dmczVar, dmczVar, null, 1010, dsur.MESSAGE, dmcz.class);
    }

    private dmcz() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဌ\u0001\u0003ဈ\u0002", new Object[]{"a", "b", "c", dmed.a, "d"});
            }
            if (i2 == 3) {
                return new dmcz();
            }
            if (i2 == 4) {
                return new dmcy();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dmcz> dssrVar = g;
            if (dssrVar == null) {
                synchronized (dmcz.class) {
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
