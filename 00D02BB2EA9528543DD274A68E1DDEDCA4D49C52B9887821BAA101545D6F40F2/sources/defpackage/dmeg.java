package defpackage;
/* compiled from: PG */
/* renamed from: dmeg  reason: default package */
/* loaded from: classes6.dex */
public final class dmeg extends dsqw<dmeg, dmef> implements dssk {
    public static final dmeg b;
    public static final dsqv<dmfs, dmeg> c;
    private static volatile dssr<dmeg> d;
    public dsrj<dmdp> a = dssu.b;

    static {
        dmeg dmegVar = new dmeg();
        b = dmegVar;
        dsqw.cc(dmeg.class, dmegVar);
        c = dsqw.newSingularGeneratedExtension(dmfs.c, dmegVar, dmegVar, null, 1020, dsur.MESSAGE, dmeg.class);
    }

    private dmeg() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", dmdp.class});
            }
            if (i2 == 3) {
                return new dmeg();
            }
            if (i2 == 4) {
                return new dmef();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dmeg> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dmeg.class) {
                    dssrVar = d;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(b);
                        d = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
