package defpackage;
/* compiled from: PG */
/* renamed from: dmhi  reason: default package */
/* loaded from: classes6.dex */
public final class dmhi extends dsqw<dmhi, dmhf> implements dssk {
    public static final dmhi c;
    public static final dsqv<dmfs, dmhi> d;
    private static volatile dssr<dmhi> f;
    public int a;
    public int b;
    private int e;

    static {
        dmhi dmhiVar = new dmhi();
        c = dmhiVar;
        dsqw.cc(dmhi.class, dmhiVar);
        d = dsqw.newSingularGeneratedExtension(dmfs.c, dmhiVar, dmhiVar, null, 1031, dsur.MESSAGE, dmhi.class);
    }

    private dmhi() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001", new Object[]{"e", "a", dpyv.c(), "b", dmhh.c()});
            }
            if (i2 == 3) {
                return new dmhi();
            }
            if (i2 == 4) {
                return new dmhf();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dmhi> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dmhi.class) {
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
