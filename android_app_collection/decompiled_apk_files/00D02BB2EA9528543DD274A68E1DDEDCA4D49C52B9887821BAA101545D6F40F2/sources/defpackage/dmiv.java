package defpackage;
/* compiled from: PG */
/* renamed from: dmiv  reason: default package */
/* loaded from: classes6.dex */
public final class dmiv extends dsqw<dmiv, dmiu> implements dssk {
    public static final dmiv c;
    public static final dsqv<dmfs, dmiv> d;
    private static volatile dssr<dmiv> e;
    public int a;
    public dpuq b;

    static {
        dmiv dmivVar = new dmiv();
        c = dmivVar;
        dsqw.cc(dmiv.class, dmivVar);
        d = dsqw.newSingularGeneratedExtension(dmfs.c, dmivVar, dmivVar, null, 1016, dsur.MESSAGE, dmiv.class);
    }

    private dmiv() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"a", "b"});
            }
            if (i2 == 3) {
                return new dmiv();
            }
            if (i2 == 4) {
                return new dmiu();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dmiv> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dmiv.class) {
                    dssrVar = e;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(c);
                        e = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
