package defpackage;
/* compiled from: PG */
/* renamed from: dmeo  reason: default package */
/* loaded from: classes6.dex */
public final class dmeo extends dsqw<dmeo, dmen> implements dssk {
    public static final dmeo a;
    public static final dsqv<dmfs, dmeo> b;
    private static volatile dssr<dmeo> c;

    static {
        dmeo dmeoVar = new dmeo();
        a = dmeoVar;
        dsqw.cc(dmeo.class, dmeoVar);
        b = dsqw.newSingularGeneratedExtension(dmfs.c, dmeoVar, dmeoVar, null, 1034, dsur.MESSAGE, dmeo.class);
    }

    private dmeo() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(a, "\u0001\u0000", null);
            }
            if (i2 == 3) {
                return new dmeo();
            }
            if (i2 == 4) {
                return new dmen();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dmeo> dssrVar = c;
            if (dssrVar == null) {
                synchronized (dmeo.class) {
                    dssrVar = c;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(a);
                        c = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
