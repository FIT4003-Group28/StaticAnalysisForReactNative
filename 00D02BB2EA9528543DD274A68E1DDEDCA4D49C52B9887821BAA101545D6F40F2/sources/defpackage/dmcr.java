package defpackage;
/* compiled from: PG */
/* renamed from: dmcr  reason: default package */
/* loaded from: classes6.dex */
public final class dmcr extends dsqw<dmcr, dmco> implements dssk {
    public static final dmcr c;
    public static final dsqv<dmcj, dmcr> d;
    private static volatile dssr<dmcr> f;
    public int a;
    public String b = "";
    private int e;

    static {
        dmcr dmcrVar = new dmcr();
        c = dmcrVar;
        dsqw.cc(dmcr.class, dmcrVar);
        d = dsqw.newSingularGeneratedExtension(dmcj.d, dmcrVar, dmcrVar, null, 1000, dsur.MESSAGE, dmcr.class);
    }

    private dmcr() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဈ\u0001", new Object[]{"e", "a", dmcp.a, "b"});
            }
            if (i2 == 3) {
                return new dmcr();
            }
            if (i2 == 4) {
                return new dmco();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dmcr> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dmcr.class) {
                    dssrVar = f;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(c);
                        f = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
