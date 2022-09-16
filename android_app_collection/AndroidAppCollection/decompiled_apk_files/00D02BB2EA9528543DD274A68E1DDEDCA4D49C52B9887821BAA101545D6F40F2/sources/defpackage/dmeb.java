package defpackage;
/* compiled from: PG */
/* renamed from: dmeb  reason: default package */
/* loaded from: classes6.dex */
public final class dmeb extends dsqw<dmeb, dmea> implements dssk {
    public static final dmeb c;
    public static final dsqv<dmfs, dmeb> d;
    private static volatile dssr<dmeb> f;
    public String a = "";
    public String b = "";
    private int e;

    static {
        dmeb dmebVar = new dmeb();
        c = dmebVar;
        dsqw.cc(dmeb.class, dmebVar);
        d = dsqw.newSingularGeneratedExtension(dmfs.c, dmebVar, dmebVar, null, 1013, dsur.MESSAGE, dmeb.class);
    }

    private dmeb() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"e", "a", "b"});
            }
            if (i2 == 3) {
                return new dmeb();
            }
            if (i2 == 4) {
                return new dmea();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dmeb> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dmeb.class) {
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
