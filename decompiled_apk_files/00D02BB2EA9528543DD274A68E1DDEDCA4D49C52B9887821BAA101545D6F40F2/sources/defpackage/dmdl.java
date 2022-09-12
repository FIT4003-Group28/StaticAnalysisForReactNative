package defpackage;
/* compiled from: PG */
/* renamed from: dmdl  reason: default package */
/* loaded from: classes6.dex */
public final class dmdl extends dsqw<dmdl, dmdk> implements dssk {
    public static final dmdl a;
    public static final dsqv<dmch, dmdl> b;
    private static volatile dssr<dmdl> c;

    static {
        dmdl dmdlVar = new dmdl();
        a = dmdlVar;
        dsqw.cc(dmdl.class, dmdlVar);
        b = dsqw.newSingularGeneratedExtension(dmch.d, dmdlVar, dmdlVar, null, 1016, dsur.MESSAGE, dmdl.class);
    }

    private dmdl() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(a, "\u0001\u0000", null);
            }
            if (i2 == 3) {
                return new dmdl();
            }
            if (i2 == 4) {
                return new dmdk();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dmdl> dssrVar = c;
            if (dssrVar == null) {
                synchronized (dmdl.class) {
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
