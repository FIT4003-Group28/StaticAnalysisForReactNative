package defpackage;
/* compiled from: PG */
/* renamed from: dmdr  reason: default package */
/* loaded from: classes6.dex */
public final class dmdr extends dsqw<dmdr, dmdq> implements dssk {
    public static final dmdr a;
    public static final dsqv<dmfs, dmdr> b;
    private static volatile dssr<dmdr> c;

    static {
        dmdr dmdrVar = new dmdr();
        a = dmdrVar;
        dsqw.cc(dmdr.class, dmdrVar);
        b = dsqw.newSingularGeneratedExtension(dmfs.c, dmdrVar, dmdrVar, null, 1001, dsur.MESSAGE, dmdr.class);
    }

    private dmdr() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(a, "\u0001\u0000", null);
            }
            if (i2 == 3) {
                return new dmdr();
            }
            if (i2 == 4) {
                return new dmdq();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dmdr> dssrVar = c;
            if (dssrVar == null) {
                synchronized (dmdr.class) {
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
